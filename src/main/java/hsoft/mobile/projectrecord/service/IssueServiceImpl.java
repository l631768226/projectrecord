package hsoft.mobile.projectrecord.service;

import com.google.gson.Gson;
import hsoft.mobile.projectrecord.dao.IssueCategoryDao;
import hsoft.mobile.projectrecord.dao.IssueDao;
import hsoft.mobile.projectrecord.dao.PlatformDao;
import hsoft.mobile.projectrecord.dao.ProjectDao;
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
 * 问题信息 Service
 * create by TX on 2017/9/27
 */

@Service
public class IssueServiceImpl implements IssueCategoryService {

    private static int CREATE = 0;
    private static int UPDATE = 1;
    private static int DELETE = 2;

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
        ResultCode<Issue> resultCode = new ResultCode<>();
        CheckResult checkResult = new CheckResult();

        do {
            // 1.check user login and Authority, priviledge
            User user = tokenService.getUser(checkResult, tokenService.PROJECT_MANAGER);
            if (checkResult.getCheckCode() < 0) break;

            // 2. extract data and check data format
            Issue issue = parseIssue(map, CREATE, checkResult);
            if (checkResult.getCheckCode() < 0) break;

            // 3. insert data to database
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
        ResultCode<Issue> resultCode = new ResultCode<>();
        CheckResult checkResult = new CheckResult();

        do {
            // 1.check user Authority（irrelevant to business）
            User user = tokenService.getUser(checkResult, tokenService.PROJECT_MANAGER);
            if (checkResult.getCheckCode() < 0) break;

            // 2. extract data and check data format
            Issue issue = parseIssue(map, UPDATE, checkResult);
            if (checkResult.getCheckCode() < 0) break;

            // 3. update data to database
            issue.setUpdateId(user.getUserid());
            issue.setUpdateTime(new Date());
            issueMapper.updateByPrimaryKeySelective(issue);

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
    public String processDelete(Map<String, String> map) {
        Gson gson = new Gson();
        ResultCode<Issue> resultCode = new ResultCode<Issue>();
        CheckResult checkResult = new CheckResult();

        do {
            // 1.check user Authority
            User user = tokenService.getUser(checkResult, tokenService.PROJECT_MANAGER);
            if (checkResult.getCheckCode() < 0) break;


            // 2. extract data
            Issue issue = parseIssue(map, DELETE, checkResult);
            if (checkResult.getCheckCode() < 0) break;

            // 3. delete data from database
            issue.setUpdateId(user.getUserid());
            issue.setUpdateTime(new Date());
            issueMapper.deleteByPrimaryKey(issue.getId());

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
    public String processList() {
        Gson gson = new Gson();
        ResultCode<List<Issue>> resultCode = new ResultCode<List<Issue>>();

        if (tokenService.processCheckToken()) {
            List<Issue> list = issueDao.findList();
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
     * @return Issue Model
     */
    private Issue parseIssue(Map<String, String> map, int flag, CheckResult checkResult){
        Issue issue = new Issue();
        List<Validation> validations = new ArrayList<Validation>();
        checkResult = new CheckResult();

        try {
            issue.setId(Common.parseInteger(map,"issueId"));
            if (UPDATE == flag || DELETE == flag) { // 数据库中应该存在传入的问题编号
                if (null == issueDao.findById(issue.getId())) {
                    checkResult.setCheckCode(-1);
                    checkResult.setCheckMsg("问题编号不存在");
                    return null;
                }
            }

            if (DELETE == flag) {
                return issue;
            }

            issue.setIssueProjIndex(Common.parseString(map, "issueProjIndex"));
            if (null == projectDao.findByIndex(issue.getIssueProjIndex())) {
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
            validationService.verifyString("问题描述", issue.getIssueDescription(), "validation",
                    "1", "255", false, validations);

            issue.setIssueSolution(Common.parseString(map, "issueSolution"));
            validationService.verifyString("解决方案或后果", issue.getIssueSolution(), "validation",
                    "1", "255", true, validations);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("传入数据错误！");
        }
        if (!validations.isEmpty()) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg(validations.get(0).getField() + validations.get(0).getError());
            return null;
        }

        return issue;
    }
}