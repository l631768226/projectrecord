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

        public Criteria andIssueidIsNull() {
            addCriterion("issueId is null");
            return (Criteria) this;
        }

        public Criteria andIssueidIsNotNull() {
            addCriterion("issueId is not null");
            return (Criteria) this;
        }

        public Criteria andIssueidEqualTo(Integer value) {
            addCriterion("issueId =", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidNotEqualTo(Integer value) {
            addCriterion("issueId <>", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidGreaterThan(Integer value) {
            addCriterion("issueId >", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidGreaterThanOrEqualTo(Integer value) {
            addCriterion("issueId >=", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidLessThan(Integer value) {
            addCriterion("issueId <", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidLessThanOrEqualTo(Integer value) {
            addCriterion("issueId <=", value, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidIn(List<Integer> values) {
            addCriterion("issueId in", values, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidNotIn(List<Integer> values) {
            addCriterion("issueId not in", values, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidBetween(Integer value1, Integer value2) {
            addCriterion("issueId between", value1, value2, "issueid");
            return (Criteria) this;
        }

        public Criteria andIssueidNotBetween(Integer value1, Integer value2) {
            addCriterion("issueId not between", value1, value2, "issueid");
            return (Criteria) this;
        }

        public Criteria andProjindexIsNull() {
            addCriterion("projIndex is null");
            return (Criteria) this;
        }

        public Criteria andProjindexIsNotNull() {
            addCriterion("projIndex is not null");
            return (Criteria) this;
        }

        public Criteria andProjindexEqualTo(String value) {
            addCriterion("projIndex =", value, "projindex");
            return (Criteria) this;
        }

        public Criteria andProjindexNotEqualTo(String value) {
            addCriterion("projIndex <>", value, "projindex");
            return (Criteria) this;
        }

        public Criteria andProjindexGreaterThan(String value) {
            addCriterion("projIndex >", value, "projindex");
            return (Criteria) this;
        }

        public Criteria andProjindexGreaterThanOrEqualTo(String value) {
            addCriterion("projIndex >=", value, "projindex");
            return (Criteria) this;
        }

        public Criteria andProjindexLessThan(String value) {
            addCriterion("projIndex <", value, "projindex");
            return (Criteria) this;
        }

        public Criteria andProjindexLessThanOrEqualTo(String value) {
            addCriterion("projIndex <=", value, "projindex");
            return (Criteria) this;
        }

        public Criteria andProjindexLike(String value) {
            addCriterion("projIndex like", value, "projindex");
            return (Criteria) this;
        }

        public Criteria andProjindexNotLike(String value) {
            addCriterion("projIndex not like", value, "projindex");
            return (Criteria) this;
        }

        public Criteria andProjindexIn(List<String> values) {
            addCriterion("projIndex in", values, "projindex");
            return (Criteria) this;
        }

        public Criteria andProjindexNotIn(List<String> values) {
            addCriterion("projIndex not in", values, "projindex");
            return (Criteria) this;
        }

        public Criteria andProjindexBetween(String value1, String value2) {
            addCriterion("projIndex between", value1, value2, "projindex");
            return (Criteria) this;
        }

        public Criteria andProjindexNotBetween(String value1, String value2) {
            addCriterion("projIndex not between", value1, value2, "projindex");
            return (Criteria) this;
        }

        public Criteria andReqidIsNull() {
            addCriterion("reqId is null");
            return (Criteria) this;
        }

        public Criteria andReqidIsNotNull() {
            addCriterion("reqId is not null");
            return (Criteria) this;
        }

        public Criteria andReqidEqualTo(Integer value) {
            addCriterion("reqId =", value, "reqid");
            return (Criteria) this;
        }

        public Criteria andReqidNotEqualTo(Integer value) {
            addCriterion("reqId <>", value, "reqid");
            return (Criteria) this;
        }

        public Criteria andReqidGreaterThan(Integer value) {
            addCriterion("reqId >", value, "reqid");
            return (Criteria) this;
        }

        public Criteria andReqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reqId >=", value, "reqid");
            return (Criteria) this;
        }

        public Criteria andReqidLessThan(Integer value) {
            addCriterion("reqId <", value, "reqid");
            return (Criteria) this;
        }

        public Criteria andReqidLessThanOrEqualTo(Integer value) {
            addCriterion("reqId <=", value, "reqid");
            return (Criteria) this;
        }

        public Criteria andReqidIn(List<Integer> values) {
            addCriterion("reqId in", values, "reqid");
            return (Criteria) this;
        }

        public Criteria andReqidNotIn(List<Integer> values) {
            addCriterion("reqId not in", values, "reqid");
            return (Criteria) this;
        }

        public Criteria andReqidBetween(Integer value1, Integer value2) {
            addCriterion("reqId between", value1, value2, "reqid");
            return (Criteria) this;
        }

        public Criteria andReqidNotBetween(Integer value1, Integer value2) {
            addCriterion("reqId not between", value1, value2, "reqid");
            return (Criteria) this;
        }

        public Criteria andIssuecategoryidIsNull() {
            addCriterion("issueCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andIssuecategoryidIsNotNull() {
            addCriterion("issueCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andIssuecategoryidEqualTo(Integer value) {
            addCriterion("issueCategoryId =", value, "issuecategoryid");
            return (Criteria) this;
        }

        public Criteria andIssuecategoryidNotEqualTo(Integer value) {
            addCriterion("issueCategoryId <>", value, "issuecategoryid");
            return (Criteria) this;
        }

        public Criteria andIssuecategoryidGreaterThan(Integer value) {
            addCriterion("issueCategoryId >", value, "issuecategoryid");
            return (Criteria) this;
        }

        public Criteria andIssuecategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("issueCategoryId >=", value, "issuecategoryid");
            return (Criteria) this;
        }

        public Criteria andIssuecategoryidLessThan(Integer value) {
            addCriterion("issueCategoryId <", value, "issuecategoryid");
            return (Criteria) this;
        }

        public Criteria andIssuecategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("issueCategoryId <=", value, "issuecategoryid");
            return (Criteria) this;
        }

        public Criteria andIssuecategoryidIn(List<Integer> values) {
            addCriterion("issueCategoryId in", values, "issuecategoryid");
            return (Criteria) this;
        }

        public Criteria andIssuecategoryidNotIn(List<Integer> values) {
            addCriterion("issueCategoryId not in", values, "issuecategoryid");
            return (Criteria) this;
        }

        public Criteria andIssuecategoryidBetween(Integer value1, Integer value2) {
            addCriterion("issueCategoryId between", value1, value2, "issuecategoryid");
            return (Criteria) this;
        }

        public Criteria andIssuecategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("issueCategoryId not between", value1, value2, "issuecategoryid");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionIsNull() {
            addCriterion("issueDescription is null");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionIsNotNull() {
            addCriterion("issueDescription is not null");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionEqualTo(String value) {
            addCriterion("issueDescription =", value, "issuedescription");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionNotEqualTo(String value) {
            addCriterion("issueDescription <>", value, "issuedescription");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionGreaterThan(String value) {
            addCriterion("issueDescription >", value, "issuedescription");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("issueDescription >=", value, "issuedescription");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionLessThan(String value) {
            addCriterion("issueDescription <", value, "issuedescription");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionLessThanOrEqualTo(String value) {
            addCriterion("issueDescription <=", value, "issuedescription");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionLike(String value) {
            addCriterion("issueDescription like", value, "issuedescription");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionNotLike(String value) {
            addCriterion("issueDescription not like", value, "issuedescription");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionIn(List<String> values) {
            addCriterion("issueDescription in", values, "issuedescription");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionNotIn(List<String> values) {
            addCriterion("issueDescription not in", values, "issuedescription");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionBetween(String value1, String value2) {
            addCriterion("issueDescription between", value1, value2, "issuedescription");
            return (Criteria) this;
        }

        public Criteria andIssuedescriptionNotBetween(String value1, String value2) {
            addCriterion("issueDescription not between", value1, value2, "issuedescription");
            return (Criteria) this;
        }

        public Criteria andPlatformidIsNull() {
            addCriterion("platformId is null");
            return (Criteria) this;
        }

        public Criteria andPlatformidIsNotNull() {
            addCriterion("platformId is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformidEqualTo(Integer value) {
            addCriterion("platformId =", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotEqualTo(Integer value) {
            addCriterion("platformId <>", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThan(Integer value) {
            addCriterion("platformId >", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThanOrEqualTo(Integer value) {
            addCriterion("platformId >=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThan(Integer value) {
            addCriterion("platformId <", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThanOrEqualTo(Integer value) {
            addCriterion("platformId <=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidIn(List<Integer> values) {
            addCriterion("platformId in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotIn(List<Integer> values) {
            addCriterion("platformId not in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidBetween(Integer value1, Integer value2) {
            addCriterion("platformId between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotBetween(Integer value1, Integer value2) {
            addCriterion("platformId not between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionIsNull() {
            addCriterion("issueSolution is null");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionIsNotNull() {
            addCriterion("issueSolution is not null");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionEqualTo(String value) {
            addCriterion("issueSolution =", value, "issuesolution");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionNotEqualTo(String value) {
            addCriterion("issueSolution <>", value, "issuesolution");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionGreaterThan(String value) {
            addCriterion("issueSolution >", value, "issuesolution");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionGreaterThanOrEqualTo(String value) {
            addCriterion("issueSolution >=", value, "issuesolution");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionLessThan(String value) {
            addCriterion("issueSolution <", value, "issuesolution");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionLessThanOrEqualTo(String value) {
            addCriterion("issueSolution <=", value, "issuesolution");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionLike(String value) {
            addCriterion("issueSolution like", value, "issuesolution");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionNotLike(String value) {
            addCriterion("issueSolution not like", value, "issuesolution");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionIn(List<String> values) {
            addCriterion("issueSolution in", values, "issuesolution");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionNotIn(List<String> values) {
            addCriterion("issueSolution not in", values, "issuesolution");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionBetween(String value1, String value2) {
            addCriterion("issueSolution between", value1, value2, "issuesolution");
            return (Criteria) this;
        }

        public Criteria andIssuesolutionNotBetween(String value1, String value2) {
            addCriterion("issueSolution not between", value1, value2, "issuesolution");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNull() {
            addCriterion("createId is null");
            return (Criteria) this;
        }

        public Criteria andCreateidIsNotNull() {
            addCriterion("createId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateidEqualTo(Integer value) {
            addCriterion("createId =", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotEqualTo(Integer value) {
            addCriterion("createId <>", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThan(Integer value) {
            addCriterion("createId >", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("createId >=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThan(Integer value) {
            addCriterion("createId <", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidLessThanOrEqualTo(Integer value) {
            addCriterion("createId <=", value, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidIn(List<Integer> values) {
            addCriterion("createId in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotIn(List<Integer> values) {
            addCriterion("createId not in", values, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidBetween(Integer value1, Integer value2) {
            addCriterion("createId between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreateidNotBetween(Integer value1, Integer value2) {
            addCriterion("createId not between", value1, value2, "createid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNull() {
            addCriterion("updateId is null");
            return (Criteria) this;
        }

        public Criteria andUpdateidIsNotNull() {
            addCriterion("updateId is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateidEqualTo(Integer value) {
            addCriterion("updateId =", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotEqualTo(Integer value) {
            addCriterion("updateId <>", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThan(Integer value) {
            addCriterion("updateId >", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("updateId >=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThan(Integer value) {
            addCriterion("updateId <", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidLessThanOrEqualTo(Integer value) {
            addCriterion("updateId <=", value, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidIn(List<Integer> values) {
            addCriterion("updateId in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotIn(List<Integer> values) {
            addCriterion("updateId not in", values, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidBetween(Integer value1, Integer value2) {
            addCriterion("updateId between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdateidNotBetween(Integer value1, Integer value2) {
            addCriterion("updateId not between", value1, value2, "updateid");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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