package hsoft.mobile.projectrecord.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReqTeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReqTeamExample() {
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

        public Criteria andReqteamidIsNull() {
            addCriterion("reqTeamId is null");
            return (Criteria) this;
        }

        public Criteria andReqteamidIsNotNull() {
            addCriterion("reqTeamId is not null");
            return (Criteria) this;
        }

        public Criteria andReqteamidEqualTo(Integer value) {
            addCriterion("reqTeamId =", value, "reqteamid");
            return (Criteria) this;
        }

        public Criteria andReqteamidNotEqualTo(Integer value) {
            addCriterion("reqTeamId <>", value, "reqteamid");
            return (Criteria) this;
        }

        public Criteria andReqteamidGreaterThan(Integer value) {
            addCriterion("reqTeamId >", value, "reqteamid");
            return (Criteria) this;
        }

        public Criteria andReqteamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("reqTeamId >=", value, "reqteamid");
            return (Criteria) this;
        }

        public Criteria andReqteamidLessThan(Integer value) {
            addCriterion("reqTeamId <", value, "reqteamid");
            return (Criteria) this;
        }

        public Criteria andReqteamidLessThanOrEqualTo(Integer value) {
            addCriterion("reqTeamId <=", value, "reqteamid");
            return (Criteria) this;
        }

        public Criteria andReqteamidIn(List<Integer> values) {
            addCriterion("reqTeamId in", values, "reqteamid");
            return (Criteria) this;
        }

        public Criteria andReqteamidNotIn(List<Integer> values) {
            addCriterion("reqTeamId not in", values, "reqteamid");
            return (Criteria) this;
        }

        public Criteria andReqteamidBetween(Integer value1, Integer value2) {
            addCriterion("reqTeamId between", value1, value2, "reqteamid");
            return (Criteria) this;
        }

        public Criteria andReqteamidNotBetween(Integer value1, Integer value2) {
            addCriterion("reqTeamId not between", value1, value2, "reqteamid");
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

        public Criteria andSchedidIsNull() {
            addCriterion("schedId is null");
            return (Criteria) this;
        }

        public Criteria andSchedidIsNotNull() {
            addCriterion("schedId is not null");
            return (Criteria) this;
        }

        public Criteria andSchedidEqualTo(Integer value) {
            addCriterion("schedId =", value, "schedid");
            return (Criteria) this;
        }

        public Criteria andSchedidNotEqualTo(Integer value) {
            addCriterion("schedId <>", value, "schedid");
            return (Criteria) this;
        }

        public Criteria andSchedidGreaterThan(Integer value) {
            addCriterion("schedId >", value, "schedid");
            return (Criteria) this;
        }

        public Criteria andSchedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedId >=", value, "schedid");
            return (Criteria) this;
        }

        public Criteria andSchedidLessThan(Integer value) {
            addCriterion("schedId <", value, "schedid");
            return (Criteria) this;
        }

        public Criteria andSchedidLessThanOrEqualTo(Integer value) {
            addCriterion("schedId <=", value, "schedid");
            return (Criteria) this;
        }

        public Criteria andSchedidIn(List<Integer> values) {
            addCriterion("schedId in", values, "schedid");
            return (Criteria) this;
        }

        public Criteria andSchedidNotIn(List<Integer> values) {
            addCriterion("schedId not in", values, "schedid");
            return (Criteria) this;
        }

        public Criteria andSchedidBetween(Integer value1, Integer value2) {
            addCriterion("schedId between", value1, value2, "schedid");
            return (Criteria) this;
        }

        public Criteria andSchedidNotBetween(Integer value1, Integer value2) {
            addCriterion("schedId not between", value1, value2, "schedid");
            return (Criteria) this;
        }

        public Criteria andMemberIsNull() {
            addCriterion("member is null");
            return (Criteria) this;
        }

        public Criteria andMemberIsNotNull() {
            addCriterion("member is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEqualTo(Integer value) {
            addCriterion("member =", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotEqualTo(Integer value) {
            addCriterion("member <>", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThan(Integer value) {
            addCriterion("member >", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("member >=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThan(Integer value) {
            addCriterion("member <", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberLessThanOrEqualTo(Integer value) {
            addCriterion("member <=", value, "member");
            return (Criteria) this;
        }

        public Criteria andMemberIn(List<Integer> values) {
            addCriterion("member in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotIn(List<Integer> values) {
            addCriterion("member not in", values, "member");
            return (Criteria) this;
        }

        public Criteria andMemberBetween(Integer value1, Integer value2) {
            addCriterion("member between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andMemberNotBetween(Integer value1, Integer value2) {
            addCriterion("member not between", value1, value2, "member");
            return (Criteria) this;
        }

        public Criteria andTaskIsNull() {
            addCriterion("task is null");
            return (Criteria) this;
        }

        public Criteria andTaskIsNotNull() {
            addCriterion("task is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEqualTo(String value) {
            addCriterion("task =", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotEqualTo(String value) {
            addCriterion("task <>", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskGreaterThan(String value) {
            addCriterion("task >", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskGreaterThanOrEqualTo(String value) {
            addCriterion("task >=", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskLessThan(String value) {
            addCriterion("task <", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskLessThanOrEqualTo(String value) {
            addCriterion("task <=", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskLike(String value) {
            addCriterion("task like", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotLike(String value) {
            addCriterion("task not like", value, "task");
            return (Criteria) this;
        }

        public Criteria andTaskIn(List<String> values) {
            addCriterion("task in", values, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotIn(List<String> values) {
            addCriterion("task not in", values, "task");
            return (Criteria) this;
        }

        public Criteria andTaskBetween(String value1, String value2) {
            addCriterion("task between", value1, value2, "task");
            return (Criteria) this;
        }

        public Criteria andTaskNotBetween(String value1, String value2) {
            addCriterion("task not between", value1, value2, "task");
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