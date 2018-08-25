package edu.hunau.love.service;

import java.util.List;

import edu.hunau.love.pojo.User;

public interface UserBiz {
	// 根据id查找用户
	User findById(String id);
	// 根据用户名和密码查找用户
	User findByUsernamePwd(String uUsername, String uPwd);
	// 根据用户名查找用户
	User findByUsername(String uUsername);
	// 根据邮箱查找用户
	User findByEmail(String uEmail);
	// 根据学号查找用户
	User findBySId(String uSId);
	//插入一个用户
	void insertUser(User u);
	//根据用户名查找用户
	User findByUserNames(String uUsername);
	//根据用户名修改用户信息
	void modifyByUsername(User u);
	//展示所有非管理员用户
	List<User> showAllNotAdmin();
	//根据用户名删除用户
	void removuUser(String uUsername);
}
