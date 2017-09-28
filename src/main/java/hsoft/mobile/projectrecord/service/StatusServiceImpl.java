package hsoft.mobile.projectrecord.service;

import hsoft.mobile.projectrecord.model.CheckResult;
import hsoft.mobile.projectrecord.model.User;
import hsoft.mobile.projectrecord.utils.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StatusServiceImpl implements StatusService {

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
}
