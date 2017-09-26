package hsoft.mobile.projectrecord.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DocCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocCategoryExample() {
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

        public Criteria andCategorynameIsNull() {
            addCriterion("categoryName is null");
            return (Criteria) this;
        }

        public Criteria andCategorynameIsNotNull() {
            addCriterion("categoryName is not null");
            return (Criteria) this;
        }

        public Criteria andCategorynameEqualTo(String value) {
            addCriterion("categoryName =", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotEqualTo(String value) {
            addCriterion("categoryName <>", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameGreaterThan(String value) {
            addCriterion("categoryName >", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameGreaterThanOrEqualTo(String value) {
            addCriterion("categoryName >=", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameLessThan(String value) {
            addCriterion("categoryName <", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameLessThanOrEqualTo(String value) {
            addCriterion("categoryName <=", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameLike(String value) {
            addCriterion("categoryName like", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotLike(String value) {
            addCriterion("categoryName not like", value, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameIn(List<String> values) {
            addCriterion("categoryName in", values, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotIn(List<String> values) {
            addCriterion("categoryName not in", values, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameBetween(String value1, String value2) {
            addCriterion("categoryName between", value1, value2, "categoryname");
            return (Criteria) this;
        }

        public Criteria andCategorynameNotBetween(String value1, String value2) {
            addCriterion("categoryName not between", value1, value2, "categoryname");
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