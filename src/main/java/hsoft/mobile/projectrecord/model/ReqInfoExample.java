package hsoft.mobile.projectrecord.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReqInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReqInfoExample() {
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

        public Criteria andReqnameIsNull() {
            addCriterion("reqName is null");
            return (Criteria) this;
        }

        public Criteria andReqnameIsNotNull() {
            addCriterion("reqName is not null");
            return (Criteria) this;
        }

        public Criteria andReqnameEqualTo(String value) {
            addCriterion("reqName =", value, "reqname");
            return (Criteria) this;
        }

        public Criteria andReqnameNotEqualTo(String value) {
            addCriterion("reqName <>", value, "reqname");
            return (Criteria) this;
        }

        public Criteria andReqnameGreaterThan(String value) {
            addCriterion("reqName >", value, "reqname");
            return (Criteria) this;
        }

        public Criteria andReqnameGreaterThanOrEqualTo(String value) {
            addCriterion("reqName >=", value, "reqname");
            return (Criteria) this;
        }

        public Criteria andReqnameLessThan(String value) {
            addCriterion("reqName <", value, "reqname");
            return (Criteria) this;
        }

        public Criteria andReqnameLessThanOrEqualTo(String value) {
            addCriterion("reqName <=", value, "reqname");
            return (Criteria) this;
        }

        public Criteria andReqnameLike(String value) {
            addCriterion("reqName like", value, "reqname");
            return (Criteria) this;
        }

        public Criteria andReqnameNotLike(String value) {
            addCriterion("reqName not like", value, "reqname");
            return (Criteria) this;
        }

        public Criteria andReqnameIn(List<String> values) {
            addCriterion("reqName in", values, "reqname");
            return (Criteria) this;
        }

        public Criteria andReqnameNotIn(List<String> values) {
            addCriterion("reqName not in", values, "reqname");
            return (Criteria) this;
        }

        public Criteria andReqnameBetween(String value1, String value2) {
            addCriterion("reqName between", value1, value2, "reqname");
            return (Criteria) this;
        }

        public Criteria andReqnameNotBetween(String value1, String value2) {
            addCriterion("reqName not between", value1, value2, "reqname");
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

        public Criteria andStatusnoteIsNull() {
            addCriterion("statusNote is null");
            return (Criteria) this;
        }

        public Criteria andStatusnoteIsNotNull() {
            addCriterion("statusNote is not null");
            return (Criteria) this;
        }

        public Criteria andStatusnoteEqualTo(String value) {
            addCriterion("statusNote =", value, "statusnote");
            return (Criteria) this;
        }

        public Criteria andStatusnoteNotEqualTo(String value) {
            addCriterion("statusNote <>", value, "statusnote");
            return (Criteria) this;
        }

        public Criteria andStatusnoteGreaterThan(String value) {
            addCriterion("statusNote >", value, "statusnote");
            return (Criteria) this;
        }

        public Criteria andStatusnoteGreaterThanOrEqualTo(String value) {
            addCriterion("statusNote >=", value, "statusnote");
            return (Criteria) this;
        }

        public Criteria andStatusnoteLessThan(String value) {
            addCriterion("statusNote <", value, "statusnote");
            return (Criteria) this;
        }

        public Criteria andStatusnoteLessThanOrEqualTo(String value) {
            addCriterion("statusNote <=", value, "statusnote");
            return (Criteria) this;
        }

        public Criteria andStatusnoteLike(String value) {
            addCriterion("statusNote like", value, "statusnote");
            return (Criteria) this;
        }

        public Criteria andStatusnoteNotLike(String value) {
            addCriterion("statusNote not like", value, "statusnote");
            return (Criteria) this;
        }

        public Criteria andStatusnoteIn(List<String> values) {
            addCriterion("statusNote in", values, "statusnote");
            return (Criteria) this;
        }

        public Criteria andStatusnoteNotIn(List<String> values) {
            addCriterion("statusNote not in", values, "statusnote");
            return (Criteria) this;
        }

        public Criteria andStatusnoteBetween(String value1, String value2) {
            addCriterion("statusNote between", value1, value2, "statusnote");
            return (Criteria) this;
        }

        public Criteria andStatusnoteNotBetween(String value1, String value2) {
            addCriterion("statusNote not between", value1, value2, "statusnote");
            return (Criteria) this;
        }

        public Criteria andReqnoteIsNull() {
            addCriterion("reqNote is null");
            return (Criteria) this;
        }

        public Criteria andReqnoteIsNotNull() {
            addCriterion("reqNote is not null");
            return (Criteria) this;
        }

        public Criteria andReqnoteEqualTo(String value) {
            addCriterion("reqNote =", value, "reqnote");
            return (Criteria) this;
        }

        public Criteria andReqnoteNotEqualTo(String value) {
            addCriterion("reqNote <>", value, "reqnote");
            return (Criteria) this;
        }

        public Criteria andReqnoteGreaterThan(String value) {
            addCriterion("reqNote >", value, "reqnote");
            return (Criteria) this;
        }

        public Criteria andReqnoteGreaterThanOrEqualTo(String value) {
            addCriterion("reqNote >=", value, "reqnote");
            return (Criteria) this;
        }

        public Criteria andReqnoteLessThan(String value) {
            addCriterion("reqNote <", value, "reqnote");
            return (Criteria) this;
        }

        public Criteria andReqnoteLessThanOrEqualTo(String value) {
            addCriterion("reqNote <=", value, "reqnote");
            return (Criteria) this;
        }

        public Criteria andReqnoteLike(String value) {
            addCriterion("reqNote like", value, "reqnote");
            return (Criteria) this;
        }

        public Criteria andReqnoteNotLike(String value) {
            addCriterion("reqNote not like", value, "reqnote");
            return (Criteria) this;
        }

        public Criteria andReqnoteIn(List<String> values) {
            addCriterion("reqNote in", values, "reqnote");
            return (Criteria) this;
        }

        public Criteria andReqnoteNotIn(List<String> values) {
            addCriterion("reqNote not in", values, "reqnote");
            return (Criteria) this;
        }

        public Criteria andReqnoteBetween(String value1, String value2) {
            addCriterion("reqNote between", value1, value2, "reqnote");
            return (Criteria) this;
        }

        public Criteria andReqnoteNotBetween(String value1, String value2) {
            addCriterion("reqNote not between", value1, value2, "reqnote");
            return (Criteria) this;
        }

        public Criteria andReqproposerIsNull() {
            addCriterion("reqProposer is null");
            return (Criteria) this;
        }

        public Criteria andReqproposerIsNotNull() {
            addCriterion("reqProposer is not null");
            return (Criteria) this;
        }

        public Criteria andReqproposerEqualTo(String value) {
            addCriterion("reqProposer =", value, "reqproposer");
            return (Criteria) this;
        }

        public Criteria andReqproposerNotEqualTo(String value) {
            addCriterion("reqProposer <>", value, "reqproposer");
            return (Criteria) this;
        }

        public Criteria andReqproposerGreaterThan(String value) {
            addCriterion("reqProposer >", value, "reqproposer");
            return (Criteria) this;
        }

        public Criteria andReqproposerGreaterThanOrEqualTo(String value) {
            addCriterion("reqProposer >=", value, "reqproposer");
            return (Criteria) this;
        }

        public Criteria andReqproposerLessThan(String value) {
            addCriterion("reqProposer <", value, "reqproposer");
            return (Criteria) this;
        }

        public Criteria andReqproposerLessThanOrEqualTo(String value) {
            addCriterion("reqProposer <=", value, "reqproposer");
            return (Criteria) this;
        }

        public Criteria andReqproposerLike(String value) {
            addCriterion("reqProposer like", value, "reqproposer");
            return (Criteria) this;
        }

        public Criteria andReqproposerNotLike(String value) {
            addCriterion("reqProposer not like", value, "reqproposer");
            return (Criteria) this;
        }

        public Criteria andReqproposerIn(List<String> values) {
            addCriterion("reqProposer in", values, "reqproposer");
            return (Criteria) this;
        }

        public Criteria andReqproposerNotIn(List<String> values) {
            addCriterion("reqProposer not in", values, "reqproposer");
            return (Criteria) this;
        }

        public Criteria andReqproposerBetween(String value1, String value2) {
            addCriterion("reqProposer between", value1, value2, "reqproposer");
            return (Criteria) this;
        }

        public Criteria andReqproposerNotBetween(String value1, String value2) {
            addCriterion("reqProposer not between", value1, value2, "reqproposer");
            return (Criteria) this;
        }

        public Criteria andReqscoreIsNull() {
            addCriterion("reqScore is null");
            return (Criteria) this;
        }

        public Criteria andReqscoreIsNotNull() {
            addCriterion("reqScore is not null");
            return (Criteria) this;
        }

        public Criteria andReqscoreEqualTo(Float value) {
            addCriterion("reqScore =", value, "reqscore");
            return (Criteria) this;
        }

        public Criteria andReqscoreNotEqualTo(Float value) {
            addCriterion("reqScore <>", value, "reqscore");
            return (Criteria) this;
        }

        public Criteria andReqscoreGreaterThan(Float value) {
            addCriterion("reqScore >", value, "reqscore");
            return (Criteria) this;
        }

        public Criteria andReqscoreGreaterThanOrEqualTo(Float value) {
            addCriterion("reqScore >=", value, "reqscore");
            return (Criteria) this;
        }

        public Criteria andReqscoreLessThan(Float value) {
            addCriterion("reqScore <", value, "reqscore");
            return (Criteria) this;
        }

        public Criteria andReqscoreLessThanOrEqualTo(Float value) {
            addCriterion("reqScore <=", value, "reqscore");
            return (Criteria) this;
        }

        public Criteria andReqscoreIn(List<Float> values) {
            addCriterion("reqScore in", values, "reqscore");
            return (Criteria) this;
        }

        public Criteria andReqscoreNotIn(List<Float> values) {
            addCriterion("reqScore not in", values, "reqscore");
            return (Criteria) this;
        }

        public Criteria andReqscoreBetween(Float value1, Float value2) {
            addCriterion("reqScore between", value1, value2, "reqscore");
            return (Criteria) this;
        }

        public Criteria andReqscoreNotBetween(Float value1, Float value2) {
            addCriterion("reqScore not between", value1, value2, "reqscore");
            return (Criteria) this;
        }

        public Criteria andReqcommentIsNull() {
            addCriterion("reqComment is null");
            return (Criteria) this;
        }

        public Criteria andReqcommentIsNotNull() {
            addCriterion("reqComment is not null");
            return (Criteria) this;
        }

        public Criteria andReqcommentEqualTo(String value) {
            addCriterion("reqComment =", value, "reqcomment");
            return (Criteria) this;
        }

        public Criteria andReqcommentNotEqualTo(String value) {
            addCriterion("reqComment <>", value, "reqcomment");
            return (Criteria) this;
        }

        public Criteria andReqcommentGreaterThan(String value) {
            addCriterion("reqComment >", value, "reqcomment");
            return (Criteria) this;
        }

        public Criteria andReqcommentGreaterThanOrEqualTo(String value) {
            addCriterion("reqComment >=", value, "reqcomment");
            return (Criteria) this;
        }

        public Criteria andReqcommentLessThan(String value) {
            addCriterion("reqComment <", value, "reqcomment");
            return (Criteria) this;
        }

        public Criteria andReqcommentLessThanOrEqualTo(String value) {
            addCriterion("reqComment <=", value, "reqcomment");
            return (Criteria) this;
        }

        public Criteria andReqcommentLike(String value) {
            addCriterion("reqComment like", value, "reqcomment");
            return (Criteria) this;
        }

        public Criteria andReqcommentNotLike(String value) {
            addCriterion("reqComment not like", value, "reqcomment");
            return (Criteria) this;
        }

        public Criteria andReqcommentIn(List<String> values) {
            addCriterion("reqComment in", values, "reqcomment");
            return (Criteria) this;
        }

        public Criteria andReqcommentNotIn(List<String> values) {
            addCriterion("reqComment not in", values, "reqcomment");
            return (Criteria) this;
        }

        public Criteria andReqcommentBetween(String value1, String value2) {
            addCriterion("reqComment between", value1, value2, "reqcomment");
            return (Criteria) this;
        }

        public Criteria andReqcommentNotBetween(String value1, String value2) {
            addCriterion("reqComment not between", value1, value2, "reqcomment");
            return (Criteria) this;
        }

        public Criteria andReqkeywordIsNull() {
            addCriterion("reqKeyword is null");
            return (Criteria) this;
        }

        public Criteria andReqkeywordIsNotNull() {
            addCriterion("reqKeyword is not null");
            return (Criteria) this;
        }

        public Criteria andReqkeywordEqualTo(String value) {
            addCriterion("reqKeyword =", value, "reqkeyword");
            return (Criteria) this;
        }

        public Criteria andReqkeywordNotEqualTo(String value) {
            addCriterion("reqKeyword <>", value, "reqkeyword");
            return (Criteria) this;
        }

        public Criteria andReqkeywordGreaterThan(String value) {
            addCriterion("reqKeyword >", value, "reqkeyword");
            return (Criteria) this;
        }

        public Criteria andReqkeywordGreaterThanOrEqualTo(String value) {
            addCriterion("reqKeyword >=", value, "reqkeyword");
            return (Criteria) this;
        }

        public Criteria andReqkeywordLessThan(String value) {
            addCriterion("reqKeyword <", value, "reqkeyword");
            return (Criteria) this;
        }

        public Criteria andReqkeywordLessThanOrEqualTo(String value) {
            addCriterion("reqKeyword <=", value, "reqkeyword");
            return (Criteria) this;
        }

        public Criteria andReqkeywordLike(String value) {
            addCriterion("reqKeyword like", value, "reqkeyword");
            return (Criteria) this;
        }

        public Criteria andReqkeywordNotLike(String value) {
            addCriterion("reqKeyword not like", value, "reqkeyword");
            return (Criteria) this;
        }

        public Criteria andReqkeywordIn(List<String> values) {
            addCriterion("reqKeyword in", values, "reqkeyword");
            return (Criteria) this;
        }

        public Criteria andReqkeywordNotIn(List<String> values) {
            addCriterion("reqKeyword not in", values, "reqkeyword");
            return (Criteria) this;
        }

        public Criteria andReqkeywordBetween(String value1, String value2) {
            addCriterion("reqKeyword between", value1, value2, "reqkeyword");
            return (Criteria) this;
        }

        public Criteria andReqkeywordNotBetween(String value1, String value2) {
            addCriterion("reqKeyword not between", value1, value2, "reqkeyword");
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