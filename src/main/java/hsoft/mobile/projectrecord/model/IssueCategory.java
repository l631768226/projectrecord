package hsoft.mobile.projectrecord.model;

import java.util.Date;

public class IssueCategory {
    private Integer issueCategoryId;

    private String issueCategoryName;

    private Integer createid;

    private Date createtime;

    private Integer updateid;

    private Date updatetime;

    public Integer getIssueCategoryId() {
        return issueCategoryId;
    }

    public void setIssueCategoryId(Integer issueCategoryId) {
        this.issueCategoryId = issueCategoryId;
    }

    public String getIssueName() {
        return issueCategoryName;
    }

    public void setissueCategoryName(String issueCategoryName) {
        this.issueCategoryName = issueCategoryName == null ? null : issueCategoryName.trim();
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