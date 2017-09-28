package hsoft.mobile.projectrecord.service;

import com.google.gson.Gson;
import com.sun.istack.internal.Nullable;
import hsoft.mobile.projectrecord.dao.DepartmentDao;
import hsoft.mobile.projectrecord.mapper.DepartmentMapper;
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
 * 问题信息Service
 * create by TX on 2017/9/26
 */

@Service
public class IssueServiceImpl implements IssueService {

    @Autowired
    private ValidationService validationService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private DepartmentDao departmentDao;

    private boolean localtest = Common.localtest;

    @Override
    public String processCreate(Map<String, String> map) {
        Gson gson = new Gson();
        ResultCode<Department> resultCode = new ResultCode<Department>();
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
            Department department;
            try {
                department = parseData(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入数据错误！");
                break;
            }

            // 3. check department name
            checkResult = checkDataFormat(department);
            if (checkResult.getCheckCode() < 0) break;

            // 4. check database
            checkResult = checkDatabaseByName(department.getDeptname());
            if (checkResult.getCheckCode() < 0) break;

            // 5. insert data to database
            department.setCreateid(user.getUserid());
            department.setCreatetime(new Date());
            departmentMapper.insertSelective(department);

            resultCode.setRs(1);
            resultCode.setValue(department);
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
        ResultCode<Department> resultCode = new ResultCode<Department>();
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
            Department department;
            try {
                department = parseData(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入数据错误！");
                break;
            }

            // 3. check department name
            checkResult = checkDataFormat(department);
            if (checkResult.getCheckCode() < 0) break;

            // 4. check database
            checkResult = checkDatabaseByIdAndName(department.getDeptid(), department.getDeptname());
            if (checkResult.getCheckCode() < 0) break;

            // 5. update data to database
            department.setUpdateid(user.getUserid());
            department.setUpdatetime(new Date());
            departmentMapper.updateByPrimaryKeySelective(department);

            resultCode.setRs(1);
            resultCode.setValue(department);
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
        ResultCode<Department> resultCode = new ResultCode<Department>();
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
            Department department;
            try {
                department = parseData(map);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                checkResult.setCheckCode(-1);
                checkResult.setCheckMsg("传入数据错误！");
                break;
            }

            // 3. check database
            checkResult = checkDatabaseById(department.getDeptid());
            if (checkResult.getCheckCode() < 0) break;

            // 5. delete data from database
            departmentMapper.deleteByPrimaryKey(department.getDeptid());

            resultCode.setRs(1);
            resultCode.setValue(department);
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
        ResultCode<List<Department>> resultCode = new ResultCode<List<Department>>();

        if (tokenService.processCheckToken()) {
            List<Department> list = departmentDao.findList();
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
     * 将前端传入的数据置入model中
     *
     * @param map 前端传入的信息
     * @return 平台信息model
     */
    private Department parseData(Map<String, String> map) throws UnsupportedEncodingException {
        Department department = new Department();
        String departmentId = map.get("departmentId");
        String departmentName = map.get("departmentName");
        if (departmentId != null && !"".equals(departmentId)) {
            if(!localtest){
                departmentId = new String(FBase64.decode(departmentId));
            }
            department.setDeptid(Integer.valueOf(departmentId));
        }
        if (departmentName != null && !"".equals(departmentName)) {
            if(!localtest){
                departmentName = new String(FBase64.decode(departmentName));
            }
            department.setDeptname(departmentName);
        }
        return department;
    }

    private User getUser(CheckResult checkResult){
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
     * @param department         出入信息
     * @return 校验结果 checkCode字段 < 0 则校验不通过
     */
    private CheckResult checkDataFormat(@Nullable Department department) {
        CheckResult checkResult = new CheckResult();
        List<Validation> validations = new ArrayList<Validation>();
        String departmentName = department.getDeptname();
        validationService.verifyString("部门名称", departmentName, "validation",
                "2", "10", false, validations);
        if (!validations.isEmpty()) { // 如果没通过校验
            Validation validation = validations.get(0);
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg(validation.getField() + validation.getError());
        } else { // 若通过全部校验,则将操作人员的id置入checkresult并返回
            checkResult.setCheckCode(1);
        }
        return checkResult;
    }

    /**
     * 校验是否可以进行插入或修改操作
     *
     * @param departmentName 部门名称
     * @return true可以/false不可以
     */
    private CheckResult checkDatabaseByName(String departmentName) {
        CheckResult checkResult = new CheckResult();
        List<Department> list = departmentDao.findByName(departmentName);
        if (!list.isEmpty()) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("该部门名称已存在");
        } else {
            checkResult.setCheckCode(1);
        }
        return checkResult;
    }
    private CheckResult checkDatabaseById(int departmentId) {
        CheckResult checkResult = new CheckResult();
        if (departmentDao.findById(departmentId) == null) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("该部门ID不存在");
        } else {
            checkResult.setCheckCode(1);
        }
        return checkResult;
    }
    private CheckResult checkDatabaseByIdAndName(int departmentId, String departmentName) {
        CheckResult checkResult = new CheckResult();
        if (departmentDao.findById(departmentId) == null) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("该部门ID不存在");
        } else if (departmentDao.findByIdOrName(departmentId, departmentName).size() > 1){
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg("该部门名称已存在");
        } else {
            checkResult.setCheckCode(1);
        }
        return checkResult;
    }

}