package hsoft.mobile.projectrecord.model;

import java.util.Date;

public class Issue {
    private Integer issueId;

    private String projIndex;

    private Integer reqId;

    private Integer issueCategoryId;

    private String issueDescription;

    private Integer platformId;

    private String issueSolution;

    private Integer createId;

    private Date createTime;

    private Integer updateId;

    private Date updateTime;

    private Integer hide;

    public Integer getIssueId() {
        return issueId;
    }

    public void setIssueId(Integer issueId) {
        this.issueId = issueId;
    }

    public String getProjIndex() {
        return projIndex;
    }

    public void setProjIndex(String projIndex) {
        this.projIndex = projIndex == null ? null : projIndex.trim();
    }

    public Integer getReqId() {
        return reqId;
    }

    public void setReqId(Integer reqId) {
        this.reqId = reqId;
    }

    public Integer getIssueCategoryId() {
        return issueCategoryId;
    }

    public void setIssueCategoryId(Integer issueCategoryId) {
        this.issueCategoryId = issueCategoryId;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription == null ? null : issueDescription.trim();
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    public String getIssueSolution() {
        return issueSolution;
    }

    public void setIssueSolution(String issueSolution) {
        this.issueSolution = issueSolution == null ? null : issueSolution.trim();
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getHide() {
        return hide;
    }

    public void setHide(Integer hide) {
        this.hide = hide;
    }
}