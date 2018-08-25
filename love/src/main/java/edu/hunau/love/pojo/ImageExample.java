package edu.hunau.love.pojo;

import java.util.ArrayList;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andImageUsernameIsNull() {
            addCriterion("image_username is null");
            return (Criteria) this;
        }

        public Criteria andImageUsernameIsNotNull() {
            addCriterion("image_username is not null");
            return (Criteria) this;
        }

        public Criteria andImageUsernameEqualTo(String value) {
            addCriterion("image_username =", value, "imageUsername");
            return (Criteria) this;
        }

        public Criteria andImageUsernameNotEqualTo(String value) {
            addCriterion("image_username <>", value, "imageUsername");
            return (Criteria) this;
        }

        public Criteria andImageUsernameGreaterThan(String value) {
            addCriterion("image_username >", value, "imageUsername");
            return (Criteria) this;
        }

        public Criteria andImageUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("image_username >=", value, "imageUsername");
            return (Criteria) this;
        }

        public Criteria andImageUsernameLessThan(String value) {
            addCriterion("image_username <", value, "imageUsername");
            return (Criteria) this;
        }

        public Criteria andImageUsernameLessThanOrEqualTo(String value) {
            addCriterion("image_username <=", value, "imageUsername");
            return (Criteria) this;
        }

        public Criteria andImageUsernameLike(String value) {
            addCriterion("image_username like", value, "imageUsername");
            return (Criteria) this;
        }

        public Criteria andImageUsernameNotLike(String value) {
            addCriterion("image_username not like", value, "imageUsername");
            return (Criteria) this;
        }

        public Criteria andImageUsernameIn(List<String> values) {
            addCriterion("image_username in", values, "imageUsername");
            return (Criteria) this;
        }

        public Criteria andImageUsernameNotIn(List<String> values) {
            addCriterion("image_username not in", values, "imageUsername");
            return (Criteria) this;
        }

        public Criteria andImageUsernameBetween(String value1, String value2) {
            addCriterion("image_username between", value1, value2, "imageUsername");
            return (Criteria) this;
        }

        public Criteria andImageUsernameNotBetween(String value1, String value2) {
            addCriterion("image_username not between", value1, value2, "imageUsername");
            return (Criteria) this;
        }

        public Criteria andImageImageIsNull() {
            addCriterion("image_image is null");
            return (Criteria) this;
        }

        public Criteria andImageImageIsNotNull() {
            addCriterion("image_image is not null");
            return (Criteria) this;
        }

        public Criteria andImageImageEqualTo(String value) {
            addCriterion("image_image =", value, "imageImage");
            return (Criteria) this;
        }

        public Criteria andImageImageNotEqualTo(String value) {
            addCriterion("image_image <>", value, "imageImage");
            return (Criteria) this;
        }

        public Criteria andImageImageGreaterThan(String value) {
            addCriterion("image_image >", value, "imageImage");
            return (Criteria) this;
        }

        public Criteria andImageImageGreaterThanOrEqualTo(String value) {
            addCriterion("image_image >=", value, "imageImage");
            return (Criteria) this;
        }

        public Criteria andImageImageLessThan(String value) {
            addCriterion("image_image <", value, "imageImage");
            return (Criteria) this;
        }

        public Criteria andImageImageLessThanOrEqualTo(String value) {
            addCriterion("image_image <=", value, "imageImage");
            return (Criteria) this;
        }

        public Criteria andImageImageLike(String value) {
            addCriterion("image_image like", value, "imageImage");
            return (Criteria) this;
        }

        public Criteria andImageImageNotLike(String value) {
            addCriterion("image_image not like", value, "imageImage");
            return (Criteria) this;
        }

        public Criteria andImageImageIn(List<String> values) {
            addCriterion("image_image in", values, "imageImage");
            return (Criteria) this;
        }

        public Criteria andImageImageNotIn(List<String> values) {
            addCriterion("image_image not in", values, "imageImage");
            return (Criteria) this;
        }

        public Criteria andImageImageBetween(String value1, String value2) {
            addCriterion("image_image between", value1, value2, "imageImage");
            return (Criteria) this;
        }

        public Criteria andImageImageNotBetween(String value1, String value2) {
            addCriterion("image_image not between", value1, value2, "imageImage");
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