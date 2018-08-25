package edu.hunau.love.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AwardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AwardExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAwAwardIsNull() {
            addCriterion("aw_award is null");
            return (Criteria) this;
        }

        public Criteria andAwAwardIsNotNull() {
            addCriterion("aw_award is not null");
            return (Criteria) this;
        }

        public Criteria andAwAwardEqualTo(String value) {
            addCriterion("aw_award =", value, "awAward");
            return (Criteria) this;
        }

        public Criteria andAwAwardNotEqualTo(String value) {
            addCriterion("aw_award <>", value, "awAward");
            return (Criteria) this;
        }

        public Criteria andAwAwardGreaterThan(String value) {
            addCriterion("aw_award >", value, "awAward");
            return (Criteria) this;
        }

        public Criteria andAwAwardGreaterThanOrEqualTo(String value) {
            addCriterion("aw_award >=", value, "awAward");
            return (Criteria) this;
        }

        public Criteria andAwAwardLessThan(String value) {
            addCriterion("aw_award <", value, "awAward");
            return (Criteria) this;
        }

        public Criteria andAwAwardLessThanOrEqualTo(String value) {
            addCriterion("aw_award <=", value, "awAward");
            return (Criteria) this;
        }

        public Criteria andAwAwardLike(String value) {
            addCriterion("aw_award like", value, "awAward");
            return (Criteria) this;
        }

        public Criteria andAwAwardNotLike(String value) {
            addCriterion("aw_award not like", value, "awAward");
            return (Criteria) this;
        }

        public Criteria andAwAwardIn(List<String> values) {
            addCriterion("aw_award in", values, "awAward");
            return (Criteria) this;
        }

        public Criteria andAwAwardNotIn(List<String> values) {
            addCriterion("aw_award not in", values, "awAward");
            return (Criteria) this;
        }

        public Criteria andAwAwardBetween(String value1, String value2) {
            addCriterion("aw_award between", value1, value2, "awAward");
            return (Criteria) this;
        }

        public Criteria andAwAwardNotBetween(String value1, String value2) {
            addCriterion("aw_award not between", value1, value2, "awAward");
            return (Criteria) this;
        }

        public Criteria andAwTimeIsNull() {
            addCriterion("aw_time is null");
            return (Criteria) this;
        }

        public Criteria andAwTimeIsNotNull() {
            addCriterion("aw_time is not null");
            return (Criteria) this;
        }

        public Criteria andAwTimeEqualTo(Date value) {
            addCriterion("aw_time =", value, "awTime");
            return (Criteria) this;
        }

        public Criteria andAwTimeNotEqualTo(Date value) {
            addCriterion("aw_time <>", value, "awTime");
            return (Criteria) this;
        }

        public Criteria andAwTimeGreaterThan(Date value) {
            addCriterion("aw_time >", value, "awTime");
            return (Criteria) this;
        }

        public Criteria andAwTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("aw_time >=", value, "awTime");
            return (Criteria) this;
        }

        public Criteria andAwTimeLessThan(Date value) {
            addCriterion("aw_time <", value, "awTime");
            return (Criteria) this;
        }

        public Criteria andAwTimeLessThanOrEqualTo(Date value) {
            addCriterion("aw_time <=", value, "awTime");
            return (Criteria) this;
        }

        public Criteria andAwTimeIn(List<Date> values) {
            addCriterion("aw_time in", values, "awTime");
            return (Criteria) this;
        }

        public Criteria andAwTimeNotIn(List<Date> values) {
            addCriterion("aw_time not in", values, "awTime");
            return (Criteria) this;
        }

        public Criteria andAwTimeBetween(Date value1, Date value2) {
            addCriterion("aw_time between", value1, value2, "awTime");
            return (Criteria) this;
        }

        public Criteria andAwTimeNotBetween(Date value1, Date value2) {
            addCriterion("aw_time not between", value1, value2, "awTime");
            return (Criteria) this;
        }

        public Criteria andAwHostIsNull() {
            addCriterion("aw_host is null");
            return (Criteria) this;
        }

        public Criteria andAwHostIsNotNull() {
            addCriterion("aw_host is not null");
            return (Criteria) this;
        }

        public Criteria andAwHostEqualTo(String value) {
            addCriterion("aw_host =", value, "awHost");
            return (Criteria) this;
        }

        public Criteria andAwHostNotEqualTo(String value) {
            addCriterion("aw_host <>", value, "awHost");
            return (Criteria) this;
        }

        public Criteria andAwHostGreaterThan(String value) {
            addCriterion("aw_host >", value, "awHost");
            return (Criteria) this;
        }

        public Criteria andAwHostGreaterThanOrEqualTo(String value) {
            addCriterion("aw_host >=", value, "awHost");
            return (Criteria) this;
        }

        public Criteria andAwHostLessThan(String value) {
            addCriterion("aw_host <", value, "awHost");
            return (Criteria) this;
        }

        public Criteria andAwHostLessThanOrEqualTo(String value) {
            addCriterion("aw_host <=", value, "awHost");
            return (Criteria) this;
        }

        public Criteria andAwHostLike(String value) {
            addCriterion("aw_host like", value, "awHost");
            return (Criteria) this;
        }

        public Criteria andAwHostNotLike(String value) {
            addCriterion("aw_host not like", value, "awHost");
            return (Criteria) this;
        }

        public Criteria andAwHostIn(List<String> values) {
            addCriterion("aw_host in", values, "awHost");
            return (Criteria) this;
        }

        public Criteria andAwHostNotIn(List<String> values) {
            addCriterion("aw_host not in", values, "awHost");
            return (Criteria) this;
        }

        public Criteria andAwHostBetween(String value1, String value2) {
            addCriterion("aw_host between", value1, value2, "awHost");
            return (Criteria) this;
        }

        public Criteria andAwHostNotBetween(String value1, String value2) {
            addCriterion("aw_host not between", value1, value2, "awHost");
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