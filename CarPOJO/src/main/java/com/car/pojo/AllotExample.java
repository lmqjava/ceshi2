package com.car.pojo;

import java.util.ArrayList;
import java.util.List;

public class AllotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllotExample() {
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

        public Criteria andAllotIdIsNull() {
            addCriterion("allot_id is null");
            return (Criteria) this;
        }

        public Criteria andAllotIdIsNotNull() {
            addCriterion("allot_id is not null");
            return (Criteria) this;
        }

        public Criteria andAllotIdEqualTo(Integer value) {
            addCriterion("allot_id =", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdNotEqualTo(Integer value) {
            addCriterion("allot_id <>", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdGreaterThan(Integer value) {
            addCriterion("allot_id >", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("allot_id >=", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdLessThan(Integer value) {
            addCriterion("allot_id <", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdLessThanOrEqualTo(Integer value) {
            addCriterion("allot_id <=", value, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdIn(List<Integer> values) {
            addCriterion("allot_id in", values, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdNotIn(List<Integer> values) {
            addCriterion("allot_id not in", values, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdBetween(Integer value1, Integer value2) {
            addCriterion("allot_id between", value1, value2, "allotId");
            return (Criteria) this;
        }

        public Criteria andAllotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("allot_id not between", value1, value2, "allotId");
            return (Criteria) this;
        }

        public Criteria andParticularsIdIsNull() {
            addCriterion("particulars_id is null");
            return (Criteria) this;
        }

        public Criteria andParticularsIdIsNotNull() {
            addCriterion("particulars_id is not null");
            return (Criteria) this;
        }

        public Criteria andParticularsIdEqualTo(Integer value) {
            addCriterion("particulars_id =", value, "particularsId");
            return (Criteria) this;
        }

        public Criteria andParticularsIdNotEqualTo(Integer value) {
            addCriterion("particulars_id <>", value, "particularsId");
            return (Criteria) this;
        }

        public Criteria andParticularsIdGreaterThan(Integer value) {
            addCriterion("particulars_id >", value, "particularsId");
            return (Criteria) this;
        }

        public Criteria andParticularsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("particulars_id >=", value, "particularsId");
            return (Criteria) this;
        }

        public Criteria andParticularsIdLessThan(Integer value) {
            addCriterion("particulars_id <", value, "particularsId");
            return (Criteria) this;
        }

        public Criteria andParticularsIdLessThanOrEqualTo(Integer value) {
            addCriterion("particulars_id <=", value, "particularsId");
            return (Criteria) this;
        }

        public Criteria andParticularsIdIn(List<Integer> values) {
            addCriterion("particulars_id in", values, "particularsId");
            return (Criteria) this;
        }

        public Criteria andParticularsIdNotIn(List<Integer> values) {
            addCriterion("particulars_id not in", values, "particularsId");
            return (Criteria) this;
        }

        public Criteria andParticularsIdBetween(Integer value1, Integer value2) {
            addCriterion("particulars_id between", value1, value2, "particularsId");
            return (Criteria) this;
        }

        public Criteria andParticularsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("particulars_id not between", value1, value2, "particularsId");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(Integer value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(Integer value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(Integer value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(Integer value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(Integer value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<Integer> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<Integer> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(Integer value1, Integer value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(Integer value1, Integer value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
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