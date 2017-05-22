package com.telewave.twweb.firstds.entity;

import java.util.ArrayList;
import java.util.List;

public class PrmissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrmissionExample() {
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

        public Criteria andPermissionIdIsNull() {
            addCriterion("PERMISSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("PERMISSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(String value) {
            addCriterion("PERMISSION_ID =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(String value) {
            addCriterion("PERMISSION_ID <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(String value) {
            addCriterion("PERMISSION_ID >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_ID >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(String value) {
            addCriterion("PERMISSION_ID <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_ID <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLike(String value) {
            addCriterion("PERMISSION_ID like", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotLike(String value) {
            addCriterion("PERMISSION_ID not like", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<String> values) {
            addCriterion("PERMISSION_ID in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<String> values) {
            addCriterion("PERMISSION_ID not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(String value1, String value2) {
            addCriterion("PERMISSION_ID between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_ID not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNull() {
            addCriterion("PERMISSION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNotNull() {
            addCriterion("PERMISSION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameEqualTo(Object value) {
            addCriterion("PERMISSION_NAME =", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotEqualTo(Object value) {
            addCriterion("PERMISSION_NAME <>", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThan(Object value) {
            addCriterion("PERMISSION_NAME >", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThanOrEqualTo(Object value) {
            addCriterion("PERMISSION_NAME >=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThan(Object value) {
            addCriterion("PERMISSION_NAME <", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThanOrEqualTo(Object value) {
            addCriterion("PERMISSION_NAME <=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIn(List<Object> values) {
            addCriterion("PERMISSION_NAME in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotIn(List<Object> values) {
            addCriterion("PERMISSION_NAME not in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameBetween(Object value1, Object value2) {
            addCriterion("PERMISSION_NAME between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotBetween(Object value1, Object value2) {
            addCriterion("PERMISSION_NAME not between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andDecscriptionIsNull() {
            addCriterion("DECSCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDecscriptionIsNotNull() {
            addCriterion("DECSCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDecscriptionEqualTo(Object value) {
            addCriterion("DECSCRIPTION =", value, "decscription");
            return (Criteria) this;
        }

        public Criteria andDecscriptionNotEqualTo(Object value) {
            addCriterion("DECSCRIPTION <>", value, "decscription");
            return (Criteria) this;
        }

        public Criteria andDecscriptionGreaterThan(Object value) {
            addCriterion("DECSCRIPTION >", value, "decscription");
            return (Criteria) this;
        }

        public Criteria andDecscriptionGreaterThanOrEqualTo(Object value) {
            addCriterion("DECSCRIPTION >=", value, "decscription");
            return (Criteria) this;
        }

        public Criteria andDecscriptionLessThan(Object value) {
            addCriterion("DECSCRIPTION <", value, "decscription");
            return (Criteria) this;
        }

        public Criteria andDecscriptionLessThanOrEqualTo(Object value) {
            addCriterion("DECSCRIPTION <=", value, "decscription");
            return (Criteria) this;
        }

        public Criteria andDecscriptionIn(List<Object> values) {
            addCriterion("DECSCRIPTION in", values, "decscription");
            return (Criteria) this;
        }

        public Criteria andDecscriptionNotIn(List<Object> values) {
            addCriterion("DECSCRIPTION not in", values, "decscription");
            return (Criteria) this;
        }

        public Criteria andDecscriptionBetween(Object value1, Object value2) {
            addCriterion("DECSCRIPTION between", value1, value2, "decscription");
            return (Criteria) this;
        }

        public Criteria andDecscriptionNotBetween(Object value1, Object value2) {
            addCriterion("DECSCRIPTION not between", value1, value2, "decscription");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayIsNull() {
            addCriterion("PERMISSION_DISPLAY is null");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayIsNotNull() {
            addCriterion("PERMISSION_DISPLAY is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayEqualTo(Object value) {
            addCriterion("PERMISSION_DISPLAY =", value, "permissionDisplay");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNotEqualTo(Object value) {
            addCriterion("PERMISSION_DISPLAY <>", value, "permissionDisplay");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayGreaterThan(Object value) {
            addCriterion("PERMISSION_DISPLAY >", value, "permissionDisplay");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayGreaterThanOrEqualTo(Object value) {
            addCriterion("PERMISSION_DISPLAY >=", value, "permissionDisplay");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayLessThan(Object value) {
            addCriterion("PERMISSION_DISPLAY <", value, "permissionDisplay");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayLessThanOrEqualTo(Object value) {
            addCriterion("PERMISSION_DISPLAY <=", value, "permissionDisplay");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayIn(List<Object> values) {
            addCriterion("PERMISSION_DISPLAY in", values, "permissionDisplay");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNotIn(List<Object> values) {
            addCriterion("PERMISSION_DISPLAY not in", values, "permissionDisplay");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayBetween(Object value1, Object value2) {
            addCriterion("PERMISSION_DISPLAY between", value1, value2, "permissionDisplay");
            return (Criteria) this;
        }

        public Criteria andPermissionDisplayNotBetween(Object value1, Object value2) {
            addCriterion("PERMISSION_DISPLAY not between", value1, value2, "permissionDisplay");
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