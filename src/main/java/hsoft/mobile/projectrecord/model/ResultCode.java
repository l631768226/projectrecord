package hsoft.mobile.projectrecord.model;

/**
 * 返回结果model
 * @param <T> 返回结果的类型
 * create by LY on 2017/9/22
 */

public class ResultCode<T> {
    //结果码
    private int rs;
    //提示信息
    private String msg;
    //返回结果
    private T value;

    public int getRs() {
        return rs;
    }

    public void setRs(int rs) {
        this.rs = rs;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
