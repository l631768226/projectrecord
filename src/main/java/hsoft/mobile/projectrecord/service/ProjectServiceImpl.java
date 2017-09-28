package hsoft.mobile.projectrecord.service;

import com.google.gson.Gson;
import hsoft.mobile.projectrecord.controller.ProjectDao;
import hsoft.mobile.projectrecord.dao.UserDao;
import hsoft.mobile.projectrecord.mapper.DepartmentMapper;
import hsoft.mobile.projectrecord.mapper.ProjectInfoMapper;
import hsoft.mobile.projectrecord.mapper.StatusCategoryMapper;
import hsoft.mobile.projectrecord.model.*;
import hsoft.mobile.projectrecord.utils.Common;
import hsoft.mobile.projectrecord.utils.FBase64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ValidationService validationService;
    @Autowired
    private TokenService tokenService;

    @Autowired
    private ProjectDao projectDao;
    @Autowired
    private ProjectInfoMapper projectInfoMapper;
    @Autowired
    private UserDao userDao;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private StatusCategoryMapper statusCategoryMapper;

    //本地测试时为true
    private boolean localtest = Common.localtest;
    //Gson工具
    private Gson gson = new Gson();

    @Override
    public String processCreate(Map<String, String> map) {
        ResultCode<ProjectInfo> resultCode = new ResultCode<ProjectInfo>();
        CheckResult checkResult = new CheckResult();
        do{
            //第一步 校验用户是否登录以及权限
            tokenService.processCheckUser(checkResult, true);
            if(checkResult.getCheckCode() < 0){
                break;
            }

            //第二步 准备数据
            ProjectInfo projectInfo = new ProjectInfo();
            try {
                projectInfo = processModel(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //第三步 校验数据
            processValidation(projectInfo, checkResult, true);
            if(checkResult.getCheckCode() < 0){
                break;
            }

            //第四步 插入操作之前校验数据库
            processDB(projectInfo, checkResult, true);
            if(checkResult.getCheckCode() < 0){
                break;
            }

            //第五步 数据库插入操作
            try {
                Date date = new Date();
                SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyyMMddHHmm");
                String projectIndex = simpleFormatter.format(date);
                projectInfo.setProjindex(projectIndex);
                projectInfo.setCreateid(checkResult.getOperatorId());
                projectInfo.setCreatetime(date);
                projectInfo.setHide(0);
                projectInfoMapper.insertSelective(projectInfo);
                resultCode.setRs(1);
                resultCode.setValue(projectInfo);
                checkResult.setCheckCode(1);
            } catch (Exception e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("数据库插入操作错误");
            }

        }while(false);
        if (checkResult.getCheckCode() < 0) {
            resultCode.setRs(checkResult.getCheckCode());
            resultCode.setMsg(checkResult.getCheckMsg());
        }
        if (localtest) {
            return gson.toJson(resultCode);
        }
        return FBase64.encode(gson.toJson(resultCode).getBytes());
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

    private void processDB(ProjectInfo projectInfo, CheckResult checkResult, boolean isCreate){
        List<ProjectInfo> list = new ArrayList<ProjectInfo>();

        try {
            if(isCreate){
                list = projectDao.findByProjName(projectInfo.getProjname());
                if(!list.isEmpty()){
                    checkResult.setCheckCode(-1);
                    checkResult.setCheckMsg("项目名称已存在");
                    return;
                }
            }
            if(projectDao.findByIndex(projectInfo.getProjindex()) != null){
                list = projectDao.findByIndexOrProjName(projectInfo.getProjindex(), projectInfo.getProjname());
                if(list.size() > 1){
                    checkResult.setCheckCode(-1);
                    checkResult.setCheckMsg("项目名称已存在");
                    return;
                }
            }else{
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入的项目编号有误");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("项目名称已存在");
            return;
        }

        if(userDao.findById(projectInfo.getProjmanager()) == null){
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("传入的项目负责人有误");
            return;
        }
        if(statusCategoryMapper.selectByPrimaryKey(projectInfo.getStatuscategoryid()) == null){
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("传入的项目状态有误");
            return;
        }
        if(departmentMapper.selectByPrimaryKey(projectInfo.getDeptid()) == null){
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("传入的项目来源有误");
            return;
        }
    }
}
