package edu.hunau.love.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
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

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(String value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(String value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(String value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(String value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(String value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLike(String value) {
            addCriterion("team_id like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotLike(String value) {
            addCriterion("team_id not like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<String> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<String> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(String value1, String value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(String value1, String value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNull() {
            addCriterion("team_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("team_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("team_name =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("team_name <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("team_name >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("team_name >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("team_name <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("team_name <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("team_name like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("team_name not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("team_name in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("team_name not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("team_name between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("team_name not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andFoundNameIsNull() {
            addCriterion("found_name is null");
            return (Criteria) this;
        }

        public Criteria andFoundNameIsNotNull() {
            addCriterion("found_name is not null");
            return (Criteria) this;
        }

        public Criteria andFoundNameEqualTo(String value) {
            addCriterion("found_name =", value, "foundName");
            return (Criteria) this;
        }

        public Criteria andFoundNameNotEqualTo(String value) {
            addCriterion("found_name <>", value, "foundName");
            return (Criteria) this;
        }

        public Criteria andFoundNameGreaterThan(String value) {
            addCriterion("found_name >", value, "foundName");
            return (Criteria) this;
        }

        public Criteria andFoundNameGreaterThanOrEqualTo(String value) {
            addCriterion("found_name >=", value, "foundName");
            return (Criteria) this;
        }

        public Criteria andFoundNameLessThan(String value) {
            addCriterion("found_name <", value, "foundName");
            return (Criteria) this;
        }

        public Criteria andFoundNameLessThanOrEqualTo(String value) {
            addCriterion("found_name <=", value, "foundName");
            return (Criteria) this;
        }

        public Criteria andFoundNameLike(String value) {
            addCriterion("found_name like", value, "foundName");
            return (Criteria) this;
        }

        public Criteria andFoundNameNotLike(String value) {
            addCriterion("found_name not like", value, "foundName");
            return (Criteria) this;
        }

        public Criteria andFoundNameIn(List<String> values) {
            addCriterion("found_name in", values, "foundName");
            return (Criteria) this;
        }

        public Criteria andFoundNameNotIn(List<String> values) {
            addCriterion("found_name not in", values, "foundName");
            return (Criteria) this;
        }

        public Criteria andFoundNameBetween(String value1, String value2) {
            addCriterion("found_name between", value1, value2, "foundName");
            return (Criteria) this;
        }

        public Criteria andFoundNameNotBetween(String value1, String value2) {
            addCriterion("found_name not between", value1, value2, "foundName");
            return (Criteria) this;
        }

        public Criteria andTeamTimeIsNull() {
            addCriterion("team_time is null");
            return (Criteria) this;
        }

        public Criteria andTeamTimeIsNotNull() {
            addCriterion("team_time is not null");
            return (Criteria) this;
        }

        public Criteria andTeamTimeEqualTo(Date value) {
            addCriterion("team_time =", value, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeNotEqualTo(Date value) {
            addCriterion("team_time <>", value, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeGreaterThan(Date value) {
            addCriterion("team_time >", value, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("team_time >=", value, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeLessThan(Date value) {
            addCriterion("team_time <", value, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeLessThanOrEqualTo(Date value) {
            addCriterion("team_time <=", value, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeIn(List<Date> values) {
            addCriterion("team_time in", values, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeNotIn(List<Date> values) {
            addCriterion("team_time not in", values, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeBetween(Date value1, Date value2) {
            addCriterion("team_time between", value1, value2, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeamTimeNotBetween(Date value1, Date value2) {
            addCriterion("team_time not between", value1, value2, "teamTime");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeamEmailIsNull() {
            addCriterion("team_email is null");
            return (Criteria) this;
        }

        public Criteria andTeamEmailIsNotNull() {
            addCriterion("team_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEmailEqualTo(String value) {
            addCriterion("team_email =", value, "teamEmail");
            return (Criteria) this;
        }

        public Criteria andTeamEmailNotEqualTo(String value) {
            addCriterion("team_email <>", value, "teamEmail");
            return (Criteria) this;
        }

        public Criteria andTeamEmailGreaterThan(String value) {
            addCriterion("team_email >", value, "teamEmail");
            return (Criteria) this;
        }

        public Criteria andTeamEmailGreaterThanOrEqualTo(String value) {
            addCriterion("team_email >=", value, "teamEmail");
            return (Criteria) this;
        }

        public Criteria andTeamEmailLessThan(String value) {
            addCriterion("team_email <", value, "teamEmail");
            return (Criteria) this;
        }

        public Criteria andTeamEmailLessThanOrEqualTo(String value) {
            addCriterion("team_email <=", value, "teamEmail");
            return (Criteria) this;
        }

        public Criteria andTeamEmailLike(String value) {
            addCriterion("team_email like", value, "teamEmail");
            return (Criteria) this;
        }

        public Criteria andTeamEmailNotLike(String value) {
            addCriterion("team_email not like", value, "teamEmail");
            return (Criteria) this;
        }

        public Criteria andTeamEmailIn(List<String> values) {
            addCriterion("team_email in", values, "teamEmail");
            return (Criteria) this;
        }

        public Criteria andTeamEmailNotIn(List<String> values) {
            addCriterion("team_email not in", values, "teamEmail");
            return (Criteria) this;
        }

        public Criteria andTeamEmailBetween(String value1, String value2) {
            addCriterion("team_email between", value1, value2, "teamEmail");
            return (Criteria) this;
        }

        public Criteria andTeamEmailNotBetween(String value1, String value2) {
            addCriterion("team_email not between", value1, value2, "teamEmail");
            return (Criteria) this;
        }

        public Criteria andTeamImageIsNull() {
            addCriterion("team_image is null");
            return (Criteria) this;
        }

        public Criteria andTeamImageIsNotNull() {
            addCriterion("team_image is not null");
            return (Criteria) this;
        }

        public Criteria andTeamImageEqualTo(String value) {
            addCriterion("team_image =", value, "teamImage");
            return (Criteria) this;
        }

        public Criteria andTeamImageNotEqualTo(String value) {
            addCriterion("team_image <>", value, "teamImage");
            return (Criteria) this;
        }

        public Criteria andTeamImageGreaterThan(String value) {
            addCriterion("team_image >", value, "teamImage");
            return (Criteria) this;
        }

        public Criteria andTeamImageGreaterThanOrEqualTo(String value) {
            addCriterion("team_image >=", value, "teamImage");
            return (Criteria) this;
        }

        public Criteria andTeamImageLessThan(String value) {
            addCriterion("team_image <", value, "teamImage");
            return (Criteria) this;
        }

        public Criteria andTeamImageLessThanOrEqualTo(String value) {
            addCriterion("team_image <=", value, "teamImage");
            return (Criteria) this;
        }

        public Criteria andTeamImageLike(String value) {
            addCriterion("team_image like", value, "teamImage");
            return (Criteria) this;
        }

        public Criteria andTeamImageNotLike(String value) {
            addCriterion("team_image not like", value, "teamImage");
            return (Criteria) this;
        }

        public Criteria andTeamImageIn(List<String> values) {
            addCriterion("team_image in", values, "teamImage");
            return (Criteria) this;
        }

        public Criteria andTeamImageNotIn(List<String> values) {
            addCriterion("team_image not in", values, "teamImage");
            return (Criteria) this;
        }

        public Criteria andTeamImageBetween(String value1, String value2) {
            addCriterion("team_image between", value1, value2, "teamImage");
            return (Criteria) this;
        }

        public Criteria andTeamImageNotBetween(String value1, String value2) {
            addCriterion("team_image not between", value1, value2, "teamImage");
            return (Criteria) this;
        }

        public Criteria andTeamColleageIsNull() {
            addCriterion("team_colleage is null");
            return (Criteria) this;
        }

        public Criteria andTeamColleageIsNotNull() {
            addCriterion("team_colleage is not null");
            return (Criteria) this;
        }

        public Criteria andTeamColleageEqualTo(String value) {
            addCriterion("team_colleage =", value, "teamColleage");
            return (Criteria) this;
        }

        public Criteria andTeamColleageNotEqualTo(String value) {
            addCriterion("team_colleage <>", value, "teamColleage");
            return (Criteria) this;
        }

        public Criteria andTeamColleageGreaterThan(String value) {
            addCriterion("team_colleage >", value, "teamColleage");
            return (Criteria) this;
        }

        public Criteria andTeamColleageGreaterThanOrEqualTo(String value) {
            addCriterion("team_colleage >=", value, "teamColleage");
            return (Criteria) this;
        }

        public Criteria andTeamColleageLessThan(String value) {
            addCriterion("team_colleage <", value, "teamColleage");
            return (Criteria) this;
        }

        public Criteria andTeamColleageLessThanOrEqualTo(String value) {
            addCriterion("team_colleage <=", value, "teamColleage");
            return (Criteria) this;
        }

        public Criteria andTeamColleageLike(String value) {
            addCriterion("team_colleage like", value, "teamColleage");
            return (Criteria) this;
        }

        public Criteria andTeamColleageNotLike(String value) {
            addCriterion("team_colleage not like", value, "teamColleage");
            return (Criteria) this;
        }

        public Criteria andTeamColleageIn(List<String> values) {
            addCriterion("team_colleage in", values, "teamColleage");
            return (Criteria) this;
        }

        public Criteria andTeamColleageNotIn(List<String> values) {
            addCriterion("team_colleage not in", values, "teamColleage");
            return (Criteria) this;
        }

        public Criteria andTeamColleageBetween(String value1, String value2) {
            addCriterion("team_colleage between", value1, value2, "teamColleage");
            return (Criteria) this;
        }

        public Criteria andTeamColleageNotBetween(String value1, String value2) {
            addCriterion("team_colleage not between", value1, value2, "teamColleage");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderIsNull() {
            addCriterion("team_leader is null");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderIsNotNull() {
            addCriterion("team_leader is not null");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderEqualTo(String value) {
            addCriterion("team_leader =", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderNotEqualTo(String value) {
            addCriterion("team_leader <>", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderGreaterThan(String value) {
            addCriterion("team_leader >", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("team_leader >=", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderLessThan(String value) {
            addCriterion("team_leader <", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderLessThanOrEqualTo(String value) {
            addCriterion("team_leader <=", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderLike(String value) {
            addCriterion("team_leader like", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderNotLike(String value) {
            addCriterion("team_leader not like", value, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderIn(List<String> values) {
            addCriterion("team_leader in", values, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderNotIn(List<String> values) {
            addCriterion("team_leader not in", values, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderBetween(String value1, String value2) {
            addCriterion("team_leader between", value1, value2, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamLeaderNotBetween(String value1, String value2) {
            addCriterion("team_leader not between", value1, value2, "teamLeader");
            return (Criteria) this;
        }

        public Criteria andTeamGradeIsNull() {
            addCriterion("team_grade is null");
            return (Criteria) this;
        }

        public Criteria andTeamGradeIsNotNull() {
            addCriterion("team_grade is not null");
            return (Criteria) this;
        }

        public Criteria andTeamGradeEqualTo(String value) {
            addCriterion("team_grade =", value, "teamGrade");
            return (Criteria) this;
        }

        public Criteria andTeamGradeNotEqualTo(String value) {
            addCriterion("team_grade <>", value, "teamGrade");
            return (Criteria) this;
        }

        public Criteria andTeamGradeGreaterThan(String value) {
            addCriterion("team_grade >", value, "teamGrade");
            return (Criteria) this;
        }

        public Criteria andTeamGradeGreaterThanOrEqualTo(String value) {
            addCriterion("team_grade >=", value, "teamGrade");
            return (Criteria) this;
        }

        public Criteria andTeamGradeLessThan(String value) {
            addCriterion("team_grade <", value, "teamGrade");
            return (Criteria) this;
        }

        public Criteria andTeamGradeLessThanOrEqualTo(String value) {
            addCriterion("team_grade <=", value, "teamGrade");
            return (Criteria) this;
        }

        public Criteria andTeamGradeLike(String value) {
            addCriterion("team_grade like", value, "teamGrade");
            return (Criteria) this;
        }

        public Criteria andTeamGradeNotLike(String value) {
            addCriterion("team_grade not like", value, "teamGrade");
            return (Criteria) this;
        }

        public Criteria andTeamGradeIn(List<String> values) {
            addCriterion("team_grade in", values, "teamGrade");
            return (Criteria) this;
        }

        public Criteria andTeamGradeNotIn(List<String> values) {
            addCriterion("team_grade not in", values, "teamGrade");
            return (Criteria) this;
        }

        public Criteria andTeamGradeBetween(String value1, String value2) {
            addCriterion("team_grade between", value1, value2, "teamGrade");
            return (Criteria) this;
        }

        public Criteria andTeamGradeNotBetween(String value1, String value2) {
            addCriterion("team_grade not between", value1, value2, "teamGrade");
            return (Criteria) this;
        }

        public Criteria andReamCheckedIsNull() {
            addCriterion("ream_checked is null");
            return (Criteria) this;
        }

        public Criteria andReamCheckedIsNotNull() {
            addCriterion("ream_checked is not null");
            return (Criteria) this;
        }

        public Criteria andReamCheckedEqualTo(String value) {
            addCriterion("ream_checked =", value, "reamChecked");
            return (Criteria) this;
        }

        public Criteria andReamCheckedNotEqualTo(String value) {
            addCriterion("ream_checked <>", value, "reamChecked");
            return (Criteria) this;
        }

        public Criteria andReamCheckedGreaterThan(String value) {
            addCriterion("ream_checked >", value, "reamChecked");
            return (Criteria) this;
        }

        public Criteria andReamCheckedGreaterThanOrEqualTo(String value) {
            addCriterion("ream_checked >=", value, "reamChecked");
            return (Criteria) this;
        }

        public Criteria andReamCheckedLessThan(String value) {
            addCriterion("ream_checked <", value, "reamChecked");
            return (Criteria) this;
        }

        public Criteria andReamCheckedLessThanOrEqualTo(String value) {
            addCriterion("ream_checked <=", value, "reamChecked");
            return (Criteria) this;
        }

        public Criteria andReamCheckedLike(String value) {
            addCriterion("ream_checked like", value, "reamChecked");
            return (Criteria) this;
        }

        public Criteria andReamCheckedNotLike(String value) {
            addCriterion("ream_checked not like", value, "reamChecked");
            return (Criteria) this;
        }

        public Criteria andReamCheckedIn(List<String> values) {
            addCriterion("ream_checked in", values, "reamChecked");
            return (Criteria) this;
        }

        public Criteria andReamCheckedNotIn(List<String> values) {
            addCriterion("ream_checked not in", values, "reamChecked");
            return (Criteria) this;
        }

        public Criteria andReamCheckedBetween(String value1, String value2) {
            addCriterion("ream_checked between", value1, value2, "reamChecked");
            return (Criteria) this;
        }

        public Criteria andReamCheckedNotBetween(String value1, String value2) {
            addCriterion("ream_checked not between", value1, value2, "reamChecked");
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