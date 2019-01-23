package com.car.pojo;

import java.util.ArrayList;
import java.util.List;

public class SalesmanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalesmanExample() {
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

        public Criteria andSalesmanIdIsNull() {
            addCriterion("salesman_id is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdIsNotNull() {
            addCriterion("salesman_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdEqualTo(Integer value) {
            addCriterion("salesman_id =", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdNotEqualTo(Integer value) {
            addCriterion("salesman_id <>", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdGreaterThan(Integer value) {
            addCriterion("salesman_id >", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesman_id >=", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdLessThan(Integer value) {
            addCriterion("salesman_id <", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdLessThanOrEqualTo(Integer value) {
            addCriterion("salesman_id <=", value, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdIn(List<Integer> values) {
            addCriterion("salesman_id in", values, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdNotIn(List<Integer> values) {
            addCriterion("salesman_id not in", values, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdBetween(Integer value1, Integer value2) {
            addCriterion("salesman_id between", value1, value2, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andSalesmanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("salesman_id not between", value1, value2, "salesmanId");
            return (Criteria) this;
        }

        public Criteria andRolerIdIsNull() {
            addCriterion("roler_id is null");
            return (Criteria) this;
        }

        public Criteria andRolerIdIsNotNull() {
            addCriterion("roler_id is not null");
            return (Criteria) this;
        }

        public Criteria andRolerIdEqualTo(Integer value) {
            addCriterion("roler_id =", value, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdNotEqualTo(Integer value) {
            addCriterion("roler_id <>", value, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdGreaterThan(Integer value) {
            addCriterion("roler_id >", value, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roler_id >=", value, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdLessThan(Integer value) {
            addCriterion("roler_id <", value, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdLessThanOrEqualTo(Integer value) {
            addCriterion("roler_id <=", value, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdIn(List<Integer> values) {
            addCriterion("roler_id in", values, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdNotIn(List<Integer> values) {
            addCriterion("roler_id not in", values, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdBetween(Integer value1, Integer value2) {
            addCriterion("roler_id between", value1, value2, "rolerId");
            return (Criteria) this;
        }

        public Criteria andRolerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roler_id not between", value1, value2, "rolerId");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIsNull() {
            addCriterion("salesman_user is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIsNotNull() {
            addCriterion("salesman_user is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserEqualTo(String value) {
            addCriterion("salesman_user =", value, "salesmanUser");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserNotEqualTo(String value) {
            addCriterion("salesman_user <>", value, "salesmanUser");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserGreaterThan(String value) {
            addCriterion("salesman_user >", value, "salesmanUser");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserGreaterThanOrEqualTo(String value) {
            addCriterion("salesman_user >=", value, "salesmanUser");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserLessThan(String value) {
            addCriterion("salesman_user <", value, "salesmanUser");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserLessThanOrEqualTo(String value) {
            addCriterion("salesman_user <=", value, "salesmanUser");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserLike(String value) {
            addCriterion("salesman_user like", value, "salesmanUser");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserNotLike(String value) {
            addCriterion("salesman_user not like", value, "salesmanUser");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIn(List<String> values) {
            addCriterion("salesman_user in", values, "salesmanUser");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserNotIn(List<String> values) {
            addCriterion("salesman_user not in", values, "salesmanUser");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserBetween(String value1, String value2) {
            addCriterion("salesman_user between", value1, value2, "salesmanUser");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserNotBetween(String value1, String value2) {
            addCriterion("salesman_user not between", value1, value2, "salesmanUser");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassIsNull() {
            addCriterion("salesman_pass is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassIsNotNull() {
            addCriterion("salesman_pass is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassEqualTo(String value) {
            addCriterion("salesman_pass =", value, "salesmanPass");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassNotEqualTo(String value) {
            addCriterion("salesman_pass <>", value, "salesmanPass");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassGreaterThan(String value) {
            addCriterion("salesman_pass >", value, "salesmanPass");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassGreaterThanOrEqualTo(String value) {
            addCriterion("salesman_pass >=", value, "salesmanPass");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassLessThan(String value) {
            addCriterion("salesman_pass <", value, "salesmanPass");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassLessThanOrEqualTo(String value) {
            addCriterion("salesman_pass <=", value, "salesmanPass");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassLike(String value) {
            addCriterion("salesman_pass like", value, "salesmanPass");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassNotLike(String value) {
            addCriterion("salesman_pass not like", value, "salesmanPass");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassIn(List<String> values) {
            addCriterion("salesman_pass in", values, "salesmanPass");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassNotIn(List<String> values) {
            addCriterion("salesman_pass not in", values, "salesmanPass");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassBetween(String value1, String value2) {
            addCriterion("salesman_pass between", value1, value2, "salesmanPass");
            return (Criteria) this;
        }

        public Criteria andSalesmanPassNotBetween(String value1, String value2) {
            addCriterion("salesman_pass not between", value1, value2, "salesmanPass");
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