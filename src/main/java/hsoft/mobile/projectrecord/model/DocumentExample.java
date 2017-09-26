package hsoft.mobile.projectrecord.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentExample() {
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

        public Criteria andDocidIsNull() {
            addCriterion("docId is null");
            return (Criteria) this;
        }

        public Criteria andDocidIsNotNull() {
            addCriterion("docId is not null");
            return (Criteria) this;
        }

        public Criteria andDocidEqualTo(Integer value) {
            addCriterion("docId =", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotEqualTo(Integer value) {
            addCriterion("docId <>", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThan(Integer value) {
            addCriterion("docId >", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docId >=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThan(Integer value) {
            addCriterion("docId <", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidLessThanOrEqualTo(Integer value) {
            addCriterion("docId <=", value, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidIn(List<Integer> values) {
            addCriterion("docId in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotIn(List<Integer> values) {
            addCriterion("docId not in", values, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidBetween(Integer value1, Integer value2) {
            addCriterion("docId between", value1, value2, "docid");
            return (Criteria) this;
        }

        public Criteria andDocidNotBetween(Integer value1, Integer value2) {
            addCriterion("docId not between", value1, value2, "docid");
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

        public Criteria andDocnameIsNull() {
            addCriterion("docName is null");
            return (Criteria) this;
        }

        public Criteria andDocnameIsNotNull() {
            addCriterion("docName is not null");
            return (Criteria) this;
        }

        public Criteria andDocnameEqualTo(String value) {
            addCriterion("docName =", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotEqualTo(String value) {
            addCriterion("docName <>", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameGreaterThan(String value) {
            addCriterion("docName >", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameGreaterThanOrEqualTo(String value) {
            addCriterion("docName >=", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLessThan(String value) {
            addCriterion("docName <", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLessThanOrEqualTo(String value) {
            addCriterion("docName <=", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameLike(String value) {
            addCriterion("docName like", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotLike(String value) {
            addCriterion("docName not like", value, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameIn(List<String> values) {
            addCriterion("docName in", values, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotIn(List<String> values) {
            addCriterion("docName not in", values, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameBetween(String value1, String value2) {
            addCriterion("docName between", value1, value2, "docname");
            return (Criteria) this;
        }

        public Criteria andDocnameNotBetween(String value1, String value2) {
            addCriterion("docName not between", value1, value2, "docname");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionIsNull() {
            addCriterion("docDescription is null");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionIsNotNull() {
            addCriterion("docDescription is not null");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionEqualTo(String value) {
            addCriterion("docDescription =", value, "docdescription");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionNotEqualTo(String value) {
            addCriterion("docDescription <>", value, "docdescription");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionGreaterThan(String value) {
            addCriterion("docDescription >", value, "docdescription");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("docDescription >=", value, "docdescription");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionLessThan(String value) {
            addCriterion("docDescription <", value, "docdescription");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionLessThanOrEqualTo(String value) {
            addCriterion("docDescription <=", value, "docdescription");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionLike(String value) {
            addCriterion("docDescription like", value, "docdescription");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionNotLike(String value) {
            addCriterion("docDescription not like", value, "docdescription");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionIn(List<String> values) {
            addCriterion("docDescription in", values, "docdescription");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionNotIn(List<String> values) {
            addCriterion("docDescription not in", values, "docdescription");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionBetween(String value1, String value2) {
            addCriterion("docDescription between", value1, value2, "docdescription");
            return (Criteria) this;
        }

        public Criteria andDocdescriptionNotBetween(String value1, String value2) {
            addCriterion("docDescription not between", value1, value2, "docdescription");
            return (Criteria) this;
        }

        public Criteria andDoccategoryidIsNull() {
            addCriterion("docCategoryId is null");
            return (Criteria) this;
        }

        public Criteria andDoccategoryidIsNotNull() {
            addCriterion("docCategoryId is not null");
            return (Criteria) this;
        }

        public Criteria andDoccategoryidEqualTo(Integer value) {
            addCriterion("docCategoryId =", value, "doccategoryid");
            return (Criteria) this;
        }

        public Criteria andDoccategoryidNotEqualTo(Integer value) {
            addCriterion("docCategoryId <>", value, "doccategoryid");
            return (Criteria) this;
        }

        public Criteria andDoccategoryidGreaterThan(Integer value) {
            addCriterion("docCategoryId >", value, "doccategoryid");
            return (Criteria) this;
        }

        public Criteria andDoccategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docCategoryId >=", value, "doccategoryid");
            return (Criteria) this;
        }

        public Criteria andDoccategoryidLessThan(Integer value) {
            addCriterion("docCategoryId <", value, "doccategoryid");
            return (Criteria) this;
        }

        public Criteria andDoccategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("docCategoryId <=", value, "doccategoryid");
            return (Criteria) this;
        }

        public Criteria andDoccategoryidIn(List<Integer> values) {
            addCriterion("docCategoryId in", values, "doccategoryid");
            return (Criteria) this;
        }

        public Criteria andDoccategoryidNotIn(List<Integer> values) {
            addCriterion("docCategoryId not in", values, "doccategoryid");
            return (Criteria) this;
        }

        public Criteria andDoccategoryidBetween(Integer value1, Integer value2) {
            addCriterion("docCategoryId between", value1, value2, "doccategoryid");
            return (Criteria) this;
        }

        public Criteria andDoccategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("docCategoryId not between", value1, value2, "doccategoryid");
            return (Criteria) this;
        }

        public Criteria andDocpathIsNull() {
            addCriterion("docPath is null");
            return (Criteria) this;
        }

        public Criteria andDocpathIsNotNull() {
            addCriterion("docPath is not null");
            return (Criteria) this;
        }

        public Criteria andDocpathEqualTo(String value) {
            addCriterion("docPath =", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathNotEqualTo(String value) {
            addCriterion("docPath <>", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathGreaterThan(String value) {
            addCriterion("docPath >", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathGreaterThanOrEqualTo(String value) {
            addCriterion("docPath >=", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathLessThan(String value) {
            addCriterion("docPath <", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathLessThanOrEqualTo(String value) {
            addCriterion("docPath <=", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathLike(String value) {
            addCriterion("docPath like", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathNotLike(String value) {
            addCriterion("docPath not like", value, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathIn(List<String> values) {
            addCriterion("docPath in", values, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathNotIn(List<String> values) {
            addCriterion("docPath not in", values, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathBetween(String value1, String value2) {
            addCriterion("docPath between", value1, value2, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocpathNotBetween(String value1, String value2) {
            addCriterion("docPath not between", value1, value2, "docpath");
            return (Criteria) this;
        }

        public Criteria andDocnoteIsNull() {
            addCriterion("docNote is null");
            return (Criteria) this;
        }

        public Criteria andDocnoteIsNotNull() {
            addCriterion("docNote is not null");
            return (Criteria) this;
        }

        public Criteria andDocnoteEqualTo(String value) {
            addCriterion("docNote =", value, "docnote");
            return (Criteria) this;
        }

        public Criteria andDocnoteNotEqualTo(String value) {
            addCriterion("docNote <>", value, "docnote");
            return (Criteria) this;
        }

        public Criteria andDocnoteGreaterThan(String value) {
            addCriterion("docNote >", value, "docnote");
            return (Criteria) this;
        }

        public Criteria andDocnoteGreaterThanOrEqualTo(String value) {
            addCriterion("docNote >=", value, "docnote");
            return (Criteria) this;
        }

        public Criteria andDocnoteLessThan(String value) {
            addCriterion("docNote <", value, "docnote");
            return (Criteria) this;
        }

        public Criteria andDocnoteLessThanOrEqualTo(String value) {
            addCriterion("docNote <=", value, "docnote");
            return (Criteria) this;
        }

        public Criteria andDocnoteLike(String value) {
            addCriterion("docNote like", value, "docnote");
            return (Criteria) this;
        }

        public Criteria andDocnoteNotLike(String value) {
            addCriterion("docNote not like", value, "docnote");
            return (Criteria) this;
        }

        public Criteria andDocnoteIn(List<String> values) {
            addCriterion("docNote in", values, "docnote");
            return (Criteria) this;
        }

        public Criteria andDocnoteNotIn(List<String> values) {
            addCriterion("docNote not in", values, "docnote");
            return (Criteria) this;
        }

        public Criteria andDocnoteBetween(String value1, String value2) {
            addCriterion("docNote between", value1, value2, "docnote");
            return (Criteria) this;
        }

        public Criteria andDocnoteNotBetween(String value1, String value2) {
            addCriterion("docNote not between", value1, value2, "docnote");
            return (Criteria) this;
        }

        public Criteria andDocmd5IsNull() {
            addCriterion("docMd5 is null");
            return (Criteria) this;
        }

        public Criteria andDocmd5IsNotNull() {
            addCriterion("docMd5 is not null");
            return (Criteria) this;
        }

        public Criteria andDocmd5EqualTo(String value) {
            addCriterion("docMd5 =", value, "docmd5");
            return (Criteria) this;
        }

        public Criteria andDocmd5NotEqualTo(String value) {
            addCriterion("docMd5 <>", value, "docmd5");
            return (Criteria) this;
        }

        public Criteria andDocmd5GreaterThan(String value) {
            addCriterion("docMd5 >", value, "docmd5");
            return (Criteria) this;
        }

        public Criteria andDocmd5GreaterThanOrEqualTo(String value) {
            addCriterion("docMd5 >=", value, "docmd5");
            return (Criteria) this;
        }

        public Criteria andDocmd5LessThan(String value) {
            addCriterion("docMd5 <", value, "docmd5");
            return (Criteria) this;
        }

        public Criteria andDocmd5LessThanOrEqualTo(String value) {
            addCriterion("docMd5 <=", value, "docmd5");
            return (Criteria) this;
        }

        public Criteria andDocmd5Like(String value) {
            addCriterion("docMd5 like", value, "docmd5");
            return (Criteria) this;
        }

        public Criteria andDocmd5NotLike(String value) {
            addCriterion("docMd5 not like", value, "docmd5");
            return (Criteria) this;
        }

        public Criteria andDocmd5In(List<String> values) {
            addCriterion("docMd5 in", values, "docmd5");
            return (Criteria) this;
        }

        public Criteria andDocmd5NotIn(List<String> values) {
            addCriterion("docMd5 not in", values, "docmd5");
            return (Criteria) this;
        }

        public Criteria andDocmd5Between(String value1, String value2) {
            addCriterion("docMd5 between", value1, value2, "docmd5");
            return (Criteria) this;
        }

        public Criteria andDocmd5NotBetween(String value1, String value2) {
            addCriterion("docMd5 not between", value1, value2, "docmd5");
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