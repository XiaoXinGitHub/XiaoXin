package edu.hunau.love.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivityExample() {
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

        public Criteria andAActivityIsNull() {
            addCriterion("a_activity is null");
            return (Criteria) this;
        }

        public Criteria andAActivityIsNotNull() {
            addCriterion("a_activity is not null");
            return (Criteria) this;
        }

        public Criteria andAActivityEqualTo(String value) {
            addCriterion("a_activity =", value, "aActivity");
            return (Criteria) this;
        }

        public Criteria andAActivityNotEqualTo(String value) {
            addCriterion("a_activity <>", value, "aActivity");
            return (Criteria) this;
        }

        public Criteria andAActivityGreaterThan(String value) {
            addCriterion("a_activity >", value, "aActivity");
            return (Criteria) this;
        }

        public Criteria andAActivityGreaterThanOrEqualTo(String value) {
            addCriterion("a_activity >=", value, "aActivity");
            return (Criteria) this;
        }

        public Criteria andAActivityLessThan(String value) {
            addCriterion("a_activity <", value, "aActivity");
            return (Criteria) this;
        }

        public Criteria andAActivityLessThanOrEqualTo(String value) {
            addCriterion("a_activity <=", value, "aActivity");
            return (Criteria) this;
        }

        public Criteria andAActivityLike(String value) {
            addCriterion("a_activity like", value, "aActivity");
            return (Criteria) this;
        }

        public Criteria andAActivityNotLike(String value) {
            addCriterion("a_activity not like", value, "aActivity");
            return (Criteria) this;
        }

        public Criteria andAActivityIn(List<String> values) {
            addCriterion("a_activity in", values, "aActivity");
            return (Criteria) this;
        }

        public Criteria andAActivityNotIn(List<String> values) {
            addCriterion("a_activity not in", values, "aActivity");
            return (Criteria) this;
        }

        public Criteria andAActivityBetween(String value1, String value2) {
            addCriterion("a_activity between", value1, value2, "aActivity");
            return (Criteria) this;
        }

        public Criteria andAActivityNotBetween(String value1, String value2) {
            addCriterion("a_activity not between", value1, value2, "aActivity");
            return (Criteria) this;
        }

        public Criteria andADotimeIsNull() {
            addCriterion("a_dotime is null");
            return (Criteria) this;
        }

        public Criteria andADotimeIsNotNull() {
            addCriterion("a_dotime is not null");
            return (Criteria) this;
        }

        public Criteria andADotimeEqualTo(Date value) {
            addCriterionForJDBCDate("a_dotime =", value, "aDotime");
            return (Criteria) this;
        }

        public Criteria andADotimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("a_dotime <>", value, "aDotime");
            return (Criteria) this;
        }

        public Criteria andADotimeGreaterThan(Date value) {
            addCriterionForJDBCDate("a_dotime >", value, "aDotime");
            return (Criteria) this;
        }

        public Criteria andADotimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("a_dotime >=", value, "aDotime");
            return (Criteria) this;
        }

        public Criteria andADotimeLessThan(Date value) {
            addCriterionForJDBCDate("a_dotime <", value, "aDotime");
            return (Criteria) this;
        }

        public Criteria andADotimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("a_dotime <=", value, "aDotime");
            return (Criteria) this;
        }

        public Criteria andADotimeIn(List<Date> values) {
            addCriterionForJDBCDate("a_dotime in", values, "aDotime");
            return (Criteria) this;
        }

        public Criteria andADotimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("a_dotime not in", values, "aDotime");
            return (Criteria) this;
        }

        public Criteria andADotimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("a_dotime between", value1, value2, "aDotime");
            return (Criteria) this;
        }

        public Criteria andADotimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("a_dotime not between", value1, value2, "aDotime");
            return (Criteria) this;
        }

        public Criteria andAAddressIsNull() {
            addCriterion("a_address is null");
            return (Criteria) this;
        }

        public Criteria andAAddressIsNotNull() {
            addCriterion("a_address is not null");
            return (Criteria) this;
        }

        public Criteria andAAddressEqualTo(String value) {
            addCriterion("a_address =", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressNotEqualTo(String value) {
            addCriterion("a_address <>", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressGreaterThan(String value) {
            addCriterion("a_address >", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressGreaterThanOrEqualTo(String value) {
            addCriterion("a_address >=", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressLessThan(String value) {
            addCriterion("a_address <", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressLessThanOrEqualTo(String value) {
            addCriterion("a_address <=", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressLike(String value) {
            addCriterion("a_address like", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressNotLike(String value) {
            addCriterion("a_address not like", value, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressIn(List<String> values) {
            addCriterion("a_address in", values, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressNotIn(List<String> values) {
            addCriterion("a_address not in", values, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressBetween(String value1, String value2) {
            addCriterion("a_address between", value1, value2, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAAddressNotBetween(String value1, String value2) {
            addCriterion("a_address not between", value1, value2, "aAddress");
            return (Criteria) this;
        }

        public Criteria andAManagerIsNull() {
            addCriterion("a_manager is null");
            return (Criteria) this;
        }

        public Criteria andAManagerIsNotNull() {
            addCriterion("a_manager is not null");
            return (Criteria) this;
        }

        public Criteria andAManagerEqualTo(String value) {
            addCriterion("a_manager =", value, "aManager");
            return (Criteria) this;
        }

        public Criteria andAManagerNotEqualTo(String value) {
            addCriterion("a_manager <>", value, "aManager");
            return (Criteria) this;
        }

        public Criteria andAManagerGreaterThan(String value) {
            addCriterion("a_manager >", value, "aManager");
            return (Criteria) this;
        }

        public Criteria andAManagerGreaterThanOrEqualTo(String value) {
            addCriterion("a_manager >=", value, "aManager");
            return (Criteria) this;
        }

        public Criteria andAManagerLessThan(String value) {
            addCriterion("a_manager <", value, "aManager");
            return (Criteria) this;
        }

        public Criteria andAManagerLessThanOrEqualTo(String value) {
            addCriterion("a_manager <=", value, "aManager");
            return (Criteria) this;
        }

        public Criteria andAManagerLike(String value) {
            addCriterion("a_manager like", value, "aManager");
            return (Criteria) this;
        }

        public Criteria andAManagerNotLike(String value) {
            addCriterion("a_manager not like", value, "aManager");
            return (Criteria) this;
        }

        public Criteria andAManagerIn(List<String> values) {
            addCriterion("a_manager in", values, "aManager");
            return (Criteria) this;
        }

        public Criteria andAManagerNotIn(List<String> values) {
            addCriterion("a_manager not in", values, "aManager");
            return (Criteria) this;
        }

        public Criteria andAManagerBetween(String value1, String value2) {
            addCriterion("a_manager between", value1, value2, "aManager");
            return (Criteria) this;
        }

        public Criteria andAManagerNotBetween(String value1, String value2) {
            addCriterion("a_manager not between", value1, value2, "aManager");
            return (Criteria) this;
        }

        public Criteria andAAtypesIsNull() {
            addCriterion("a_atypes is null");
            return (Criteria) this;
        }

        public Criteria andAAtypesIsNotNull() {
            addCriterion("a_atypes is not null");
            return (Criteria) this;
        }

        public Criteria andAAtypesEqualTo(String value) {
            addCriterion("a_atypes =", value, "aAtypes");
            return (Criteria) this;
        }

        public Criteria andAAtypesNotEqualTo(String value) {
            addCriterion("a_atypes <>", value, "aAtypes");
            return (Criteria) this;
        }

        public Criteria andAAtypesGreaterThan(String value) {
            addCriterion("a_atypes >", value, "aAtypes");
            return (Criteria) this;
        }

        public Criteria andAAtypesGreaterThanOrEqualTo(String value) {
            addCriterion("a_atypes >=", value, "aAtypes");
            return (Criteria) this;
        }

        public Criteria andAAtypesLessThan(String value) {
            addCriterion("a_atypes <", value, "aAtypes");
            return (Criteria) this;
        }

        public Criteria andAAtypesLessThanOrEqualTo(String value) {
            addCriterion("a_atypes <=", value, "aAtypes");
            return (Criteria) this;
        }

        public Criteria andAAtypesLike(String value) {
            addCriterion("a_atypes like", value, "aAtypes");
            return (Criteria) this;
        }

        public Criteria andAAtypesNotLike(String value) {
            addCriterion("a_atypes not like", value, "aAtypes");
            return (Criteria) this;
        }

        public Criteria andAAtypesIn(List<String> values) {
            addCriterion("a_atypes in", values, "aAtypes");
            return (Criteria) this;
        }

        public Criteria andAAtypesNotIn(List<String> values) {
            addCriterion("a_atypes not in", values, "aAtypes");
            return (Criteria) this;
        }

        public Criteria andAAtypesBetween(String value1, String value2) {
            addCriterion("a_atypes between", value1, value2, "aAtypes");
            return (Criteria) this;
        }

        public Criteria andAAtypesNotBetween(String value1, String value2) {
            addCriterion("a_atypes not between", value1, value2, "aAtypes");
            return (Criteria) this;
        }

        public Criteria andATeamnameIsNull() {
            addCriterion("a_teamname is null");
            return (Criteria) this;
        }

        public Criteria andATeamnameIsNotNull() {
            addCriterion("a_teamname is not null");
            return (Criteria) this;
        }

        public Criteria andATeamnameEqualTo(String value) {
            addCriterion("a_teamname =", value, "aTeamname");
            return (Criteria) this;
        }

        public Criteria andATeamnameNotEqualTo(String value) {
            addCriterion("a_teamname <>", value, "aTeamname");
            return (Criteria) this;
        }

        public Criteria andATeamnameGreaterThan(String value) {
            addCriterion("a_teamname >", value, "aTeamname");
            return (Criteria) this;
        }

        public Criteria andATeamnameGreaterThanOrEqualTo(String value) {
            addCriterion("a_teamname >=", value, "aTeamname");
            return (Criteria) this;
        }

        public Criteria andATeamnameLessThan(String value) {
            addCriterion("a_teamname <", value, "aTeamname");
            return (Criteria) this;
        }

        public Criteria andATeamnameLessThanOrEqualTo(String value) {
            addCriterion("a_teamname <=", value, "aTeamname");
            return (Criteria) this;
        }

        public Criteria andATeamnameLike(String value) {
            addCriterion("a_teamname like", value, "aTeamname");
            return (Criteria) this;
        }

        public Criteria andATeamnameNotLike(String value) {
            addCriterion("a_teamname not like", value, "aTeamname");
            return (Criteria) this;
        }

        public Criteria andATeamnameIn(List<String> values) {
            addCriterion("a_teamname in", values, "aTeamname");
            return (Criteria) this;
        }

        public Criteria andATeamnameNotIn(List<String> values) {
            addCriterion("a_teamname not in", values, "aTeamname");
            return (Criteria) this;
        }

        public Criteria andATeamnameBetween(String value1, String value2) {
            addCriterion("a_teamname between", value1, value2, "aTeamname");
            return (Criteria) this;
        }

        public Criteria andATeamnameNotBetween(String value1, String value2) {
            addCriterion("a_teamname not between", value1, value2, "aTeamname");
            return (Criteria) this;
        }

        public Criteria andACountsIsNull() {
            addCriterion("a_counts is null");
            return (Criteria) this;
        }

        public Criteria andACountsIsNotNull() {
            addCriterion("a_counts is not null");
            return (Criteria) this;
        }

        public Criteria andACountsEqualTo(Integer value) {
            addCriterion("a_counts =", value, "aCounts");
            return (Criteria) this;
        }

        public Criteria andACountsNotEqualTo(Integer value) {
            addCriterion("a_counts <>", value, "aCounts");
            return (Criteria) this;
        }

        public Criteria andACountsGreaterThan(Integer value) {
            addCriterion("a_counts >", value, "aCounts");
            return (Criteria) this;
        }

        public Criteria andACountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_counts >=", value, "aCounts");
            return (Criteria) this;
        }

        public Criteria andACountsLessThan(Integer value) {
            addCriterion("a_counts <", value, "aCounts");
            return (Criteria) this;
        }

        public Criteria andACountsLessThanOrEqualTo(Integer value) {
            addCriterion("a_counts <=", value, "aCounts");
            return (Criteria) this;
        }

        public Criteria andACountsIn(List<Integer> values) {
            addCriterion("a_counts in", values, "aCounts");
            return (Criteria) this;
        }

        public Criteria andACountsNotIn(List<Integer> values) {
            addCriterion("a_counts not in", values, "aCounts");
            return (Criteria) this;
        }

        public Criteria andACountsBetween(Integer value1, Integer value2) {
            addCriterion("a_counts between", value1, value2, "aCounts");
            return (Criteria) this;
        }

        public Criteria andACountsNotBetween(Integer value1, Integer value2) {
            addCriterion("a_counts not between", value1, value2, "aCounts");
            return (Criteria) this;
        }

        public Criteria andAOnIsNull() {
            addCriterion("a_on is null");
            return (Criteria) this;
        }

        public Criteria andAOnIsNotNull() {
            addCriterion("a_on is not null");
            return (Criteria) this;
        }

        public Criteria andAOnEqualTo(String value) {
            addCriterion("a_on =", value, "aOn");
            return (Criteria) this;
        }

        public Criteria andAOnNotEqualTo(String value) {
            addCriterion("a_on <>", value, "aOn");
            return (Criteria) this;
        }

        public Criteria andAOnGreaterThan(String value) {
            addCriterion("a_on >", value, "aOn");
            return (Criteria) this;
        }

        public Criteria andAOnGreaterThanOrEqualTo(String value) {
            addCriterion("a_on >=", value, "aOn");
            return (Criteria) this;
        }

        public Criteria andAOnLessThan(String value) {
            addCriterion("a_on <", value, "aOn");
            return (Criteria) this;
        }

        public Criteria andAOnLessThanOrEqualTo(String value) {
            addCriterion("a_on <=", value, "aOn");
            return (Criteria) this;
        }

        public Criteria andAOnLike(String value) {
            addCriterion("a_on like", value, "aOn");
            return (Criteria) this;
        }

        public Criteria andAOnNotLike(String value) {
            addCriterion("a_on not like", value, "aOn");
            return (Criteria) this;
        }

        public Criteria andAOnIn(List<String> values) {
            addCriterion("a_on in", values, "aOn");
            return (Criteria) this;
        }

        public Criteria andAOnNotIn(List<String> values) {
            addCriterion("a_on not in", values, "aOn");
            return (Criteria) this;
        }

        public Criteria andAOnBetween(String value1, String value2) {
            addCriterion("a_on between", value1, value2, "aOn");
            return (Criteria) this;
        }

        public Criteria andAOnNotBetween(String value1, String value2) {
            addCriterion("a_on not between", value1, value2, "aOn");
            return (Criteria) this;
        }

        public Criteria andACheckedIsNull() {
            addCriterion("a_checked is null");
            return (Criteria) this;
        }

        public Criteria andACheckedIsNotNull() {
            addCriterion("a_checked is not null");
            return (Criteria) this;
        }

        public Criteria andACheckedEqualTo(String value) {
            addCriterion("a_checked =", value, "aChecked");
            return (Criteria) this;
        }

        public Criteria andACheckedNotEqualTo(String value) {
            addCriterion("a_checked <>", value, "aChecked");
            return (Criteria) this;
        }

        public Criteria andACheckedGreaterThan(String value) {
            addCriterion("a_checked >", value, "aChecked");
            return (Criteria) this;
        }

        public Criteria andACheckedGreaterThanOrEqualTo(String value) {
            addCriterion("a_checked >=", value, "aChecked");
            return (Criteria) this;
        }

        public Criteria andACheckedLessThan(String value) {
            addCriterion("a_checked <", value, "aChecked");
            return (Criteria) this;
        }

        public Criteria andACheckedLessThanOrEqualTo(String value) {
            addCriterion("a_checked <=", value, "aChecked");
            return (Criteria) this;
        }

        public Criteria andACheckedLike(String value) {
            addCriterion("a_checked like", value, "aChecked");
            return (Criteria) this;
        }

        public Criteria andACheckedNotLike(String value) {
            addCriterion("a_checked not like", value, "aChecked");
            return (Criteria) this;
        }

        public Criteria andACheckedIn(List<String> values) {
            addCriterion("a_checked in", values, "aChecked");
            return (Criteria) this;
        }

        public Criteria andACheckedNotIn(List<String> values) {
            addCriterion("a_checked not in", values, "aChecked");
            return (Criteria) this;
        }

        public Criteria andACheckedBetween(String value1, String value2) {
            addCriterion("a_checked between", value1, value2, "aChecked");
            return (Criteria) this;
        }

        public Criteria andACheckedNotBetween(String value1, String value2) {
            addCriterion("a_checked not between", value1, value2, "aChecked");
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