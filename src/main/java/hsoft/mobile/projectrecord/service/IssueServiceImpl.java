package hsoft.mobile.projectrecord.service;

import com.google.gson.Gson;
import com.sun.istack.internal.Nullable;
import hsoft.mobile.projectrecord.dao.*;
import hsoft.mobile.projectrecord.mapper.IssueMapper;
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
public class IssueServiceImpl implements IssueCategoryService {

    @Autowired
    private ValidationService validationService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private IssueMapper issueMapper;
    @Autowired
    private IssueDao issueDao;
    @Autowired
    private ProjectDao projectDao;
    @Autowired
    private IssueCategoryDao issueCategoryDao;
    @Autowired
    private PlatformDao platformDao;


    private boolean localtest = Common.localtest;

    @Override
    public String processCreate(Map<String, String> map) {
        Gson gson = new Gson();
        ResultCode<Issue> resultCode = new ResultCode<Issue>();
        CheckResult checkResult = new CheckResult();

        do {
            Issue  issue;

            // 1.check user Authority （irrelevant to business）
            User user = getUser(checkResult);
            if (checkResult.getCheckCode() < 0) break;

            if ((user.getAuthority() != 1) && (user.getAuthority() != 2)) {
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("此用户没有相应的权限");
                break;
            }

            // 2. extract data
            try {
                issue =  parseIssue(map, false, checkResult);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入数据错误！");
                break;
            }

            // 3. check data format
            checkResult = checkIssueFormat(issue);
            if (checkResult.getCheckCode() < 0) break;




            if (checkResult.getCheckCode() < 0) break;

            // 5. insert data to database
            issue.setCreateId(user.getUserid());
            issue.setCreateTime(new Date());
            issueMapper.insertSelective(issue);

            resultCode.setRs(1);
            resultCode.setValue(issue);
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
                issueCategory = parseIssue(map);
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
     * 将前端传入的数据置入model中
     *
     * @param map 前端传入的信息
     * @return Issue Model
     */
    private Issue parseIssue(Map<String, String> map, boolean isUpdate, CheckResult checkResult) throws UnsupportedEncodingException {
        Issue issue = new Issue();

        issue.setId(Common.parseInteger(map,"issueId"));
        if (isUpdate) { // 数据库中应该存在
            if (null == issueDao.findById(issue.getId())) {
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("问题编号不存在");
                return null;
            }
        }

        issue.setIssueProjIndex(Common.parseString(map, "issueProjIndex"));
        if (null == projectDao.findById(issue.getIssueProjIndex())) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("该项目编号不存在");
            return null;
        }

        issue.setIssueReqId(Common.parseInteger(map, "issueReqId"));
        // TODO: waiting for requirement completion

        issue.setIssueCategoryId(Common.parseInteger(map, "issueCategoryId"));
        if (null == issueCategoryDao.findById(issue.getIssueCategoryId())) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("该问题类型不存在");
            return null;
        }
        issue.setIssuePlatformId(Common.parseInteger(map, "issuePlatformId"));
        if (null == platformDao.findById(issue.getIssuePlatformId())) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("该平台不存在");
            return null;
        }

        issue.setIssueDescription(Common.parseString(map, "issueDescription"));
        if(issue.getIssueDescription() == null ||
                "".equals(issue.getIssueDescription().toString().trim())) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("问题描述不能为空");
            return null;
        } else if ()

        issue.setIssueSolution(Common.parseString(map, "issueSolution"));

        return issue;
    }
}