package edu.hunau.love.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchoolMateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolMateExample() {
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

        public Criteria andSchoolmateDotimeIsNull() {
            addCriterion("schoolmate_dotime is null");
            return (Criteria) this;
        }

        public Criteria andSchoolmateDotimeIsNotNull() {
            addCriterion("schoolmate_dotime is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolmateDotimeEqualTo(Date value) {
            addCriterion("schoolmate_dotime =", value, "schoolmateDotime");
            return (Criteria) this;
        }

        public Criteria andSchoolmateDotimeNotEqualTo(Date value) {
            addCriterion("schoolmate_dotime <>", value, "schoolmateDotime");
            return (Criteria) this;
        }

        public Criteria andSchoolmateDotimeGreaterThan(Date value) {
            addCriterion("schoolmate_dotime >", value, "schoolmateDotime");
            return (Criteria) this;
        }

        public Criteria andSchoolmateDotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("schoolmate_dotime >=", value, "schoolmateDotime");
            return (Criteria) this;
        }

        public Criteria andSchoolmateDotimeLessThan(Date value) {
            addCriterion("schoolmate_dotime <", value, "schoolmateDotime");
            return (Criteria) this;
        }

        public Criteria andSchoolmateDotimeLessThanOrEqualTo(Date value) {
            addCriterion("schoolmate_dotime <=", value, "schoolmateDotime");
            return (Criteria) this;
        }

        public Criteria andSchoolmateDotimeIn(List<Date> values) {
            addCriterion("schoolmate_dotime in", values, "schoolmateDotime");
            return (Criteria) this;
        }

        public Criteria andSchoolmateDotimeNotIn(List<Date> values) {
            addCriterion("schoolmate_dotime not in", values, "schoolmateDotime");
            return (Criteria) this;
        }

        public Criteria andSchoolmateDotimeBetween(Date value1, Date value2) {
            addCriterion("schoolmate_dotime between", value1, value2, "schoolmateDotime");
            return (Criteria) this;
        }

        public Criteria andSchoolmateDotimeNotBetween(Date value1, Date value2) {
            addCriterion("schoolmate_dotime not between", value1, value2, "schoolmateDotime");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgIsNull() {
            addCriterion("schoolmate_img is null");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgIsNotNull() {
            addCriterion("schoolmate_img is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgEqualTo(String value) {
            addCriterion("schoolmate_img =", value, "schoolmateImg");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgNotEqualTo(String value) {
            addCriterion("schoolmate_img <>", value, "schoolmateImg");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgGreaterThan(String value) {
            addCriterion("schoolmate_img >", value, "schoolmateImg");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgGreaterThanOrEqualTo(String value) {
            addCriterion("schoolmate_img >=", value, "schoolmateImg");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgLessThan(String value) {
            addCriterion("schoolmate_img <", value, "schoolmateImg");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgLessThanOrEqualTo(String value) {
            addCriterion("schoolmate_img <=", value, "schoolmateImg");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgLike(String value) {
            addCriterion("schoolmate_img like", value, "schoolmateImg");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgNotLike(String value) {
            addCriterion("schoolmate_img not like", value, "schoolmateImg");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgIn(List<String> values) {
            addCriterion("schoolmate_img in", values, "schoolmateImg");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgNotIn(List<String> values) {
            addCriterion("schoolmate_img not in", values, "schoolmateImg");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgBetween(String value1, String value2) {
            addCriterion("schoolmate_img between", value1, value2, "schoolmateImg");
            return (Criteria) this;
        }

        public Criteria andSchoolmateImgNotBetween(String value1, String value2) {
            addCriterion("schoolmate_img not between", value1, value2, "schoolmateImg");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedIsNull() {
            addCriterion("schoolmate_checked is null");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedIsNotNull() {
            addCriterion("schoolmate_checked is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedEqualTo(String value) {
            addCriterion("schoolmate_checked =", value, "schoolmateChecked");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedNotEqualTo(String value) {
            addCriterion("schoolmate_checked <>", value, "schoolmateChecked");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedGreaterThan(String value) {
            addCriterion("schoolmate_checked >", value, "schoolmateChecked");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedGreaterThanOrEqualTo(String value) {
            addCriterion("schoolmate_checked >=", value, "schoolmateChecked");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedLessThan(String value) {
            addCriterion("schoolmate_checked <", value, "schoolmateChecked");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedLessThanOrEqualTo(String value) {
            addCriterion("schoolmate_checked <=", value, "schoolmateChecked");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedLike(String value) {
            addCriterion("schoolmate_checked like", value, "schoolmateChecked");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedNotLike(String value) {
            addCriterion("schoolmate_checked not like", value, "schoolmateChecked");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedIn(List<String> values) {
            addCriterion("schoolmate_checked in", values, "schoolmateChecked");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedNotIn(List<String> values) {
            addCriterion("schoolmate_checked not in", values, "schoolmateChecked");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedBetween(String value1, String value2) {
            addCriterion("schoolmate_checked between", value1, value2, "schoolmateChecked");
            return (Criteria) this;
        }

        public Criteria andSchoolmateCheckedNotBetween(String value1, String value2) {
            addCriterion("schoolmate_checked not between", value1, value2, "schoolmateChecked");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameIsNull() {
            addCriterion("schoolmate_username is null");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameIsNotNull() {
            addCriterion("schoolmate_username is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameEqualTo(String value) {
            addCriterion("schoolmate_username =", value, "schoolmateUsername");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameNotEqualTo(String value) {
            addCriterion("schoolmate_username <>", value, "schoolmateUsername");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameGreaterThan(String value) {
            addCriterion("schoolmate_username >", value, "schoolmateUsername");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("schoolmate_username >=", value, "schoolmateUsername");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameLessThan(String value) {
            addCriterion("schoolmate_username <", value, "schoolmateUsername");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameLessThanOrEqualTo(String value) {
            addCriterion("schoolmate_username <=", value, "schoolmateUsername");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameLike(String value) {
            addCriterion("schoolmate_username like", value, "schoolmateUsername");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameNotLike(String value) {
            addCriterion("schoolmate_username not like", value, "schoolmateUsername");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameIn(List<String> values) {
            addCriterion("schoolmate_username in", values, "schoolmateUsername");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameNotIn(List<String> values) {
            addCriterion("schoolmate_username not in", values, "schoolmateUsername");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameBetween(String value1, String value2) {
            addCriterion("schoolmate_username between", value1, value2, "schoolmateUsername");
            return (Criteria) this;
        }

        public Criteria andSchoolmateUsernameNotBetween(String value1, String value2) {
            addCriterion("schoolmate_username not between", value1, value2, "schoolmateUsername");
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