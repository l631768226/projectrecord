package hsoft.mobile.projectrecord.service;

import com.google.gson.Gson;
import com.sun.istack.internal.Nullable;
import hsoft.mobile.projectrecord.dao.PlatformDao;
import hsoft.mobile.projectrecord.mapper.PlatformMapper;
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

/**
 * 平台信息Service
 * create by LY on 2017/9/24
 */

@Service
public class PlatformServiceImpl implements PlatformService {

    @Autowired
    private ValidationService validationService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private PlatformMapper platformMapper;
    @Autowired
    private PlatformDao platformDao;

    //本地测试时为true
    private boolean localtest = Common.localtest;
    //Gson工具
    private Gson gson = new Gson();

    @Override
    public String processCreate(Map<String, String> map) {
        ResultCode<Platform> resultCode = new ResultCode<Platform>();
        CheckResult checkResult = new CheckResult();
        do {
            //第一步 校验用户是否登录以及权限
            checkUser(checkResult, true);
            //如果未通过登录和权限校验，返回结果
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //第二步 组织数据
            Platform platform = new Platform();
            try {
                platform = processModel(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //第三步 数据校验
            processValidation(platform, checkResult);
            if(checkResult.getCheckCode() < 0){
                break;
            }

            //第四步 插入之前校验数据库
            processDB(platform, checkResult, true);
            if(checkResult.getCheckCode() < 0){
                break;
            }

            //第五步数据库插入操作
            try {
                platform.setCreateid(checkResult.getOperatorId());
                platform.setCreatetime(new Date());
                platformMapper.insertSelective(platform);
                resultCode.setRs(1);
                resultCode.setValue(platform);
                checkResult.setCheckCode(1);
            } catch (Exception e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("数据库插入操作错误");
            }
        } while (false);
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
        ResultCode<Platform> resultCode = new ResultCode<Platform>();
        CheckResult checkResult = new CheckResult();
        do {
            //第一步 校验用户是否登录以及权限
            checkUser(checkResult, true);
            //如果未通过登录和权限校验，返回结果
            if (checkResult.getCheckCode() < 0) {
                break;
            }
            //第二步 组织数据
            Platform platform = new Platform();
            try {
                platform = processModel(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //第三步 数据校验
            processValidation(platform, checkResult);
            if(checkResult.getCheckCode() < 0){
                break;
            }

            //第四步 更新之前校验数据库
            processDB(platform, checkResult, true);
            if(checkResult.getCheckCode() < 0){
                break;
            }

            //第五步 数据库更新操作
            try {
                int platformId = platform.getPlatformid();
                //根据传入的主键id获取之前数据库中存储的平台信息
                Platform oldPlatForm = platformMapper.selectByPrimaryKey(platformId);
                //将平台名称、操作人id和操作时间置入平台信息model中
                oldPlatForm.setUpdateid(checkResult.getOperatorId());
                oldPlatForm.setUpdatetime(new Date());
                oldPlatForm.setPlatformname(platform.getPlatformname());
                //更新数据库
                platformMapper.updateByPrimaryKeySelective(oldPlatForm);
                resultCode.setRs(1);
                resultCode.setValue(platform);
                checkResult.setCheckCode(1);
            } catch (Exception e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("数据库更新操作错误");
            }
        } while (false);
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
        ResultCode<Platform> resultCode = new ResultCode<Platform>();
        CheckResult checkResult = new CheckResult();
        do {
            //第一步 校验用户是否登录以及权限
            checkUser(checkResult, true);
            //如果未通过登录和权限校验，返回结果
            if (checkResult.getCheckCode() < 0) {
                break;
            }
            //第二步 组织数据
            Platform platform = new Platform();
            try {
                platform = processModel(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            if(platform.getPlatformid() == null){
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入的主键id为空");
                break;
            }

            //第三步 数据库删除操作
            try {
                int platformId = platform.getPlatformid();
                //根据传入的主键id删除数据库对应的平台信息
                platformMapper.deleteByPrimaryKey(platformId);
                resultCode.setRs(1);
                checkResult.setCheckCode(1);
            } catch (Exception e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("数据库删除操作错误");
            }
        } while (false);
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
        ResultCode<List<Platform>> resultCode = new ResultCode<List<Platform>>();
        CheckResult checkResult = new CheckResult();
        do{
            //第一步 校验用户是否登录以及权限
            checkUser(checkResult, true);
            //如果未通过登录和权限校验，返回结果
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //获取平台信息列表
            try {
                List<Platform> list = platformDao.findList();
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
            if (isCheckAuthority && user.getAuthority() != 1 && user.getAuthority() != 2) {
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
     * 将前端传入的数据置入model中(第二步)
     *
     * @param map 前端传入的信息
     * @return 平台信息model
     */
    private Platform processModel(Map<String, String> map) throws UnsupportedEncodingException {
        Platform platform = new Platform();
        String platformId = map.get("platformId");
        String platformName = map.get("platformName");
        if (platformId != null && !"".equals(platformId)) {
            if (!localtest) {
                platformId = new String(FBase64.decode(platformId));
            }
            platform.setPlatformid(Integer.valueOf(platformId));
        }
        if (platformName != null && !"".equals(platformName)) {
            if (!localtest) {
                platformName = new String(FBase64.decode(platformName));
            }
            platform.setPlatformname(platformName);
        }
        return platform;
    }

    /**
     * 校验平台信息(第三步)
     *
     * @param platform 平台信息model
     * @param checkResult 校验结果
     */
    private void processValidation(Platform platform, CheckResult checkResult) {
        List<Validation> validations = new ArrayList<Validation>();
        String platformName = platform.getPlatformname();
        validationService.verifyString("平台名称", platformName, "validation",
                "2", "10", false, validations);
        if (!validations.isEmpty()) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg(validations.get(0).getField() + validations.get(0).getError());
        }
    }

    /**
     * 校验是否可以进行插入或修改操作(第四步)
     *
     * @param platform    平台信息
     * @param checkResult 校验结果信息
     * @param isCreate    true创建时校验/false修改时校验
     */
    private void processDB(Platform platform, CheckResult checkResult, boolean isCreate) {
        List<Platform> list = new ArrayList<Platform>();
        try {
            //如果是创建时，则
            if (isCreate) {
                list = platformDao.findByPlatformName(platform.getPlatformname());
                if (!list.isEmpty()) {
                    checkResult.setCheckCode(-1);
                    checkResult.setCheckMsg("平台名称已存在");
                }
            }
            //如果通过id能搜索到数据，则说明id存在
            if (platformMapper.selectByPrimaryKey(platform.getPlatformid()) != null) {
                list = platformDao.findByIdOrName(platform.getPlatformid(), platform.getPlatformname());
                if (list.size() > 1) {
                    checkResult.setCheckCode(-1);
                    checkResult.setCheckMsg("平台名称已存在");
                    return;
                }
            } else {
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入的id有误");
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("平台名称已存在");
            return;
        }
    }

}
