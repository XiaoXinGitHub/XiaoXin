package edu.hunau.love.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiscusssExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiscusssExample() {
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

        public Criteria andDiscusssTimeIsNull() {
            addCriterion("discusss_time is null");
            return (Criteria) this;
        }

        public Criteria andDiscusssTimeIsNotNull() {
            addCriterion("discusss_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiscusssTimeEqualTo(Date value) {
            addCriterion("discusss_time =", value, "discusssTime");
            return (Criteria) this;
        }

        public Criteria andDiscusssTimeNotEqualTo(Date value) {
            addCriterion("discusss_time <>", value, "discusssTime");
            return (Criteria) this;
        }

        public Criteria andDiscusssTimeGreaterThan(Date value) {
            addCriterion("discusss_time >", value, "discusssTime");
            return (Criteria) this;
        }

        public Criteria andDiscusssTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("discusss_time >=", value, "discusssTime");
            return (Criteria) this;
        }

        public Criteria andDiscusssTimeLessThan(Date value) {
            addCriterion("discusss_time <", value, "discusssTime");
            return (Criteria) this;
        }

        public Criteria andDiscusssTimeLessThanOrEqualTo(Date value) {
            addCriterion("discusss_time <=", value, "discusssTime");
            return (Criteria) this;
        }

        public Criteria andDiscusssTimeIn(List<Date> values) {
            addCriterion("discusss_time in", values, "discusssTime");
            return (Criteria) this;
        }

        public Criteria andDiscusssTimeNotIn(List<Date> values) {
            addCriterion("discusss_time not in", values, "discusssTime");
            return (Criteria) this;
        }

        public Criteria andDiscusssTimeBetween(Date value1, Date value2) {
            addCriterion("discusss_time between", value1, value2, "discusssTime");
            return (Criteria) this;
        }

        public Criteria andDiscusssTimeNotBetween(Date value1, Date value2) {
            addCriterion("discusss_time not between", value1, value2, "discusssTime");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameIsNull() {
            addCriterion("discusss_username is null");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameIsNotNull() {
            addCriterion("discusss_username is not null");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameEqualTo(String value) {
            addCriterion("discusss_username =", value, "discusssUsername");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameNotEqualTo(String value) {
            addCriterion("discusss_username <>", value, "discusssUsername");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameGreaterThan(String value) {
            addCriterion("discusss_username >", value, "discusssUsername");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("discusss_username >=", value, "discusssUsername");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameLessThan(String value) {
            addCriterion("discusss_username <", value, "discusssUsername");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameLessThanOrEqualTo(String value) {
            addCriterion("discusss_username <=", value, "discusssUsername");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameLike(String value) {
            addCriterion("discusss_username like", value, "discusssUsername");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameNotLike(String value) {
            addCriterion("discusss_username not like", value, "discusssUsername");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameIn(List<String> values) {
            addCriterion("discusss_username in", values, "discusssUsername");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameNotIn(List<String> values) {
            addCriterion("discusss_username not in", values, "discusssUsername");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameBetween(String value1, String value2) {
            addCriterion("discusss_username between", value1, value2, "discusssUsername");
            return (Criteria) this;
        }

        public Criteria andDiscusssUsernameNotBetween(String value1, String value2) {
            addCriterion("discusss_username not between", value1, value2, "discusssUsername");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameIsNull() {
            addCriterion("o_discusss_username is null");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameIsNotNull() {
            addCriterion("o_discusss_username is not null");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameEqualTo(String value) {
            addCriterion("o_discusss_username =", value, "oDiscusssUsername");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameNotEqualTo(String value) {
            addCriterion("o_discusss_username <>", value, "oDiscusssUsername");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameGreaterThan(String value) {
            addCriterion("o_discusss_username >", value, "oDiscusssUsername");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("o_discusss_username >=", value, "oDiscusssUsername");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameLessThan(String value) {
            addCriterion("o_discusss_username <", value, "oDiscusssUsername");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameLessThanOrEqualTo(String value) {
            addCriterion("o_discusss_username <=", value, "oDiscusssUsername");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameLike(String value) {
            addCriterion("o_discusss_username like", value, "oDiscusssUsername");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameNotLike(String value) {
            addCriterion("o_discusss_username not like", value, "oDiscusssUsername");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameIn(List<String> values) {
            addCriterion("o_discusss_username in", values, "oDiscusssUsername");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameNotIn(List<String> values) {
            addCriterion("o_discusss_username not in", values, "oDiscusssUsername");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameBetween(String value1, String value2) {
            addCriterion("o_discusss_username between", value1, value2, "oDiscusssUsername");
            return (Criteria) this;
        }

        public Criteria andODiscusssUsernameNotBetween(String value1, String value2) {
            addCriterion("o_discusss_username not between", value1, value2, "oDiscusssUsername");
            return (Criteria) this;
        }

        public Criteria andDiscussPidIsNull() {
            addCriterion("discuss_pid is null");
            return (Criteria) this;
        }

        public Criteria andDiscussPidIsNotNull() {
            addCriterion("discuss_pid is not null");
            return (Criteria) this;
        }

        public Criteria andDiscussPidEqualTo(String value) {
            addCriterion("discuss_pid =", value, "discussPid");
            return (Criteria) this;
        }

        public Criteria andDiscussPidNotEqualTo(String value) {
            addCriterion("discuss_pid <>", value, "discussPid");
            return (Criteria) this;
        }

        public Criteria andDiscussPidGreaterThan(String value) {
            addCriterion("discuss_pid >", value, "discussPid");
            return (Criteria) this;
        }

        public Criteria andDiscussPidGreaterThanOrEqualTo(String value) {
            addCriterion("discuss_pid >=", value, "discussPid");
            return (Criteria) this;
        }

        public Criteria andDiscussPidLessThan(String value) {
            addCriterion("discuss_pid <", value, "discussPid");
            return (Criteria) this;
        }

        public Criteria andDiscussPidLessThanOrEqualTo(String value) {
            addCriterion("discuss_pid <=", value, "discussPid");
            return (Criteria) this;
        }

        public Criteria andDiscussPidLike(String value) {
            addCriterion("discuss_pid like", value, "discussPid");
            return (Criteria) this;
        }

        public Criteria andDiscussPidNotLike(String value) {
            addCriterion("discuss_pid not like", value, "discussPid");
            return (Criteria) this;
        }

        public Criteria andDiscussPidIn(List<String> values) {
            addCriterion("discuss_pid in", values, "discussPid");
            return (Criteria) this;
        }

        public Criteria andDiscussPidNotIn(List<String> values) {
            addCriterion("discuss_pid not in", values, "discussPid");
            return (Criteria) this;
        }

        public Criteria andDiscussPidBetween(String value1, String value2) {
            addCriterion("discuss_pid between", value1, value2, "discussPid");
            return (Criteria) this;
        }

        public Criteria andDiscussPidNotBetween(String value1, String value2) {
            addCriterion("discuss_pid not between", value1, value2, "discussPid");
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