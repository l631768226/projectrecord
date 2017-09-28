package hsoft.mobile.projectrecord.service;

import hsoft.mobile.projectrecord.dao.UserDao;
import hsoft.mobile.projectrecord.model.CheckResult;
import hsoft.mobile.projectrecord.model.ProjectInfo;
import hsoft.mobile.projectrecord.model.User;
import hsoft.mobile.projectrecord.model.Validation;
import hsoft.mobile.projectrecord.utils.Common;
import hsoft.mobile.projectrecord.utils.FBase64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ValidationService validationService;
    @Autowired
    private TokenService tokenService;

    @Autowired
    private UserDao userDao;

    //本地测试时为true
    private boolean localtest = Common.localtest;

    @Override
    public String processCreate(Map<String, String> map) {
        return null;
    }


    /**
     * 校验用户是否登录以及权限校验(第一步)
     *
     * @param checkResult      校验结果信息
     * @param isCheckAuthority 是否校验用户权限
     */
    private void checkUser(CheckResult checkResult, boolean isCheckAuthority) {
        try {
            User user = tokenService.processUser();
            if (isCheckAuthority && user.getAuthority() != 1 && user.getAuthority() != 2) {
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("对不起，您没有权限");
            }
            checkResult.setOperatorId(user.getUserid());
        } catch (Exception e) { // 用户没有登录，返回信息
            e.printStackTrace();
            checkResult.setCheckCode(-400);
            checkResult.setCheckMsg("用户没有登录");
        }
    }

    /**
     * 将前端传入的数据置入model中(第二步)
     * @param map 前端传入的信息
     * @return 项目信息model
     * @throws UnsupportedEncodingException
     */
    private ProjectInfo processModel(Map<String, String> map) throws UnsupportedEncodingException {
        ProjectInfo projectInfo = new ProjectInfo();
        //项目编号
        String projIndex = map.get("projIndex");
        //项目名称
        String projName = map.get("projName");
        //项目描述
        String projDescription = map.get("projDescription");
        //项目负责人
        String projManagerStr = map.get("projManager");
        int projManager = 0;
        //部门来源
        String deptIdStr = map.get("deptId");
        int deptId = 0;
        //对协作部门的评价
        String projComment = map.get("projComment");
        //项目状态
        String projStatusStr = map.get("projStatus");
        int projStatus = 0;
        //项目评分
        String projScoreStr = map.get("projScore");
        float projScore = 0;

        if (!localtest) {
            projIndex = new String(FBase64.decode(projIndex));
            projName = new String(FBase64.decode(projName));
            projDescription = new String(FBase64.decode(projDescription));
            projComment = new String(FBase64.decode(projComment));

            projManagerStr = new String(FBase64.decode(projManagerStr));
            deptIdStr = new String(FBase64.decode(deptIdStr));
            projScoreStr = new String(FBase64.decode(projScoreStr));
        }
        projectInfo.setProjindex(projIndex);
        projectInfo.setProjname(projName);
        projectInfo.setProjdescription(projDescription);
        try {
            projManager = Integer.valueOf(projManagerStr);
            deptId = Integer.valueOf(deptIdStr);
            projStatus = Integer.valueOf(projStatusStr);
            projScore = Float.valueOf(projScoreStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        projectInfo.setProjmanager(projManager);
        projectInfo.setDeptid(deptId);
        projectInfo.setProjcomment(projComment);
        projectInfo.setStatuscategoryid(projStatus);
        projectInfo.setProjscore(projScore);

        return projectInfo;
    }

    /**
     * 校验项目信息 (第三步)
     *
     * @param projectInfo 项目信息model
     * @param checkResult 校验结果
     * @param isCreate    true创建时使用/false非创建时使用
     */
    private void processValidation(ProjectInfo projectInfo, CheckResult checkResult, boolean isCreate) {
        List<Validation> validations = new ArrayList<Validation>();
        validationService.verifyString("项目编号", projectInfo.getProjindex(), "validation",
                "12", "12", isCreate, validations);
        validationService.verifyString("项目名", projectInfo.getProjname(), "validation",
                "2", "50", false, validations);
        validationService.verifyString("项目描述", projectInfo.getProjdescription(), "validation",
                "2", "255", false, validations);

        validationService.verifyString("对协作部门的评价", projectInfo.getProjcomment(), "validation",
                "1", "255", true, validations);

        if (!validations.isEmpty()) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg(validations.get(0).getField() + validations.get(0).getError());
        }
    }
}
