package hsoft.mobile.projectrecord.model;

import java.util.Date;

public class DocCategory {
    private Integer doccategoryid;

    private String categoryname;

    private Integer createid;

    private Date createtime;

    private Integer updateid;

    private Date updatetime;

    public Integer getDoccategoryid() {
        return doccategoryid;
    }

    public void setDoccategoryid(Integer doccategoryid) {
        this.doccategoryid = doccategoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname == null ? null : categoryname.trim();
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdateid() {
        return updateid;
    }

    public void setUpdateid(Integer updateid) {
        this.updateid = updateid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}