package edu.hunau.love.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUUsernameIsNull() {
            addCriterion("u_username is null");
            return (Criteria) this;
        }

        public Criteria andUUsernameIsNotNull() {
            addCriterion("u_username is not null");
            return (Criteria) this;
        }

        public Criteria andUUsernameEqualTo(String value) {
            addCriterion("u_username =", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotEqualTo(String value) {
            addCriterion("u_username <>", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameGreaterThan(String value) {
            addCriterion("u_username >", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("u_username >=", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLessThan(String value) {
            addCriterion("u_username <", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLessThanOrEqualTo(String value) {
            addCriterion("u_username <=", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameLike(String value) {
            addCriterion("u_username like", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotLike(String value) {
            addCriterion("u_username not like", value, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameIn(List<String> values) {
            addCriterion("u_username in", values, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotIn(List<String> values) {
            addCriterion("u_username not in", values, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameBetween(String value1, String value2) {
            addCriterion("u_username between", value1, value2, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUUsernameNotBetween(String value1, String value2) {
            addCriterion("u_username not between", value1, value2, "uUsername");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNull() {
            addCriterion("u_pwd is null");
            return (Criteria) this;
        }

        public Criteria andUPwdIsNotNull() {
            addCriterion("u_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUPwdEqualTo(String value) {
            addCriterion("u_pwd =", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotEqualTo(String value) {
            addCriterion("u_pwd <>", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThan(String value) {
            addCriterion("u_pwd >", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdGreaterThanOrEqualTo(String value) {
            addCriterion("u_pwd >=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThan(String value) {
            addCriterion("u_pwd <", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLessThanOrEqualTo(String value) {
            addCriterion("u_pwd <=", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdLike(String value) {
            addCriterion("u_pwd like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotLike(String value) {
            addCriterion("u_pwd not like", value, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdIn(List<String> values) {
            addCriterion("u_pwd in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotIn(List<String> values) {
            addCriterion("u_pwd not in", values, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdBetween(String value1, String value2) {
            addCriterion("u_pwd between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUPwdNotBetween(String value1, String value2) {
            addCriterion("u_pwd not between", value1, value2, "uPwd");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("u_sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("u_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(String value) {
            addCriterion("u_sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(String value) {
            addCriterion("u_sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(String value) {
            addCriterion("u_sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(String value) {
            addCriterion("u_sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(String value) {
            addCriterion("u_sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(String value) {
            addCriterion("u_sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLike(String value) {
            addCriterion("u_sex like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotLike(String value) {
            addCriterion("u_sex not like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<String> values) {
            addCriterion("u_sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<String> values) {
            addCriterion("u_sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(String value1, String value2) {
            addCriterion("u_sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(String value1, String value2) {
            addCriterion("u_sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUTruenameIsNull() {
            addCriterion("u_truename is null");
            return (Criteria) this;
        }

        public Criteria andUTruenameIsNotNull() {
            addCriterion("u_truename is not null");
            return (Criteria) this;
        }

        public Criteria andUTruenameEqualTo(String value) {
            addCriterion("u_truename =", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameNotEqualTo(String value) {
            addCriterion("u_truename <>", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameGreaterThan(String value) {
            addCriterion("u_truename >", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("u_truename >=", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameLessThan(String value) {
            addCriterion("u_truename <", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameLessThanOrEqualTo(String value) {
            addCriterion("u_truename <=", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameLike(String value) {
            addCriterion("u_truename like", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameNotLike(String value) {
            addCriterion("u_truename not like", value, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameIn(List<String> values) {
            addCriterion("u_truename in", values, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameNotIn(List<String> values) {
            addCriterion("u_truename not in", values, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameBetween(String value1, String value2) {
            addCriterion("u_truename between", value1, value2, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUTruenameNotBetween(String value1, String value2) {
            addCriterion("u_truename not between", value1, value2, "uTruename");
            return (Criteria) this;
        }

        public Criteria andUSIdIsNull() {
            addCriterion("u_s_id is null");
            return (Criteria) this;
        }

        public Criteria andUSIdIsNotNull() {
            addCriterion("u_s_id is not null");
            return (Criteria) this;
        }

        public Criteria andUSIdEqualTo(String value) {
            addCriterion("u_s_id =", value, "uSId");
            return (Criteria) this;
        }

        public Criteria andUSIdNotEqualTo(String value) {
            addCriterion("u_s_id <>", value, "uSId");
            return (Criteria) this;
        }

        public Criteria andUSIdGreaterThan(String value) {
            addCriterion("u_s_id >", value, "uSId");
            return (Criteria) this;
        }

        public Criteria andUSIdGreaterThanOrEqualTo(String value) {
            addCriterion("u_s_id >=", value, "uSId");
            return (Criteria) this;
        }

        public Criteria andUSIdLessThan(String value) {
            addCriterion("u_s_id <", value, "uSId");
            return (Criteria) this;
        }

        public Criteria andUSIdLessThanOrEqualTo(String value) {
            addCriterion("u_s_id <=", value, "uSId");
            return (Criteria) this;
        }

        public Criteria andUSIdLike(String value) {
            addCriterion("u_s_id like", value, "uSId");
            return (Criteria) this;
        }

        public Criteria andUSIdNotLike(String value) {
            addCriterion("u_s_id not like", value, "uSId");
            return (Criteria) this;
        }

        public Criteria andUSIdIn(List<String> values) {
            addCriterion("u_s_id in", values, "uSId");
            return (Criteria) this;
        }

        public Criteria andUSIdNotIn(List<String> values) {
            addCriterion("u_s_id not in", values, "uSId");
            return (Criteria) this;
        }

        public Criteria andUSIdBetween(String value1, String value2) {
            addCriterion("u_s_id between", value1, value2, "uSId");
            return (Criteria) this;
        }

        public Criteria andUSIdNotBetween(String value1, String value2) {
            addCriterion("u_s_id not between", value1, value2, "uSId");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("u_email is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("u_email is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("u_email =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("u_email <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("u_email >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("u_email >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("u_email <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("u_email <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("u_email like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("u_email not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("u_email in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("u_email not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("u_email between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("u_email not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUImageIsNull() {
            addCriterion("u_image is null");
            return (Criteria) this;
        }

        public Criteria andUImageIsNotNull() {
            addCriterion("u_image is not null");
            return (Criteria) this;
        }

        public Criteria andUImageEqualTo(String value) {
            addCriterion("u_image =", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageNotEqualTo(String value) {
            addCriterion("u_image <>", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageGreaterThan(String value) {
            addCriterion("u_image >", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageGreaterThanOrEqualTo(String value) {
            addCriterion("u_image >=", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageLessThan(String value) {
            addCriterion("u_image <", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageLessThanOrEqualTo(String value) {
            addCriterion("u_image <=", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageLike(String value) {
            addCriterion("u_image like", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageNotLike(String value) {
            addCriterion("u_image not like", value, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageIn(List<String> values) {
            addCriterion("u_image in", values, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageNotIn(List<String> values) {
            addCriterion("u_image not in", values, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageBetween(String value1, String value2) {
            addCriterion("u_image between", value1, value2, "uImage");
            return (Criteria) this;
        }

        public Criteria andUImageNotBetween(String value1, String value2) {
            addCriterion("u_image not between", value1, value2, "uImage");
            return (Criteria) this;
        }

        public Criteria andUTeamNameIsNull() {
            addCriterion("u_team_name is null");
            return (Criteria) this;
        }

        public Criteria andUTeamNameIsNotNull() {
            addCriterion("u_team_name is not null");
            return (Criteria) this;
        }

        public Criteria andUTeamNameEqualTo(String value) {
            addCriterion("u_team_name =", value, "uTeamName");
            return (Criteria) this;
        }

        public Criteria andUTeamNameNotEqualTo(String value) {
            addCriterion("u_team_name <>", value, "uTeamName");
            return (Criteria) this;
        }

        public Criteria andUTeamNameGreaterThan(String value) {
            addCriterion("u_team_name >", value, "uTeamName");
            return (Criteria) this;
        }

        public Criteria andUTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_team_name >=", value, "uTeamName");
            return (Criteria) this;
        }

        public Criteria andUTeamNameLessThan(String value) {
            addCriterion("u_team_name <", value, "uTeamName");
            return (Criteria) this;
        }

        public Criteria andUTeamNameLessThanOrEqualTo(String value) {
            addCriterion("u_team_name <=", value, "uTeamName");
            return (Criteria) this;
        }

        public Criteria andUTeamNameLike(String value) {
            addCriterion("u_team_name like", value, "uTeamName");
            return (Criteria) this;
        }

        public Criteria andUTeamNameNotLike(String value) {
            addCriterion("u_team_name not like", value, "uTeamName");
            return (Criteria) this;
        }

        public Criteria andUTeamNameIn(List<String> values) {
            addCriterion("u_team_name in", values, "uTeamName");
            return (Criteria) this;
        }

        public Criteria andUTeamNameNotIn(List<String> values) {
            addCriterion("u_team_name not in", values, "uTeamName");
            return (Criteria) this;
        }

        public Criteria andUTeamNameBetween(String value1, String value2) {
            addCriterion("u_team_name between", value1, value2, "uTeamName");
            return (Criteria) this;
        }

        public Criteria andUTeamNameNotBetween(String value1, String value2) {
            addCriterion("u_team_name not between", value1, value2, "uTeamName");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesIsNull() {
            addCriterion("u_peopletypes is null");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesIsNotNull() {
            addCriterion("u_peopletypes is not null");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesEqualTo(String value) {
            addCriterion("u_peopletypes =", value, "uPeopletypes");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesNotEqualTo(String value) {
            addCriterion("u_peopletypes <>", value, "uPeopletypes");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesGreaterThan(String value) {
            addCriterion("u_peopletypes >", value, "uPeopletypes");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesGreaterThanOrEqualTo(String value) {
            addCriterion("u_peopletypes >=", value, "uPeopletypes");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesLessThan(String value) {
            addCriterion("u_peopletypes <", value, "uPeopletypes");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesLessThanOrEqualTo(String value) {
            addCriterion("u_peopletypes <=", value, "uPeopletypes");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesLike(String value) {
            addCriterion("u_peopletypes like", value, "uPeopletypes");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesNotLike(String value) {
            addCriterion("u_peopletypes not like", value, "uPeopletypes");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesIn(List<String> values) {
            addCriterion("u_peopletypes in", values, "uPeopletypes");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesNotIn(List<String> values) {
            addCriterion("u_peopletypes not in", values, "uPeopletypes");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesBetween(String value1, String value2) {
            addCriterion("u_peopletypes between", value1, value2, "uPeopletypes");
            return (Criteria) this;
        }

        public Criteria andUPeopletypesNotBetween(String value1, String value2) {
            addCriterion("u_peopletypes not between", value1, value2, "uPeopletypes");
            return (Criteria) this;
        }

        public Criteria andUDotimeIsNull() {
            addCriterion("u_dotime is null");
            return (Criteria) this;
        }

        public Criteria andUDotimeIsNotNull() {
            addCriterion("u_dotime is not null");
            return (Criteria) this;
        }

        public Criteria andUDotimeEqualTo(Date value) {
            addCriterion("u_dotime =", value, "uDotime");
            return (Criteria) this;
        }

        public Criteria andUDotimeNotEqualTo(Date value) {
            addCriterion("u_dotime <>", value, "uDotime");
            return (Criteria) this;
        }

        public Criteria andUDotimeGreaterThan(Date value) {
            addCriterion("u_dotime >", value, "uDotime");
            return (Criteria) this;
        }

        public Criteria andUDotimeGreaterThanOrEqualTo(Date value) {
            addCriterion("u_dotime >=", value, "uDotime");
            return (Criteria) this;
        }

        public Criteria andUDotimeLessThan(Date value) {
            addCriterion("u_dotime <", value, "uDotime");
            return (Criteria) this;
        }

        public Criteria andUDotimeLessThanOrEqualTo(Date value) {
            addCriterion("u_dotime <=", value, "uDotime");
            return (Criteria) this;
        }

        public Criteria andUDotimeIn(List<Date> values) {
            addCriterion("u_dotime in", values, "uDotime");
            return (Criteria) this;
        }

        public Criteria andUDotimeNotIn(List<Date> values) {
            addCriterion("u_dotime not in", values, "uDotime");
            return (Criteria) this;
        }

        public Criteria andUDotimeBetween(Date value1, Date value2) {
            addCriterion("u_dotime between", value1, value2, "uDotime");
            return (Criteria) this;
        }

        public Criteria andUDotimeNotBetween(Date value1, Date value2) {
            addCriterion("u_dotime not between", value1, value2, "uDotime");
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