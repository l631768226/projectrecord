package hsoft.mobile.projectrecord.service;

import com.google.gson.Gson;
import hsoft.mobile.projectrecord.dao.StatusDao;
import hsoft.mobile.projectrecord.mapper.StatusCategoryMapper;
import hsoft.mobile.projectrecord.model.*;
import hsoft.mobile.projectrecord.utils.Common;
import hsoft.mobile.projectrecord.utils.FBase64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private TokenService tokenService;
    @Autowired
    private ValidationService validationService;
    @Autowired
    private StatusCategoryMapper statusCategoryMapper;
    @Autowired
    private StatusDao statusDao;

    //本地测试时为true
    private boolean localtest = Common.localtest;
    //Gson工具
    private Gson gson = new Gson();

    @Override
    public String processCreate(Map<String, String> map) {
        ResultCode<StatusCategory> resultCode = new ResultCode<StatusCategory>();
        CheckResult checkResult = new CheckResult();
        do{
            //第一步 校验用户是否登录以及权限
            checkUser(checkResult, true);
            //如果未通过登录和权限校验，返回结果
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //第二步 准备数据
            StatusCategory statusCategory = new StatusCategory();
            try {
                statusCategory = processModel(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //第三步 数据校验
            processValidation(statusCategory, checkResult);
            if(checkResult.getCheckCode() < 0){
                break;
            }

            //第四步 插入之前校验数据库
            processDB(statusCategory, checkResult, true);

            //第五步 数据库插入操作

            try {
                statusCategory.setCreateid(checkResult.getOperatorId());
                statusCategory.setCreatetime(new Date());
                statusCategoryMapper.insertSelective(statusCategory);
                resultCode.setRs(1);
                resultCode.setValue(statusCategory);
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

    @Override
    public String processUpdate(Map<String, String> map) {
        ResultCode<StatusCategory> resultCode = new ResultCode<StatusCategory>();
        CheckResult checkResult = new CheckResult();
        do{
            //第一步 校验用户是否登录以及权限
            checkUser(checkResult, true);
            //如果未通过登录和权限校验，返回结果
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //第二步 准备数据
            StatusCategory statusCategory = new StatusCategory();
            try {
                statusCategory = processModel(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //第三步 数据校验
            processValidation(statusCategory, checkResult);
            if(checkResult.getCheckCode() < 0){
                break;
            }

            //第四步 插入之前校验数据库
            processDB(statusCategory, checkResult, false);

            //第五步 数据库更新操作
            try {
                int statusCategoryId = statusCategory.getStatuscategoryid();
                //根据主键id查询状态类型信息model
                StatusCategory oldStatusCategory1 = statusCategoryMapper.selectByPrimaryKey(statusCategoryId);
                //将类型信息名称、更新人id、更新时间置入model
                oldStatusCategory1.setUpdateid(checkResult.getOperatorId());
                oldStatusCategory1.setUpdatetime(new Date());
                oldStatusCategory1.setStatusname(statusCategory.getStatusname());

                statusCategoryMapper.updateByPrimaryKey(oldStatusCategory1);
                resultCode.setRs(1);
                resultCode.setValue(oldStatusCategory1);
                checkResult.setCheckCode(1);
            } catch (Exception e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("数据库更新操作错误");
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

    @Override
    public String processDelete(Map<String, String> map) {
        ResultCode<StatusCategory> resultCode = new ResultCode<StatusCategory>();
        CheckResult checkResult = new CheckResult();
        do{
            //第一步 校验用户是否登录以及权限
            checkUser(checkResult, true);
            //如果未通过登录和权限校验，返回结果
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //第二步 准备数据
            StatusCategory statusCategory = new StatusCategory();
            try {
                statusCategory = processModel(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //第三步 数据校验
            if (statusCategory.getStatuscategoryid() == null){
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入的主键id为空");
                break;
            }

            //第四步 数据库删除操作
            try {
                int statusCategoryId = statusCategory.getStatuscategoryid();
                //根据主键id删除状态类型信息model
                statusCategoryMapper.deleteByPrimaryKey(statusCategoryId);

                resultCode.setRs(1);
                checkResult.setCheckCode(1);
            } catch (Exception e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("数据库删除操作错误");
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

    @Override
    public String processList() {
        ResultCode<List<StatusCategory>> resultCode = new ResultCode<List<StatusCategory>>();
        CheckResult checkResult = new CheckResult();
        do{
            //第一步 校验用户是否登录以及权限
            checkUser(checkResult, true);
            //如果未通过登录和权限校验，返回结果
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //第二步 获取状态类型列表
            try {
                List<StatusCategory> list = statusDao.findList();

                if (list.isEmpty()) {
                    checkResult.setCheckCode(-10);
                    checkResult.setCheckMsg("无数据");
                } else {
                    resultCode.setRs(1);
                    resultCode.setValue(list);
                    checkResult.setCheckCode(1);
                }
            } catch (Exception e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("数据库操作错误");
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
     * 校验用户是否登录以及权限校验(第一步)
     *
     * @param checkResult      校验结果信息
     * @param isCheckAuthority 是否校验用户权限
     */
    private void checkUser(CheckResult checkResult, boolean isCheckAuthority) {
        try {
            User user = tokenService.processUser();
            if (isCheckAuthority && user.getAuthority() != 1) {
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("对不起，您没有权限");
            }
            checkResult.setCheckCode(1);
            checkResult.setOperatorId(user.getUserid());
        } catch (Exception e) { // 用户没有登录，返回信息
            e.printStackTrace();
            checkResult.setCheckCode(-400);
            checkResult.setCheckMsg("用户没有登录");
        }
    }

    /**
     * 将前端传入的数据置入model中（第二步）
     * @param map 前端传入的数据
     * @return 状态类型model
     * @throws UnsupportedEncodingException
     */
    private StatusCategory processModel(Map<String, String> map) throws UnsupportedEncodingException {
        StatusCategory statusCategory = new StatusCategory();
        String statusCategoryIdStr = map.get("statusCategoryId");
        String statusName = map.get("statusName");
        int statusCategoryId = 0;
        if(!localtest){
            statusCategoryIdStr = new String(FBase64.decode(statusCategoryIdStr));
            statusName = new String(FBase64.decode(statusName));
        }
        try {
            statusCategoryId = Integer.valueOf(statusCategoryIdStr);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        statusCategory.setStatuscategoryid(statusCategoryId);
        statusCategory.setStatusname(statusName);
        return statusCategory;
    }

    /**
     * 校验状态类型信息(第三步)
     *
     * @param statusCategory 状态类型信息model
     * @param checkResult 校验结果
     */
    private void processValidation(StatusCategory statusCategory, CheckResult checkResult) {
        List<Validation> validations = new ArrayList<Validation>();
        String statusName = statusCategory.getStatusname();
        validationService.verifyString("状态类型名称", statusName, "validation",
                "2", "10", false, validations);
        if (!validations.isEmpty()) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg(validations.get(0).getField() + validations.get(0).getError());
        }
    }

    /**
     * 校验是否可以进行插入或修改操作（第四步）
     * @param statusCategory 状态类型信息
     * @param checkResult 校验结果信息
     * @param isCreate true创建时校验/false修改时校验
     */
    private void processDB(StatusCategory statusCategory, CheckResult checkResult, boolean isCreate){
        List<StatusCategory> list = new ArrayList<StatusCategory>();
        try {
            //如果是创建时，则只通过名称查询即可
            if(isCreate){
                list = statusDao.findByStatusName(statusCategory.getStatusname());
                if(!list.isEmpty()){
                    checkResult.setCheckCode(-1);
                    checkResult.setCheckMsg("状态类型名称已经存在");
                    return;
                }
            }
            if(statusCategoryMapper.selectByPrimaryKey(statusCategory.getStatuscategoryid()) == null){
                list = statusDao.findByIdOrName(statusCategory.getStatuscategoryid(), statusCategory.getStatusname());
                if(list.size() > 1){
                    checkResult.setCheckCode(-1);
                    checkResult.setCheckMsg("状态类型名称已经存在");
                    return;
                }
            }else{
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入的id有误");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("状态类型名称已经存在");
            return;
        }
    }
}
