package hsoft.mobile.projectrecord.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReqScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReqScheduleExample() {
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

        public Criteria andReqprincipleIsNull() {
            addCriterion("reqPrinciple is null");
            return (Criteria) this;
        }

        public Criteria andReqprincipleIsNotNull() {
            addCriterion("reqPrinciple is not null");
            return (Criteria) this;
        }

        public Criteria andReqprincipleEqualTo(Integer value) {
            addCriterion("reqPrinciple =", value, "reqprinciple");
            return (Criteria) this;
        }

        public Criteria andReqprincipleNotEqualTo(Integer value) {
            addCriterion("reqPrinciple <>", value, "reqprinciple");
            return (Criteria) this;
        }

        public Criteria andReqprincipleGreaterThan(Integer value) {
            addCriterion("reqPrinciple >", value, "reqprinciple");
            return (Criteria) this;
        }

        public Criteria andReqprincipleGreaterThanOrEqualTo(Integer value) {
            addCriterion("reqPrinciple >=", value, "reqprinciple");
            return (Criteria) this;
        }

        public Criteria andReqprincipleLessThan(Integer value) {
            addCriterion("reqPrinciple <", value, "reqprinciple");
            return (Criteria) this;
        }

        public Criteria andReqprincipleLessThanOrEqualTo(Integer value) {
            addCriterion("reqPrinciple <=", value, "reqprinciple");
            return (Criteria) this;
        }

        public Criteria andReqprincipleIn(List<Integer> values) {
            addCriterion("reqPrinciple in", values, "reqprinciple");
            return (Criteria) this;
        }

        public Criteria andReqprincipleNotIn(List<Integer> values) {
            addCriterion("reqPrinciple not in", values, "reqprinciple");
            return (Criteria) this;
        }

        public Criteria andReqprincipleBetween(Integer value1, Integer value2) {
            addCriterion("reqPrinciple between", value1, value2, "reqprinciple");
            return (Criteria) this;
        }

        public Criteria andReqprincipleNotBetween(Integer value1, Integer value2) {
            addCriterion("reqPrinciple not between", value1, value2, "reqprinciple");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteIsNull() {
            addCriterion("deadlineNote is null");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteIsNotNull() {
            addCriterion("deadlineNote is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteEqualTo(String value) {
            addCriterion("deadlineNote =", value, "deadlinenote");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteNotEqualTo(String value) {
            addCriterion("deadlineNote <>", value, "deadlinenote");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteGreaterThan(String value) {
            addCriterion("deadlineNote >", value, "deadlinenote");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteGreaterThanOrEqualTo(String value) {
            addCriterion("deadlineNote >=", value, "deadlinenote");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteLessThan(String value) {
            addCriterion("deadlineNote <", value, "deadlinenote");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteLessThanOrEqualTo(String value) {
            addCriterion("deadlineNote <=", value, "deadlinenote");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteLike(String value) {
            addCriterion("deadlineNote like", value, "deadlinenote");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteNotLike(String value) {
            addCriterion("deadlineNote not like", value, "deadlinenote");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteIn(List<String> values) {
            addCriterion("deadlineNote in", values, "deadlinenote");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteNotIn(List<String> values) {
            addCriterion("deadlineNote not in", values, "deadlinenote");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteBetween(String value1, String value2) {
            addCriterion("deadlineNote between", value1, value2, "deadlinenote");
            return (Criteria) this;
        }

        public Criteria andDeadlinenoteNotBetween(String value1, String value2) {
            addCriterion("deadlineNote not between", value1, value2, "deadlinenote");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteIsNull() {
            addCriterion("startTimeNote is null");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteIsNotNull() {
            addCriterion("startTimeNote is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteEqualTo(String value) {
            addCriterion("startTimeNote =", value, "starttimenote");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteNotEqualTo(String value) {
            addCriterion("startTimeNote <>", value, "starttimenote");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteGreaterThan(String value) {
            addCriterion("startTimeNote >", value, "starttimenote");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteGreaterThanOrEqualTo(String value) {
            addCriterion("startTimeNote >=", value, "starttimenote");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteLessThan(String value) {
            addCriterion("startTimeNote <", value, "starttimenote");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteLessThanOrEqualTo(String value) {
            addCriterion("startTimeNote <=", value, "starttimenote");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteLike(String value) {
            addCriterion("startTimeNote like", value, "starttimenote");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteNotLike(String value) {
            addCriterion("startTimeNote not like", value, "starttimenote");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteIn(List<String> values) {
            addCriterion("startTimeNote in", values, "starttimenote");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteNotIn(List<String> values) {
            addCriterion("startTimeNote not in", values, "starttimenote");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteBetween(String value1, String value2) {
            addCriterion("startTimeNote between", value1, value2, "starttimenote");
            return (Criteria) this;
        }

        public Criteria andStarttimenoteNotBetween(String value1, String value2) {
            addCriterion("startTimeNote not between", value1, value2, "starttimenote");
            return (Criteria) this;
        }

        public Criteria andCompletetimeIsNull() {
            addCriterion("completeTime is null");
            return (Criteria) this;
        }

        public Criteria andCompletetimeIsNotNull() {
            addCriterion("completeTime is not null");
            return (Criteria) this;
        }

        public Criteria andCompletetimeEqualTo(Date value) {
            addCriterion("completeTime =", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotEqualTo(Date value) {
            addCriterion("completeTime <>", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeGreaterThan(Date value) {
            addCriterion("completeTime >", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("completeTime >=", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeLessThan(Date value) {
            addCriterion("completeTime <", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeLessThanOrEqualTo(Date value) {
            addCriterion("completeTime <=", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeIn(List<Date> values) {
            addCriterion("completeTime in", values, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotIn(List<Date> values) {
            addCriterion("completeTime not in", values, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeBetween(Date value1, Date value2) {
            addCriterion("completeTime between", value1, value2, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotBetween(Date value1, Date value2) {
            addCriterion("completeTime not between", value1, value2, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteIsNull() {
            addCriterion("completeTimeNote is null");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteIsNotNull() {
            addCriterion("completeTimeNote is not null");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteEqualTo(String value) {
            addCriterion("completeTimeNote =", value, "completetimenote");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteNotEqualTo(String value) {
            addCriterion("completeTimeNote <>", value, "completetimenote");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteGreaterThan(String value) {
            addCriterion("completeTimeNote >", value, "completetimenote");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteGreaterThanOrEqualTo(String value) {
            addCriterion("completeTimeNote >=", value, "completetimenote");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteLessThan(String value) {
            addCriterion("completeTimeNote <", value, "completetimenote");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteLessThanOrEqualTo(String value) {
            addCriterion("completeTimeNote <=", value, "completetimenote");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteLike(String value) {
            addCriterion("completeTimeNote like", value, "completetimenote");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteNotLike(String value) {
            addCriterion("completeTimeNote not like", value, "completetimenote");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteIn(List<String> values) {
            addCriterion("completeTimeNote in", values, "completetimenote");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteNotIn(List<String> values) {
            addCriterion("completeTimeNote not in", values, "completetimenote");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteBetween(String value1, String value2) {
            addCriterion("completeTimeNote between", value1, value2, "completetimenote");
            return (Criteria) this;
        }

        public Criteria andCompletetimenoteNotBetween(String value1, String value2) {
            addCriterion("completeTimeNote not between", value1, value2, "completetimenote");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIsNull() {
            addCriterion("onlineTime is null");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIsNotNull() {
            addCriterion("onlineTime is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeEqualTo(Date value) {
            addCriterion("onlineTime =", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotEqualTo(Date value) {
            addCriterion("onlineTime <>", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeGreaterThan(Date value) {
            addCriterion("onlineTime >", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("onlineTime >=", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeLessThan(Date value) {
            addCriterion("onlineTime <", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeLessThanOrEqualTo(Date value) {
            addCriterion("onlineTime <=", value, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeIn(List<Date> values) {
            addCriterion("onlineTime in", values, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotIn(List<Date> values) {
            addCriterion("onlineTime not in", values, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeBetween(Date value1, Date value2) {
            addCriterion("onlineTime between", value1, value2, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimeNotBetween(Date value1, Date value2) {
            addCriterion("onlineTime not between", value1, value2, "onlinetime");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteIsNull() {
            addCriterion("onlineTimeNote is null");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteIsNotNull() {
            addCriterion("onlineTimeNote is not null");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteEqualTo(String value) {
            addCriterion("onlineTimeNote =", value, "onlinetimenote");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteNotEqualTo(String value) {
            addCriterion("onlineTimeNote <>", value, "onlinetimenote");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteGreaterThan(String value) {
            addCriterion("onlineTimeNote >", value, "onlinetimenote");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteGreaterThanOrEqualTo(String value) {
            addCriterion("onlineTimeNote >=", value, "onlinetimenote");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteLessThan(String value) {
            addCriterion("onlineTimeNote <", value, "onlinetimenote");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteLessThanOrEqualTo(String value) {
            addCriterion("onlineTimeNote <=", value, "onlinetimenote");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteLike(String value) {
            addCriterion("onlineTimeNote like", value, "onlinetimenote");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteNotLike(String value) {
            addCriterion("onlineTimeNote not like", value, "onlinetimenote");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteIn(List<String> values) {
            addCriterion("onlineTimeNote in", values, "onlinetimenote");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteNotIn(List<String> values) {
            addCriterion("onlineTimeNote not in", values, "onlinetimenote");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteBetween(String value1, String value2) {
            addCriterion("onlineTimeNote between", value1, value2, "onlinetimenote");
            return (Criteria) this;
        }

        public Criteria andOnlinetimenoteNotBetween(String value1, String value2) {
            addCriterion("onlineTimeNote not between", value1, value2, "onlinetimenote");
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