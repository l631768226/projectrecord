package hsoft.mobile.projectrecord.service;

import com.google.gson.Gson;
import hsoft.mobile.projectrecord.dao.SkillDao;
import hsoft.mobile.projectrecord.dao.UserDao;
import hsoft.mobile.projectrecord.mapper.PlatformMapper;
import hsoft.mobile.projectrecord.mapper.SkillMapper;
import hsoft.mobile.projectrecord.mapper.UserMapper;
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
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private ValidationService validationService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PlatformMapper platformMapper;
    @Autowired
    private SkillMapper skillMapper;
    @Autowired
    private SkillDao skillDao;

    //若为本地测试，则为true
    private boolean localtest = Common.localtest;

    //Gson工具
    private Gson gson = new Gson();

    @Override
    public User processLogin(Map<String, String> map) {
        try {
            String username = map.get("username");
            if (localtest) {
                username = new String(FBase64.decode(username));
            }
            String password = Common.toMD5(map.get("password"));
            if (localtest) {
                password = new String(FBase64.decode(password));
            }
            return userDao.processLogin(username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String processCreate(Map<String, String> map) {
        ResultCode<User> resultCode = new ResultCode<User>();
        CheckResult checkResult = new CheckResult();

        do {
            //第一步 校验用户是否登录以及权限
            checkUser(checkResult, true);
            //如果未通过登录和权限校验，返回结果
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //第二步 准备数据
            User user = new User();
            try {
                user = processModel(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //第三步 校验数据
            processValidation(user, checkResult);
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //第四步 插入操作之前校验数据库
            processDB(user, checkResult, true);
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //第五步 数据库插入操作
            try {
                Date date = new Date();
                user.setCreateid(checkResult.getOperatorId());
                user.setCreatetime(date);
                userMapper.insertSelective(user);

                if (map.get("skill") != null && !"".equals(map.get("skill").trim())) {
                    //如果传入了技能相关的字段， 准备数据，将技能信息插入到技能表中
                    Skill skill = new Skill();
                    skill.setCreateid(checkResult.getOperatorId());
                    skill.setCreatetime(date);
                    skill.setUserid(user.getUserid());
                    processSkill(skill, map.get("skill"));
                }
                resultCode.setRs(1);
                resultCode.setValue(user);
                checkResult.setCheckCode(1);
            } catch (UnsupportedEncodingException e) {
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
        ResultCode<User> resultCode = new ResultCode<User>();
        CheckResult checkResult = new CheckResult();

        do {
            //第一步 校验用户是否登录以及权限
            checkUser(checkResult, true);
            //如果未通过登录和权限校验，返回结果
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //第二步 准备数据
            User user = new User();
            try {
                user = processModel(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            //第三步 校验数据
            processValidation(user, checkResult);
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //第四步 插入操作之前校验数据库
            processDB(user, checkResult, false);
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //第五步 数据库插入操作
            try {
                Date date = new Date();

                int userId = user.getUserid();
                User oldUser = userDao.findById(userId);
                oldUser.setUsername(user.getUsername());
                oldUser.setPassword(user.getPassword());
                oldUser.setRealname(user.getRealname());
                oldUser.setAuthority(user.getAuthority());

                oldUser.setUpdateid(checkResult.getOperatorId());
                oldUser.setUpdatetime(date);
                userMapper.updateByPrimaryKeySelective(oldUser);

                if (map.get("skill") != null && !"".equals(map.get("skill").trim())) {
                    //首先将skill表中的相关数据删除
                    skillDao.deleteById(userId);
                    //再将修改的技能信息插入到skill表中
                    //如果传入了技能相关的字段， 准备数据，将技能信息插入到技能表中
                    Skill skill = new Skill();
                    skill.setCreateid(checkResult.getOperatorId());
                    skill.setCreatetime(date);
                    skill.setUserid(user.getUserid());
                    processSkill(skill, map.get("skill"));
                }

                resultCode.setRs(1);
                resultCode.setValue(oldUser);
                checkResult.setCheckCode(1);
            } catch (UnsupportedEncodingException e) {
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
    public String processList() {
        ResultCode<List<User>> resultCode = new ResultCode<List<User>>();
        CheckResult checkResult = new CheckResult();
        do {
            //第一步 校验用户是否登录以及权限
            checkUser(checkResult, false);
            //如果未通过登录和权限校验，返回结果
            if (checkResult.getCheckCode() < 0) {
                break;
            }
            //获取平台信息列表
            try {
                List<User> list = userDao.findList();
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
    public String processSkillList(Map<String, String> map) {
        ResultCode<List<User>> resultCode = new ResultCode<List<User>>();
        CheckResult checkResult = new CheckResult();

        do {
            //第一步 校验用户是否登录以及权限
            checkUser(checkResult, false);
            if (checkResult.getCheckCode() < 0) {
                break;
            }

            //校验平台信息id是否为空
            String platformIdStr = map.get("platformId");
            int platformId = 0;
            if (!Common.checkNull(platformIdStr)) {
                try {
                    platformId = Integer.valueOf(platformIdStr);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    checkResult.setCheckCode(-1);
                    checkResult.setCheckMsg("传入平台信息id格式不正确");
                    break;
                }
            } else {
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入的平台信息id为空");
                break;
            }

            //数据库操作
            if (platformMapper.selectByPrimaryKey(platformId) != null) {
                List<User> list = userDao.findSkillList(platformId);
                if (list.isEmpty()) {
                    checkResult.setCheckCode(-10);
                    checkResult.setCheckMsg("无数据");
                } else {
                    resultCode.setRs(1);
                    resultCode.setValue(list);
                    checkResult.setCheckCode(1);
                }
            } else {
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("该平台信息不存在");
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

    /**
     * 将传入的技能信息插入到表中
     *
     * @param skill    技能信息
     * @param skillStr 传入的技能信息字符串 逗号分隔
     */
    private void processSkill(Skill skill, String skillStr) throws UnsupportedEncodingException {
        //若传入的技能字符串非空
        if (!Common.checkNull(skillStr)) {
            if (!localtest) {
                skillStr = new String(FBase64.decode(skillStr));
            }
            try {
                //将逗号分隔的字符串转换成List
                List<String> list = Common.strToList(skillStr);
                int platformId;
                for (String str : list) {
                    platformId = Integer.valueOf(str);
                    if (platformMapper.selectByPrimaryKey(platformId) != null) {
                        //如果平台信息存在，置入技能信息表
                        skill.setPlatformid(platformId);
                        skillMapper.insertSelective(skill);
                    } else {
                        //如果平台信息不存在，继续
                        continue;
                    }
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
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
     *
     * @param map 前端传入的信息
     * @return 平台信息model
     */
    private User processModel(Map<String, String> map) throws UnsupportedEncodingException {
        User user = new User();
        String useridStr = map.get("userId");
        String username = map.get("username");
        String password = map.get("password");
        String realname = map.get("realname");
        String authority = map.get("authority");
        int userId = 0;
        if (!localtest) {
            useridStr = new String(FBase64.decode(useridStr));
            username = new String(FBase64.decode(username));
            password = new String(FBase64.decode(password));
            realname = new String(FBase64.decode(realname));
            authority = new String(FBase64.decode(authority));
        }
        try {
            userId = Integer.valueOf(useridStr);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        user.setUserid(userId);
        user.setUsername(username);
        user.setPassword(password);
        user.setRealname(realname);
        user.setAuthority(Integer.valueOf(authority));
        return user;
    }

    /**
     * 校验用户信息(第三步)
     *
     * @param user        用户信息
     * @param checkResult 校验结果
     */
    private void processValidation(User user, CheckResult checkResult) {
        List<Validation> validations = new ArrayList<Validation>();
        validationService.verifyString("用户名", user.getUsername(), "validation",
                "4", "20", false, validations);
        validationService.verifyString("密码", user.getPassword(), "validation",
                "6", "20", false, validations);
        validationService.verifyString("真实姓名", user.getRealname(), "chinese",
                "2", "3", false, validations);
        validationService.verifyInt("权限", user.getAuthority(),
                1, 3, false, validations);
        if (!validations.isEmpty()) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg(validations.get(0).getField() + validations.get(0).getError());
        }
    }

    /**
     * 校验是否可以进行插入或修改操作(第四步)
     *
     * @param user        用户信息
     * @param checkResult 校验结果
     * @param isCreate    true创建时校验/false修改时校验
     * @return true可以/false不可以
     */
    private void processDB(User user, CheckResult checkResult, boolean isCreate) {
        List<User> list = new ArrayList<User>();
        try {
            if (isCreate) {
                list = userDao.findByUsername(user.getUsername());
                if (!list.isEmpty()) {
                    checkResult.setCheckCode(-1);
                    checkResult.setCheckMsg("用户名已存在");
                    return;
                }
            }
            if (userDao.findById(user.getUserid()) != null) {
                list = userDao.findByIdOrUsername(user.getUserid(), user.getUsername());
                if (list.size() > 1) {
                    checkResult.setCheckCode(-1);
                    checkResult.setCheckMsg("用户名已存在");
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
            checkResult.setCheckMsg("用户名已存在");
            return;
        }
    }
}
