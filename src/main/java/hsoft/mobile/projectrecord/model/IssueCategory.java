package hsoft.mobile.projectrecord.model;

import java.util.Date;

public class IssueCategory {
    private Integer issuecategoryid;

    private String issuename;

    private Integer createid;

    private Date createtime;

    private Integer updateid;

    private Date updatetime;

    public Integer getIssuecategoryid() {
        return issuecategoryid;
    }

    public void setIssuecategoryid(Integer issuecategoryid) {
        this.issuecategoryid = issuecategoryid;
    }

    public String getIssuename() {
        return issuename;
    }

    public void setIssuename(String issuename) {
        this.issuename = issuename == null ? null : issuename.trim();
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