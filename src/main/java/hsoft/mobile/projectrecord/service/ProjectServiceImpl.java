package hsoft.mobile.projectrecord.service;

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

    private ProjectInfo processModel(Map<String, String> map) throws UnsupportedEncodingException {
        ProjectInfo projectInfo = new ProjectInfo();
        //项目编号
        String projIndex = map.get("projIndex");
        //项目描述
        String projDescription = map.get("projDescription");
        //项目负责人
        String projManagerStr = map.get("projManager");
        int projManager = 0;
        //部门来源
        String deptIdStr = map.get("deptId");
        int deptId = 0;

        //设置项目编号
        if (!Common.checkNull(projIndex)) {
            if (!localtest) {
                projIndex = new String(FBase64.decode(projIndex));
            }
            projectInfo.setProjindex(projIndex);
        }
        //设置项目描述
        if (!Common.checkNull(projDescription)) {
            if (!localtest) {
                projDescription = new String(FBase64.decode(projDescription));
            }
            projectInfo.setProjdescription(projDescription);
        }
        //设置项目负责人
        if (!Common.checkNull(projManagerStr)) {
            if (!localtest) {
                projManagerStr = new String(FBase64.decode(projManagerStr));
            }
            try{
                projManager = Integer.valueOf(projManagerStr);
            }catch(Exception e){
                e.printStackTrace();
                projManager = 0;
            }
            projectInfo.setProjmanager(projManager);
        }
        //设置项目部门来源
        if (!Common.checkNull(deptIdStr)) {
            if (!localtest) {
                deptIdStr = new String(FBase64.decode(deptIdStr));
            }
            try{
                deptId = Integer.valueOf(deptIdStr);
            }catch(Exception e){
                e.printStackTrace();
                deptId = 0;
            }
            projectInfo.setDeptid(deptId);
        }



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
