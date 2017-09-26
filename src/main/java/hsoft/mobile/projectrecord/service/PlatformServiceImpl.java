package hsoft.mobile.projectrecord.service;

import com.google.gson.Gson;
import com.sun.istack.internal.Nullable;
import hsoft.mobile.projectrecord.dao.PlatformDao;
import hsoft.mobile.projectrecord.mapper.PlatformMapper;
import hsoft.mobile.projectrecord.model.*;
import hsoft.mobile.projectrecord.utils.Common;
import hsoft.mobile.projectrecord.utils.FBase64;
import jdk.nashorn.internal.parser.Token;
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

    private boolean localtest = Common.localtest;

    @Override
    public String processCreate(Map<String, String> map) {
        Gson gson = new Gson();
        ResultCode<Platform> resultCode = new ResultCode<Platform>();
        CheckResult checkResult = processCheck(map, true);
        if (checkResult.getCheckCode() > 0) {
            //如果通过校验
            try {
                Platform platform = processModel(map);
                //校验数据库中是否有可以进行插入操作
                if (processDB(platform, true)) {
                    //如果数据库中不存在同名的平台信息，则可以新增信息
                    //将需要处理的信息置入model中 并插入到数据库
                    platform.setCreateid(checkResult.getOperatorId());
                    platform.setCreatetime(new Date());
                    platformMapper.insertSelective(platform);
                    resultCode.setRs(1);
                    resultCode.setValue(platform);
                } else {
                    //如果存在，则返回结果
                    resultCode.setRs(-1);
                    resultCode.setMsg("该平台名称已存在");
                }
            } catch (Exception e) {
                //插入数据库失败，返回结果
                e.printStackTrace();
                resultCode.setRs(-1);
                resultCode.setMsg("数据库插入操作错误");
            }
        } else {
            //如果没有通过校验,则组织返回结果数据
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
        Gson gson = new Gson();
        ResultCode<Platform> resultCode = new ResultCode<Platform>();
        CheckResult checkResult = processCheck(map, true);
        if (checkResult.getCheckCode() > 0) {
            try {
                //如果通过校验
                Platform platform = processModel(map);
                //校验数据库中是否有可以进行插入操作
                if (processDB(platform, false)) {
                    int platformId = platform.getPlatformid();
                    //根据传入的id获取之前数据库中存储的平台信息
                    Platform oldplatform = platformDao.findById(platformId);
                    //将平台名称 操作人id和更新时间置入平台信息model中
                    oldplatform.setPlatformname(platform.getPlatformname());
                    oldplatform.setUpdateid(checkResult.getOperatorId());
                    oldplatform.setUpdatetime(new Date());
                    //更新数据库
                    platformMapper.updateByPrimaryKeySelective(oldplatform);
                    resultCode.setRs(1);
                    resultCode.setValue(oldplatform);
                }else{
                    //如果存在，则返回结果
                    resultCode.setRs(-1);
                    resultCode.setMsg("该平台名称已存在");
                }
            } catch (Exception e) {
                //数据库更新失败
                e.printStackTrace();
                resultCode.setRs(-1);
                resultCode.setMsg("数据库更新操作错误");
            }
        } else {
            //如果没有通过校验,则组织返回结果数据
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
        Gson gson = new Gson();
        ResultCode<Platform> resultCode = new ResultCode<Platform>();
        CheckResult checkResult = processCheck(map, true);
        if (checkResult.getCheckCode() > 0) {
            try {
                Platform platform = processModel(map);
                platformMapper.deleteByPrimaryKey(platform.getPlatformid());
                resultCode.setRs(1);
            } catch (Exception e) {
                e.printStackTrace();
                resultCode.setRs(-1);
                resultCode.setMsg("数据库删除操作错误");
            }
        } else {
            //如果没有通过校验,则组织返回结果数据
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
        Gson gson = new Gson();
        ResultCode<List<Platform>> resultCode = new ResultCode<List<Platform>>();
        if (tokenService.processCheckToken()) {
            List<Platform> list = platformDao.findList();
            if(list.isEmpty()){
                resultCode.setRs(-10);
                resultCode.setMsg("无数据");
            }else{
                resultCode.setRs(1);
                resultCode.setValue(list);
            }
        } else {
            resultCode.setRs(-400);
            resultCode.setMsg("用户没有登录");
        }
        if (localtest) {
            return gson.toJson(resultCode);
        }
        return FBase64.encode(gson.toJson(resultCode).getBytes());
    }

    /**
     * 校验平台信息
     *
     * @param map 平台信息
     * @return 校验结果的list 如果非空则校验不通过
     */
    private List<Validation> processValidation(Map<String, String> map) {
        List<Validation> validations = new ArrayList<Validation>();
        String platformName = "";
        try {
            platformName = map.get("platformName");
            if (!localtest) {
                platformName = new String(FBase64.decode(platformName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        validationService.verifyString("平台名称", platformName, "validation",
                "2", "10", true, validations);
        return validations;
    }

    /**
     * 将前端传入的数据置入model中
     *
     * @param map 前端传入的信息
     * @return 平台信息model
     */
    private Platform processModel(Map<String, String> map) throws UnsupportedEncodingException {
        Platform platform = new Platform();
        String platformId = map.get("platformId");
        String platformName = map.get("platformName");
        if (platformId != null && !"".equals(platformId)) {
            if(!localtest){
                platformId = new String(FBase64.decode(platformId));
            }
            platform.setPlatformid(Integer.valueOf(platformId));
        }
        if (platformName != null && !"".equals(platformName)) {
            if(!localtest){
                platformName = new String(FBase64.decode(platformName));
            }
            platform.setPlatformname(platformName);
        }
        return platform;
    }

    /**
     * 登录校验，权限校验，传入信息校验（判空，判断长度）
     *
     * @param map         出入信息
     * @param isAuthority 是否进行权限判断
     * @return 校验结果 checkCode字段 < 0 则校验不通过
     */
    private CheckResult processCheck(@Nullable Map<String, String> map, boolean isAuthority) {
        CheckResult platformCheckResult = new CheckResult();
        User user;
        //登录校验，获取登录人的信息
        try {
            user = tokenService.processUser();
            //如果需要权限校验,则进入判断进行权限校验
            if (isAuthority) {
                int authority = user.getAuthority();
                //权限校验
                if (authority == 3) {
                    platformCheckResult.setCheckCode(-1);
                    platformCheckResult.setCheckMsg("对不起，您没有权限");
                    return platformCheckResult;
                }
            }
        } catch (Exception e) {
            //进入到catch则说明用户没有登录，返回信息
            e.printStackTrace();
            platformCheckResult.setCheckCode(-400);
            platformCheckResult.setCheckMsg("用户没有登录");
            return platformCheckResult;
        }
        //传入数据校验(包括判空和长度校验)
        List<Validation> validations = processValidation(map);
        if (!validations.isEmpty()) {
            //如果没通过校验
            Validation validation = validations.get(0);
            platformCheckResult.setCheckCode(-1);
            platformCheckResult.setCheckMsg(validation.getField() + validation.getError());
            return platformCheckResult;
        }
        //若通过全部校验,则将操作人员的id置入checkresult并返回
        platformCheckResult.setCheckCode(1);
        platformCheckResult.setOperatorId(user.getUserid());
        return platformCheckResult;
    }

    /**
     * 校验是否可以进行插入或修改操作
     *
     * @param platform 平台信息
     * @param isCreate true创建时校验/false修改时校验
     * @return true可以/false不可以
     */
    private boolean processDB(Platform platform, boolean isCreate) {
        List<Platform> list = new ArrayList<Platform>();
        try {
            if(isCreate) {
                list = platformDao.findByPlatformName(platform.getPlatformname());
                return list.isEmpty();
            }
            list = platformDao.findByIdOrName(platform.getPlatformid(),platform.getPlatformname());
            return  list.size() <= 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
