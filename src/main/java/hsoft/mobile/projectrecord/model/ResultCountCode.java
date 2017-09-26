package hsoft.mobile.projectrecord.model;

/**
 * 列表查询返回带count字段的结果model
 * @param <T> 列表类型
 * create by LY on 2017/9/22
 */
public class ResultCountCode<T> {
    //列表中数据的数量
    private int count;
    //列表类型
    private T valueof;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public T getValueof() {
        return valueof;
    }

    public void setValueof(T valueof) {
        this.valueof = valueof;
    }
}
