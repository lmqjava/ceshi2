package com.car.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EngineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EngineExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSsIdIsNull() {
            addCriterion("ss_id is null");
            return (Criteria) this;
        }

        public Criteria andSsIdIsNotNull() {
            addCriterion("ss_id is not null");
            return (Criteria) this;
        }

        public Criteria andSsIdEqualTo(Integer value) {
            addCriterion("ss_id =", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotEqualTo(Integer value) {
            addCriterion("ss_id <>", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdGreaterThan(Integer value) {
            addCriterion("ss_id >", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ss_id >=", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLessThan(Integer value) {
            addCriterion("ss_id <", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLessThanOrEqualTo(Integer value) {
            addCriterion("ss_id <=", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdIn(List<Integer> values) {
            addCriterion("ss_id in", values, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotIn(List<Integer> values) {
            addCriterion("ss_id not in", values, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdBetween(Integer value1, Integer value2) {
            addCriterion("ss_id between", value1, value2, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ss_id not between", value1, value2, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsNameIsNull() {
            addCriterion("ss_name is null");
            return (Criteria) this;
        }

        public Criteria andSsNameIsNotNull() {
            addCriterion("ss_name is not null");
            return (Criteria) this;
        }

        public Criteria andSsNameEqualTo(String value) {
            addCriterion("ss_name =", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameNotEqualTo(String value) {
            addCriterion("ss_name <>", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameGreaterThan(String value) {
            addCriterion("ss_name >", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ss_name >=", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameLessThan(String value) {
            addCriterion("ss_name <", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameLessThanOrEqualTo(String value) {
            addCriterion("ss_name <=", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameLike(String value) {
            addCriterion("ss_name like", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameNotLike(String value) {
            addCriterion("ss_name not like", value, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameIn(List<String> values) {
            addCriterion("ss_name in", values, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameNotIn(List<String> values) {
            addCriterion("ss_name not in", values, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameBetween(String value1, String value2) {
            addCriterion("ss_name between", value1, value2, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsNameNotBetween(String value1, String value2) {
            addCriterion("ss_name not between", value1, value2, "ssName");
            return (Criteria) this;
        }

        public Criteria andSsStartdataIsNull() {
            addCriterion("ss_startdata is null");
            return (Criteria) this;
        }

        public Criteria andSsStartdataIsNotNull() {
            addCriterion("ss_startdata is not null");
            return (Criteria) this;
        }

        public Criteria andSsStartdataEqualTo(Date value) {
            addCriterionForJDBCDate("ss_startdata =", value, "ssStartdata");
            return (Criteria) this;
        }

        public Criteria andSsStartdataNotEqualTo(Date value) {
            addCriterionForJDBCDate("ss_startdata <>", value, "ssStartdata");
            return (Criteria) this;
        }

        public Criteria andSsStartdataGreaterThan(Date value) {
            addCriterionForJDBCDate("ss_startdata >", value, "ssStartdata");
            return (Criteria) this;
        }

        public Criteria andSsStartdataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ss_startdata >=", value, "ssStartdata");
            return (Criteria) this;
        }

        public Criteria andSsStartdataLessThan(Date value) {
            addCriterionForJDBCDate("ss_startdata <", value, "ssStartdata");
            return (Criteria) this;
        }

        public Criteria andSsStartdataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ss_startdata <=", value, "ssStartdata");
            return (Criteria) this;
        }

        public Criteria andSsStartdataIn(List<Date> values) {
            addCriterionForJDBCDate("ss_startdata in", values, "ssStartdata");
            return (Criteria) this;
        }

        public Criteria andSsStartdataNotIn(List<Date> values) {
            addCriterionForJDBCDate("ss_startdata not in", values, "ssStartdata");
            return (Criteria) this;
        }

        public Criteria andSsStartdataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ss_startdata between", value1, value2, "ssStartdata");
            return (Criteria) this;
        }

        public Criteria andSsStartdataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ss_startdata not between", value1, value2, "ssStartdata");
            return (Criteria) this;
        }

        public Criteria andSsEnddataIsNull() {
            addCriterion("ss_enddata is null");
            return (Criteria) this;
        }

        public Criteria andSsEnddataIsNotNull() {
            addCriterion("ss_enddata is not null");
            return (Criteria) this;
        }

        public Criteria andSsEnddataEqualTo(Date value) {
            addCriterionForJDBCDate("ss_enddata =", value, "ssEnddata");
            return (Criteria) this;
        }

        public Criteria andSsEnddataNotEqualTo(Date value) {
            addCriterionForJDBCDate("ss_enddata <>", value, "ssEnddata");
            return (Criteria) this;
        }

        public Criteria andSsEnddataGreaterThan(Date value) {
            addCriterionForJDBCDate("ss_enddata >", value, "ssEnddata");
            return (Criteria) this;
        }

        public Criteria andSsEnddataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ss_enddata >=", value, "ssEnddata");
            return (Criteria) this;
        }

        public Criteria andSsEnddataLessThan(Date value) {
            addCriterionForJDBCDate("ss_enddata <", value, "ssEnddata");
            return (Criteria) this;
        }

        public Criteria andSsEnddataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ss_enddata <=", value, "ssEnddata");
            return (Criteria) this;
        }

        public Criteria andSsEnddataIn(List<Date> values) {
            addCriterionForJDBCDate("ss_enddata in", values, "ssEnddata");
            return (Criteria) this;
        }

        public Criteria andSsEnddataNotIn(List<Date> values) {
            addCriterionForJDBCDate("ss_enddata not in", values, "ssEnddata");
            return (Criteria) this;
        }

        public Criteria andSsEnddataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ss_enddata between", value1, value2, "ssEnddata");
            return (Criteria) this;
        }

        public Criteria andSsEnddataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ss_enddata not between", value1, value2, "ssEnddata");
            return (Criteria) this;
        }

        public Criteria andSsAddressIsNull() {
            addCriterion("ss_address is null");
            return (Criteria) this;
        }

        public Criteria andSsAddressIsNotNull() {
            addCriterion("ss_address is not null");
            return (Criteria) this;
        }

        public Criteria andSsAddressEqualTo(String value) {
            addCriterion("ss_address =", value, "ssAddress");
            return (Criteria) this;
        }

        public Criteria andSsAddressNotEqualTo(String value) {
            addCriterion("ss_address <>", value, "ssAddress");
            return (Criteria) this;
        }

        public Criteria andSsAddressGreaterThan(String value) {
            addCriterion("ss_address >", value, "ssAddress");
            return (Criteria) this;
        }

        public Criteria andSsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ss_address >=", value, "ssAddress");
            return (Criteria) this;
        }

        public Criteria andSsAddressLessThan(String value) {
            addCriterion("ss_address <", value, "ssAddress");
            return (Criteria) this;
        }

        public Criteria andSsAddressLessThanOrEqualTo(String value) {
            addCriterion("ss_address <=", value, "ssAddress");
            return (Criteria) this;
        }

        public Criteria andSsAddressLike(String value) {
            addCriterion("ss_address like", value, "ssAddress");
            return (Criteria) this;
        }

        public Criteria andSsAddressNotLike(String value) {
            addCriterion("ss_address not like", value, "ssAddress");
            return (Criteria) this;
        }

        public Criteria andSsAddressIn(List<String> values) {
            addCriterion("ss_address in", values, "ssAddress");
            return (Criteria) this;
        }

        public Criteria andSsAddressNotIn(List<String> values) {
            addCriterion("ss_address not in", values, "ssAddress");
            return (Criteria) this;
        }

        public Criteria andSsAddressBetween(String value1, String value2) {
            addCriterion("ss_address between", value1, value2, "ssAddress");
            return (Criteria) this;
        }

        public Criteria andSsAddressNotBetween(String value1, String value2) {
            addCriterion("ss_address not between", value1, value2, "ssAddress");
            return (Criteria) this;
        }

        public Criteria andSsLeixingIsNull() {
            addCriterion("ss_leixing is null");
            return (Criteria) this;
        }

        public Criteria andSsLeixingIsNotNull() {
            addCriterion("ss_leixing is not null");
            return (Criteria) this;
        }

        public Criteria andSsLeixingEqualTo(String value) {
            addCriterion("ss_leixing =", value, "ssLeixing");
            return (Criteria) this;
        }

        public Criteria andSsLeixingNotEqualTo(String value) {
            addCriterion("ss_leixing <>", value, "ssLeixing");
            return (Criteria) this;
        }

        public Criteria andSsLeixingGreaterThan(String value) {
            addCriterion("ss_leixing >", value, "ssLeixing");
            return (Criteria) this;
        }

        public Criteria andSsLeixingGreaterThanOrEqualTo(String value) {
            addCriterion("ss_leixing >=", value, "ssLeixing");
            return (Criteria) this;
        }

        public Criteria andSsLeixingLessThan(String value) {
            addCriterion("ss_leixing <", value, "ssLeixing");
            return (Criteria) this;
        }

        public Criteria andSsLeixingLessThanOrEqualTo(String value) {
            addCriterion("ss_leixing <=", value, "ssLeixing");
            return (Criteria) this;
        }

        public Criteria andSsLeixingLike(String value) {
            addCriterion("ss_leixing like", value, "ssLeixing");
            return (Criteria) this;
        }

        public Criteria andSsLeixingNotLike(String value) {
            addCriterion("ss_leixing not like", value, "ssLeixing");
            return (Criteria) this;
        }

        public Criteria andSsLeixingIn(List<String> values) {
            addCriterion("ss_leixing in", values, "ssLeixing");
            return (Criteria) this;
        }

        public Criteria andSsLeixingNotIn(List<String> values) {
            addCriterion("ss_leixing not in", values, "ssLeixing");
            return (Criteria) this;
        }

        public Criteria andSsLeixingBetween(String value1, String value2) {
            addCriterion("ss_leixing between", value1, value2, "ssLeixing");
            return (Criteria) this;
        }

        public Criteria andSsLeixingNotBetween(String value1, String value2) {
            addCriterion("ss_leixing not between", value1, value2, "ssLeixing");
            return (Criteria) this;
        }

        public Criteria andSsNumIsNull() {
            addCriterion("ss_num is null");
            return (Criteria) this;
        }

        public Criteria andSsNumIsNotNull() {
            addCriterion("ss_num is not null");
            return (Criteria) this;
        }

        public Criteria andSsNumEqualTo(Integer value) {
            addCriterion("ss_num =", value, "ssNum");
            return (Criteria) this;
        }

        public Criteria andSsNumNotEqualTo(Integer value) {
            addCriterion("ss_num <>", value, "ssNum");
            return (Criteria) this;
        }

        public Criteria andSsNumGreaterThan(Integer value) {
            addCriterion("ss_num >", value, "ssNum");
            return (Criteria) this;
        }

        public Criteria andSsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ss_num >=", value, "ssNum");
            return (Criteria) this;
        }

        public Criteria andSsNumLessThan(Integer value) {
            addCriterion("ss_num <", value, "ssNum");
            return (Criteria) this;
        }

        public Criteria andSsNumLessThanOrEqualTo(Integer value) {
            addCriterion("ss_num <=", value, "ssNum");
            return (Criteria) this;
        }

        public Criteria andSsNumIn(List<Integer> values) {
            addCriterion("ss_num in", values, "ssNum");
            return (Criteria) this;
        }

        public Criteria andSsNumNotIn(List<Integer> values) {
            addCriterion("ss_num not in", values, "ssNum");
            return (Criteria) this;
        }

        public Criteria andSsNumBetween(Integer value1, Integer value2) {
            addCriterion("ss_num between", value1, value2, "ssNum");
            return (Criteria) this;
        }

        public Criteria andSsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ss_num not between", value1, value2, "ssNum");
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