package hsoft.mobile.projectrecord.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectInfoExample() {
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

        public Criteria andProjnameIsNull() {
            addCriterion("projName is null");
            return (Criteria) this;
        }

        public Criteria andProjnameIsNotNull() {
            addCriterion("projName is not null");
            return (Criteria) this;
        }

        public Criteria andProjnameEqualTo(String value) {
            addCriterion("projName =", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameNotEqualTo(String value) {
            addCriterion("projName <>", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameGreaterThan(String value) {
            addCriterion("projName >", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameGreaterThanOrEqualTo(String value) {
            addCriterion("projName >=", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameLessThan(String value) {
            addCriterion("projName <", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameLessThanOrEqualTo(String value) {
            addCriterion("projName <=", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameLike(String value) {
            addCriterion("projName like", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameNotLike(String value) {
            addCriterion("projName not like", value, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameIn(List<String> values) {
            addCriterion("projName in", values, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameNotIn(List<String> values) {
            addCriterion("projName not in", values, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameBetween(String value1, String value2) {
            addCriterion("projName between", value1, value2, "projname");
            return (Criteria) this;
        }

        public Criteria andProjnameNotBetween(String value1, String value2) {
            addCriterion("projName not between", value1, value2, "projname");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionIsNull() {
            addCriterion("projDescription is null");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionIsNotNull() {
            addCriterion("projDescription is not null");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionEqualTo(String value) {
            addCriterion("projDescription =", value, "projdescription");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionNotEqualTo(String value) {
            addCriterion("projDescription <>", value, "projdescription");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionGreaterThan(String value) {
            addCriterion("projDescription >", value, "projdescription");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("projDescription >=", value, "projdescription");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionLessThan(String value) {
            addCriterion("projDescription <", value, "projdescription");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionLessThanOrEqualTo(String value) {
            addCriterion("projDescription <=", value, "projdescription");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionLike(String value) {
            addCriterion("projDescription like", value, "projdescription");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionNotLike(String value) {
            addCriterion("projDescription not like", value, "projdescription");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionIn(List<String> values) {
            addCriterion("projDescription in", values, "projdescription");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionNotIn(List<String> values) {
            addCriterion("projDescription not in", values, "projdescription");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionBetween(String value1, String value2) {
            addCriterion("projDescription between", value1, value2, "projdescription");
            return (Criteria) this;
        }

        public Criteria andProjdescriptionNotBetween(String value1, String value2) {
            addCriterion("projDescription not between", value1, value2, "projdescription");
            return (Criteria) this;
        }

        public Criteria andProjmanagerIsNull() {
            addCriterion("projManager is null");
            return (Criteria) this;
        }

        public Criteria andProjmanagerIsNotNull() {
            addCriterion("projManager is not null");
            return (Criteria) this;
        }

        public Criteria andProjmanagerEqualTo(Integer value) {
            addCriterion("projManager =", value, "projmanager");
            return (Criteria) this;
        }

        public Criteria andProjmanagerNotEqualTo(Integer value) {
            addCriterion("projManager <>", value, "projmanager");
            return (Criteria) this;
        }

        public Criteria andProjmanagerGreaterThan(Integer value) {
            addCriterion("projManager >", value, "projmanager");
            return (Criteria) this;
        }

        public Criteria andProjmanagerGreaterThanOrEqualTo(Integer value) {
            addCriterion("projManager >=", value, "projmanager");
            return (Criteria) this;
        }

        public Criteria andProjmanagerLessThan(Integer value) {
            addCriterion("projManager <", value, "projmanager");
            return (Criteria) this;
        }

        public Criteria andProjmanagerLessThanOrEqualTo(Integer value) {
            addCriterion("projManager <=", value, "projmanager");
            return (Criteria) this;
        }

        public Criteria andProjmanagerIn(List<Integer> values) {
            addCriterion("projManager in", values, "projmanager");
            return (Criteria) this;
        }

        public Criteria andProjmanagerNotIn(List<Integer> values) {
            addCriterion("projManager not in", values, "projmanager");
            return (Criteria) this;
        }

        public Criteria andProjmanagerBetween(Integer value1, Integer value2) {
            addCriterion("projManager between", value1, value2, "projmanager");
            return (Criteria) this;
        }

        public Criteria andProjmanagerNotBetween(Integer value1, Integer value2) {
            addCriterion("projManager not between", value1, value2, "projmanager");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("deptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("deptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("deptId =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("deptId <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("deptId >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptId >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("deptId <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("deptId <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("deptId in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("deptId not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("deptId between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("deptId not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andProjscoreIsNull() {
            addCriterion("projScore is null");
            return (Criteria) this;
        }

        public Criteria andProjscoreIsNotNull() {
            addCriterion("projScore is not null");
            return (Criteria) this;
        }

        public Criteria andProjscoreEqualTo(Float value) {
            addCriterion("projScore =", value, "projscore");
            return (Criteria) this;
        }

        public Criteria andProjscoreNotEqualTo(Float value) {
            addCriterion("projScore <>", value, "projscore");
            return (Criteria) this;
        }

        public Criteria andProjscoreGreaterThan(Float value) {
            addCriterion("projScore >", value, "projscore");
            return (Criteria) this;
        }

        public Criteria andProjscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("projScore >=", value, "projscore");
            return (Criteria) this;
        }

        public Criteria andProjscoreLessThan(Float value) {
            addCriterion("projScore <", value, "projscore");
            return (Criteria) this;
        }

        public Criteria andProjscoreLessThanOrEqualTo(Float value) {
            addCriterion("projScore <=", value, "projscore");
            return (Criteria) this;
        }

        public Criteria andProjscoreIn(List<Float> values) {
            addCriterion("projScore in", values, "projscore");
            return (Criteria) this;
        }

        public Criteria andProjscoreNotIn(List<Float> values) {
            addCriterion("projScore not in", values, "projscore");
            return (Criteria) this;
        }

        public Criteria andProjscoreBetween(Float value1, Float value2) {
            addCriterion("projScore between", value1, value2, "projscore");
            return (Criteria) this;
        }

        public Criteria andProjscoreNotBetween(Float value1, Float value2) {
            addCriterion("projScore not between", value1, value2, "projscore");
            return (Criteria) this;
        }

        public Criteria andStatuscategoryidIsNull() {
            addCriterion("statusCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andStatuscategoryidIsNotNull() {
            addCriterion("statusCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andStatuscategoryidEqualTo(Integer value) {
            addCriterion("statusCategoryId =", value, "statuscategoryid");
            return (Criteria) this;
        }

        public Criteria andStatuscategoryidNotEqualTo(Integer value) {
            addCriterion("statusCategoryId <>", value, "statuscategoryid");
            return (Criteria) this;
        }

        public Criteria andStatuscategoryidGreaterThan(Integer value) {
            addCriterion("statusCategoryId >", value, "statuscategoryid");
            return (Criteria) this;
        }

        public Criteria andStatuscategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("statusCategoryId >=", value, "statuscategoryid");
            return (Criteria) this;
        }

        public Criteria andStatuscategoryidLessThan(Integer value) {
            addCriterion("statusCategoryId <", value, "statuscategoryid");
            return (Criteria) this;
        }

        public Criteria andStatuscategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("statusCategoryId <=", value, "statuscategoryid");
            return (Criteria) this;
        }

        public Criteria andStatuscategoryidIn(List<Integer> values) {
            addCriterion("statusCategoryId in", values, "statuscategoryid");
            return (Criteria) this;
        }

        public Criteria andStatuscategoryidNotIn(List<Integer> values) {
            addCriterion("statusCategoryId not in", values, "statuscategoryid");
            return (Criteria) this;
        }

        public Criteria andStatuscategoryidBetween(Integer value1, Integer value2) {
            addCriterion("statusCategoryId between", value1, value2, "statuscategoryid");
            return (Criteria) this;
        }

        public Criteria andStatuscategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("statusCategoryId not between", value1, value2, "statuscategoryid");
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