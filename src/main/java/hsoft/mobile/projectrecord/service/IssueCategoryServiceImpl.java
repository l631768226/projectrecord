package hsoft.mobile.projectrecord.service;

import com.google.gson.Gson;
import com.sun.istack.internal.Nullable;
import hsoft.mobile.projectrecord.dao.IssueCategoryDao;
import hsoft.mobile.projectrecord.mapper.IssueCategoryMapper;
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
 * 问题类型信息Service
 * create by TX on 2017/9/27
 */

@Service
public class IssueCategoryServiceImpl implements IssueCategoryService {

    @Autowired
    private ValidationService validationService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private IssueCategoryMapper issueCategoryMapper;
    @Autowired
    private IssueCategoryDao issueCategoryDao;

    private boolean localtest = Common.localtest;

    @Override
    public String processCreate(Map<String, String> map) {
        Gson gson = new Gson();
        ResultCode<IssueCategory> resultCode = new ResultCode<IssueCategory>();
        CheckResult checkResult = new CheckResult();

        do {
            // 1.check user Authority
            User user = getUser(checkResult);
            if (checkResult.getCheckCode() < 0) break;

            if ((user.getAuthority() != 1) && (user.getAuthority() != 2)) {
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("此用户没有相应的权限");
                break;
            }

            // 2. extract data
            IssueCategory issueCategory;
            try {
                issueCategory = parseData(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入数据错误！");
                break;
            }

            // 3. check IssueCategory name
            checkResult = checkDataFormat(issueCategory);
            if (checkResult.getCheckCode() < 0) break;

            // 4. check database
            checkResult = checkDatabaseByName(issueCategory.getIssueName());
            if (checkResult.getCheckCode() < 0) break;

            // 5. insert data to database
            issueCategory.setCreateid(user.getUserid());
            issueCategory.setCreatetime(new Date());
            issueCategoryMapper.insertSelective(issueCategory);

            resultCode.setRs(1);
            resultCode.setValue(issueCategory);
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
        Gson gson = new Gson();
        ResultCode<IssueCategory> resultCode = new ResultCode<IssueCategory>();
        CheckResult checkResult = new CheckResult();

        do {
            // 1.check user Authority
            User user = getUser(checkResult);
            if (checkResult.getCheckCode() < 0) break;

            if ((user.getAuthority() != 1) && (user.getAuthority() != 2)) {
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("此用户没有相应的权限");
                break;
            }

            // 2. extract data
            IssueCategory issueCategory;
            try {
                issueCategory = parseData(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入数据错误！");
                break;
            }

            // 3. check IssueCategory name
            checkResult = checkDataFormat(issueCategory);
            if (checkResult.getCheckCode() < 0) break;

            // 4. check database
            checkResult = checkDatabaseByIdAndName(issueCategory.getIssueCategoryId(), issueCategory.getIssueName());
            if (checkResult.getCheckCode() < 0) break;

            // 5. update data to database
            issueCategory.setUpdateid(user.getUserid());
            issueCategory.setUpdatetime(new Date());
            issueCategoryMapper.updateByPrimaryKeySelective(issueCategory);

            resultCode.setRs(1);
            resultCode.setValue(issueCategory);
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
        Gson gson = new Gson();
        ResultCode<IssueCategory> resultCode = new ResultCode<IssueCategory>();
        CheckResult checkResult = new CheckResult();

        do {
            // 1.check user Authority
            User user = getUser(checkResult);
            if (checkResult.getCheckCode() < 0) break;

            if ((user.getAuthority() != 1) && (user.getAuthority() != 2)) {
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("此用户没有相应的权限");
                break;
            }

            // 2. extract data
            IssueCategory issueCategory;
            try {
                issueCategory = parseData(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入数据错误！");
                break;
            }

            // 3. check database
            checkResult = checkDatabaseById(issueCategory.getIssueCategoryId());
            if (checkResult.getCheckCode() < 0) break;

            // 5. delete data from database
            issueCategoryMapper.deleteByPrimaryKey(issueCategory.getIssueCategoryId());

            resultCode.setRs(1);
            resultCode.setValue(issueCategory);
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
        Gson gson = new Gson();
        ResultCode<List<IssueCategory>> resultCode = new ResultCode<List<IssueCategory>>();

        if (tokenService.processCheckToken()) {
            List<IssueCategory> list = issueCategoryDao.findList();
            if (list.isEmpty()) {
                resultCode.setRs(-10);
                resultCode.setMsg("无数据");
            } else {
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
     * 将前端传入的数据置入model中
     *
     * @param map 前端传入的信息
     * @return 平台信息model
     */
    private IssueCategory parseData(Map<String, String> map) throws UnsupportedEncodingException {
        IssueCategory issueCategory = new IssueCategory();
        String issueCategoryId = map.get("issueCategoryId");
        String issueCategoryName = map.get("issueCategoryName");
        if (issueCategoryId != null && !"".equals(issueCategoryId)) {
            if (!localtest) {
                issueCategoryId = new String(FBase64.decode(issueCategoryId));
            }
            issueCategory.setIssueCategoryId(Integer.valueOf(issueCategoryId));
        }
        if (issueCategoryName != null && !"".equals(issueCategoryName)) {
            if (!localtest) {
                issueCategoryName = new String(FBase64.decode(issueCategoryName));
            }
            issueCategory.setissueCategoryName(issueCategoryName);
        }
        return issueCategory;
    }

    private User getUser(CheckResult checkResult) {
        User user = new User();
        try {
            user = tokenService.processUser();
            checkResult.setCheckCode(1);
        } catch (Exception e) { // 用户没有登录，返回信息
            e.printStackTrace();
            checkResult.setCheckCode(-400);
            checkResult.setCheckMsg("用户没有登录");
        }
        return user;
    }

    /**
     * 登录校验，权限校验，传入信息校验（判空，判断长度）
     *
     * @param issueCategory 出入信息
     * @return 校验结果 checkCode字段 < 0 则校验不通过
     */
    private CheckResult checkDataFormat(@Nullable IssueCategory issueCategory) {
        CheckResult checkResult = new CheckResult();
        List<Validation> validations = new ArrayList<>();
        String issueCategoryName = issueCategory.getIssueName();
        validationService.verifyString("问题类型名称", issueCategoryName, "validation", "2", "10", false, validations);
        if (!validations.isEmpty()) { // 没通过校验
            Validation validation = validations.get(0);
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg(validation.getField() + validation.getError());
        } else { // 通过全部校验
            checkResult.setCheckCode(1);
        }
        return checkResult;
    }

    /**
     * 校验是否可以进行插入或修改操作
     *
     * @param issueCategoryName 问题类型名称
     * @return true可以/false不可以
     */
    private CheckResult checkDatabaseByName(String issueCategoryName) {
        CheckResult checkResult = new CheckResult();
        List<IssueCategory> list = issueCategoryDao.findByName(issueCategoryName);
        if (!list.isEmpty()) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("该问题类型名称已存在");
        } else {
            checkResult.setCheckCode(1);
        }
        return checkResult;
    }

    private CheckResult checkDatabaseById(int issueCategoryId) {
        CheckResult checkResult = new CheckResult();
        if (issueCategoryDao.findById(issueCategoryId) == null) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("该问题类型ID不存在");
        } else {
            checkResult.setCheckCode(1);
        }
        return checkResult;
    }

    private CheckResult checkDatabaseByIdAndName(int issueCategoryId, String issueCategoryName) {
        CheckResult checkResult = new CheckResult();
        if (issueCategoryDao.findById(issueCategoryId) == null) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("该问题类型ID不存在");
        } else if (issueCategoryDao.findByIdOrName(issueCategoryId, issueCategoryName).size() > 1) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("该问题类型名称已存在");
        } else {
            checkResult.setCheckCode(1);
        }
        return checkResult;
    }
}