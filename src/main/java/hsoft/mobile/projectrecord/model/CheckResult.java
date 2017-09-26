package hsoft.mobile.projectrecord.model;

/**
 * create by LY on 2017/9/25
 */
public class CheckResult {

    private int checkCode;
    private int operatorId;
    private String checkMsg;

    public int getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(int checkCode) {
        this.checkCode = checkCode;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public String getCheckMsg() {
        return checkMsg;
    }

    public void setCheckMsg(String checkMsg) {
        this.checkMsg = checkMsg;
    }
}
