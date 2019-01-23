package com.car.pojo;

import java.util.ArrayList;
import java.util.List;

public class ModelTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelTypeExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDisIsNull() {
            addCriterion("dis is null");
            return (Criteria) this;
        }

        public Criteria andDisIsNotNull() {
            addCriterion("dis is not null");
            return (Criteria) this;
        }

        public Criteria andDisEqualTo(String value) {
            addCriterion("dis =", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisNotEqualTo(String value) {
            addCriterion("dis <>", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisGreaterThan(String value) {
            addCriterion("dis >", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisGreaterThanOrEqualTo(String value) {
            addCriterion("dis >=", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisLessThan(String value) {
            addCriterion("dis <", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisLessThanOrEqualTo(String value) {
            addCriterion("dis <=", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisLike(String value) {
            addCriterion("dis like", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisNotLike(String value) {
            addCriterion("dis not like", value, "dis");
            return (Criteria) this;
        }

        public Criteria andDisIn(List<String> values) {
            addCriterion("dis in", values, "dis");
            return (Criteria) this;
        }

        public Criteria andDisNotIn(List<String> values) {
            addCriterion("dis not in", values, "dis");
            return (Criteria) this;
        }

        public Criteria andDisBetween(String value1, String value2) {
            addCriterion("dis between", value1, value2, "dis");
            return (Criteria) this;
        }

        public Criteria andDisNotBetween(String value1, String value2) {
            addCriterion("dis not between", value1, value2, "dis");
            return (Criteria) this;
        }

        public Criteria andPailiangIsNull() {
            addCriterion("pailiang is null");
            return (Criteria) this;
        }

        public Criteria andPailiangIsNotNull() {
            addCriterion("pailiang is not null");
            return (Criteria) this;
        }

        public Criteria andPailiangEqualTo(String value) {
            addCriterion("pailiang =", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangNotEqualTo(String value) {
            addCriterion("pailiang <>", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangGreaterThan(String value) {
            addCriterion("pailiang >", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangGreaterThanOrEqualTo(String value) {
            addCriterion("pailiang >=", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangLessThan(String value) {
            addCriterion("pailiang <", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangLessThanOrEqualTo(String value) {
            addCriterion("pailiang <=", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangLike(String value) {
            addCriterion("pailiang like", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangNotLike(String value) {
            addCriterion("pailiang not like", value, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangIn(List<String> values) {
            addCriterion("pailiang in", values, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangNotIn(List<String> values) {
            addCriterion("pailiang not in", values, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangBetween(String value1, String value2) {
            addCriterion("pailiang between", value1, value2, "pailiang");
            return (Criteria) this;
        }

        public Criteria andPailiangNotBetween(String value1, String value2) {
            addCriterion("pailiang not between", value1, value2, "pailiang");
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