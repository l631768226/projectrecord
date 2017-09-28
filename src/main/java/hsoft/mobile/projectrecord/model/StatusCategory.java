package hsoft.mobile.projectrecord.model;

import java.util.Date;

public class StatusCategory {
    private Integer statuscategoryid;

    private String statusname;

    private Integer createid;

    private Date createtime;

    private Integer updateid;

    private Date updatetime;

    public Integer getStatuscategoryid() {
        return statuscategoryid;
    }

    public void setStatuscategoryid(Integer statuscategoryid) {
        this.statuscategoryid = statuscategoryid;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname == null ? null : statusname.trim();
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