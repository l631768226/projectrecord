package hsoft.mobile.projectrecord.model;

import hsoft.mobile.projectrecord.utils.Common;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class Issue extends BaseData
{
    private String issueProjIndex;

    private Integer issueReqId;

    private Integer issueCategoryId;

    private Integer issuePlatformId;

    private String issueDescription;

    private String issueSolution;

    public String getIssueProjIndex() {
        return issueProjIndex;
    }

    public void setIssueProjIndex(String issueProjIndex) {
        this.issueProjIndex = issueProjIndex;
    }

    public Integer getReqId() {
        return issueReqId;
    }

    public void setIssueReqId(Integer issueReqId) {
        this.issueReqId = issueReqId;
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
        this.issueDescription = issueDescription;
    }

    public Integer getIssuePlatformId() {
        return issuePlatformId;
    }

    public void setIssuePlatformId(Integer issuePlatformId) {
        this.issuePlatformId = issuePlatformId;
    }

    public String getIssueSolution() {
        return issueSolution;
    }

    public void setIssueSolution(String issueSolution) {
        this.issueSolution = issueSolution;
    }

}