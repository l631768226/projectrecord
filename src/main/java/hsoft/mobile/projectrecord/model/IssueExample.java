package hsoft.mobile.projectrecord.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IssueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IssueExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIssueIdIsNull() {
            addCriterion("issue_id is null");
            return (Criteria) this;
        }

        public Criteria andIssueIdIsNotNull() {
            addCriterion("issue_id is not null");
            return (Criteria) this;
        }

        public Criteria andIssueIdEqualTo(Integer value) {
            addCriterion("issue_id =", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotEqualTo(Integer value) {
            addCriterion("issue_id <>", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThan(Integer value) {
            addCriterion("issue_id >", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("issue_id >=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThan(Integer value) {
            addCriterion("issue_id <", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdLessThanOrEqualTo(Integer value) {
            addCriterion("issue_id <=", value, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdIn(List<Integer> values) {
            addCriterion("issue_id in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotIn(List<Integer> values) {
            addCriterion("issue_id not in", values, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdBetween(Integer value1, Integer value2) {
            addCriterion("issue_id between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andIssueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("issue_id not between", value1, value2, "issueId");
            return (Criteria) this;
        }

        public Criteria andProjIndexIsNull() {
            addCriterion("proj_index is null");
            return (Criteria) this;
        }

        public Criteria andProjIndexIsNotNull() {
            addCriterion("proj_index is not null");
            return (Criteria) this;
        }

        public Criteria andProjIndexEqualTo(String value) {
            addCriterion("proj_index =", value, "projIndex");
            return (Criteria) this;
        }

        public Criteria andProjIndexNotEqualTo(String value) {
            addCriterion("proj_index <>", value, "projIndex");
            return (Criteria) this;
        }

        public Criteria andProjIndexGreaterThan(String value) {
            addCriterion("proj_index >", value, "projIndex");
            return (Criteria) this;
        }

        public Criteria andProjIndexGreaterThanOrEqualTo(String value) {
            addCriterion("proj_index >=", value, "projIndex");
            return (Criteria) this;
        }

        public Criteria andProjIndexLessThan(String value) {
            addCriterion("proj_index <", value, "projIndex");
            return (Criteria) this;
        }

        public Criteria andProjIndexLessThanOrEqualTo(String value) {
            addCriterion("proj_index <=", value, "projIndex");
            return (Criteria) this;
        }

        public Criteria andProjIndexLike(String value) {
            addCriterion("proj_index like", value, "projIndex");
            return (Criteria) this;
        }

        public Criteria andProjIndexNotLike(String value) {
            addCriterion("proj_index not like", value, "projIndex");
            return (Criteria) this;
        }

        public Criteria andProjIndexIn(List<String> values) {
            addCriterion("proj_index in", values, "projIndex");
            return (Criteria) this;
        }

        public Criteria andProjIndexNotIn(List<String> values) {
            addCriterion("proj_index not in", values, "projIndex");
            return (Criteria) this;
        }

        public Criteria andProjIndexBetween(String value1, String value2) {
            addCriterion("proj_index between", value1, value2, "projIndex");
            return (Criteria) this;
        }

        public Criteria andProjIndexNotBetween(String value1, String value2) {
            addCriterion("proj_index not between", value1, value2, "projIndex");
            return (Criteria) this;
        }

        public Criteria andReqIdIsNull() {
            addCriterion("req_id is null");
            return (Criteria) this;
        }

        public Criteria andReqIdIsNotNull() {
            addCriterion("req_id is not null");
            return (Criteria) this;
        }

        public Criteria andReqIdEqualTo(Integer value) {
            addCriterion("req_id =", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotEqualTo(Integer value) {
            addCriterion("req_id <>", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdGreaterThan(Integer value) {
            addCriterion("req_id >", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("req_id >=", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLessThan(Integer value) {
            addCriterion("req_id <", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdLessThanOrEqualTo(Integer value) {
            addCriterion("req_id <=", value, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdIn(List<Integer> values) {
            addCriterion("req_id in", values, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotIn(List<Integer> values) {
            addCriterion("req_id not in", values, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdBetween(Integer value1, Integer value2) {
            addCriterion("req_id between", value1, value2, "reqId");
            return (Criteria) this;
        }

        public Criteria andReqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("req_id not between", value1, value2, "reqId");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryIdIsNull() {
            addCriterion("issue_category_id is null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryIdIsNotNull() {
            addCriterion("issue_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryIdEqualTo(Integer value) {
            addCriterion("issue_category_id =", value, "issueCategoryId");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryIdNotEqualTo(Integer value) {
            addCriterion("issue_category_id <>", value, "issueCategoryId");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryIdGreaterThan(Integer value) {
            addCriterion("issue_category_id >", value, "issueCategoryId");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("issue_category_id >=", value, "issueCategoryId");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryIdLessThan(Integer value) {
            addCriterion("issue_category_id <", value, "issueCategoryId");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("issue_category_id <=", value, "issueCategoryId");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryIdIn(List<Integer> values) {
            addCriterion("issue_category_id in", values, "issueCategoryId");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryIdNotIn(List<Integer> values) {
            addCriterion("issue_category_id not in", values, "issueCategoryId");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("issue_category_id between", value1, value2, "issueCategoryId");
            return (Criteria) this;
        }

        public Criteria andIssueCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("issue_category_id not between", value1, value2, "issueCategoryId");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionIsNull() {
            addCriterion("issue_description is null");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionIsNotNull() {
            addCriterion("issue_description is not null");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionEqualTo(String value) {
            addCriterion("issue_description =", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionNotEqualTo(String value) {
            addCriterion("issue_description <>", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionGreaterThan(String value) {
            addCriterion("issue_description >", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("issue_description >=", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionLessThan(String value) {
            addCriterion("issue_description <", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionLessThanOrEqualTo(String value) {
            addCriterion("issue_description <=", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionLike(String value) {
            addCriterion("issue_description like", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionNotLike(String value) {
            addCriterion("issue_description not like", value, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionIn(List<String> values) {
            addCriterion("issue_description in", values, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionNotIn(List<String> values) {
            addCriterion("issue_description not in", values, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionBetween(String value1, String value2) {
            addCriterion("issue_description between", value1, value2, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andIssueDescriptionNotBetween(String value1, String value2) {
            addCriterion("issue_description not between", value1, value2, "issueDescription");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNull() {
            addCriterion("platform_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNotNull() {
            addCriterion("platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdEqualTo(Integer value) {
            addCriterion("platform_id =", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotEqualTo(Integer value) {
            addCriterion("platform_id <>", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThan(Integer value) {
            addCriterion("platform_id >", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform_id >=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThan(Integer value) {
            addCriterion("platform_id <", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThanOrEqualTo(Integer value) {
            addCriterion("platform_id <=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIn(List<Integer> values) {
            addCriterion("platform_id in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotIn(List<Integer> values) {
            addCriterion("platform_id not in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdBetween(Integer value1, Integer value2) {
            addCriterion("platform_id between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotBetween(Integer value1, Integer value2) {
            addCriterion("platform_id not between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionIsNull() {
            addCriterion("issue_solution is null");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionIsNotNull() {
            addCriterion("issue_solution is not null");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionEqualTo(String value) {
            addCriterion("issue_solution =", value, "issueSolution");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionNotEqualTo(String value) {
            addCriterion("issue_solution <>", value, "issueSolution");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionGreaterThan(String value) {
            addCriterion("issue_solution >", value, "issueSolution");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionGreaterThanOrEqualTo(String value) {
            addCriterion("issue_solution >=", value, "issueSolution");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionLessThan(String value) {
            addCriterion("issue_solution <", value, "issueSolution");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionLessThanOrEqualTo(String value) {
            addCriterion("issue_solution <=", value, "issueSolution");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionLike(String value) {
            addCriterion("issue_solution like", value, "issueSolution");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionNotLike(String value) {
            addCriterion("issue_solution not like", value, "issueSolution");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionIn(List<String> values) {
            addCriterion("issue_solution in", values, "issueSolution");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionNotIn(List<String> values) {
            addCriterion("issue_solution not in", values, "issueSolution");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionBetween(String value1, String value2) {
            addCriterion("issue_solution between", value1, value2, "issueSolution");
            return (Criteria) this;
        }

        public Criteria andIssueSolutionNotBetween(String value1, String value2) {
            addCriterion("issue_solution not between", value1, value2, "issueSolution");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Integer value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Integer value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Integer value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Integer value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Integer value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Integer> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Integer> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Integer value1, Integer value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Integer value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Integer value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Integer value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Integer value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Integer> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Integer> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Integer value1, Integer value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andHideIsNull() {
            addCriterion("hide is null");
            return (Criteria) this;
        }

        public Criteria andHideIsNotNull() {
            addCriterion("hide is not null");
            return (Criteria) this;
        }

        public Criteria andHideEqualTo(Integer value) {
            addCriterion("hide =", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotEqualTo(Integer value) {
            addCriterion("hide <>", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideGreaterThan(Integer value) {
            addCriterion("hide >", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideGreaterThanOrEqualTo(Integer value) {
            addCriterion("hide >=", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLessThan(Integer value) {
            addCriterion("hide <", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideLessThanOrEqualTo(Integer value) {
            addCriterion("hide <=", value, "hide");
            return (Criteria) this;
        }

        public Criteria andHideIn(List<Integer> values) {
            addCriterion("hide in", values, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotIn(List<Integer> values) {
            addCriterion("hide not in", values, "hide");
            return (Criteria) this;
        }

        public Criteria andHideBetween(Integer value1, Integer value2) {
            addCriterion("hide between", value1, value2, "hide");
            return (Criteria) this;
        }

        public Criteria andHideNotBetween(Integer value1, Integer value2) {
            addCriterion("hide not between", value1, value2, "hide");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}