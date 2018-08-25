package edu.hunau.love.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hunau.love.mapper.UserMapper;
import edu.hunau.love.pojo.User;
import edu.hunau.love.service.UserBiz;

@Service
public class UserBizImpl implements UserBiz {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User findById(String id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}

	@Override
	public User findByUsernamePwd(String uUsername, String uPwd)throws RuntimeException {
		User user = userMapper.selectByUsernameAndPwd(uUsername, uPwd);
		if (user == null) {
			throw new RuntimeException("用户名或密码有误!");
		}
		return user;
	}

	@Override
	public User findByUsername(String uUsername)throws RuntimeException {
		User user = userMapper.selectByUsername(uUsername);
		if (user != null) {
			throw new RuntimeException("用户名已被占用!");
		}
		return user;
	}

	@Override
	public User findByEmail(String uEmail)throws RuntimeException {
		User user = userMapper.SelectByEmail(uEmail);
		if (user != null) {
			throw new RuntimeException("邮箱已被占用!");
		}
		return user;
	}

	@Override
	public User findBySId(String uSId)throws RuntimeException {
		User user = userMapper.selectBySid(uSId);
		if (user != null) {
			throw new RuntimeException("学号已被占用!");
		}
		return user;
	}

	@Override
	public void insertUser(User u) {
		userMapper.insert(u);
	}

	@Override
	public User findByUserNames(String uUsername) {
		User user = userMapper.selectByUsername(uUsername);
		return user;
	}

	@Override
	public void modifyByUsername(User u) {
		userMapper.updateByUsername(u);
	}

	@Override
	public List<User> showAllNotAdmin() {
		List<User> selectAll = userMapper.selectAll();
		return selectAll;
	}

	@Override
	public void removuUser(String uUsername) {
	 userMapper.deleteByUsername(uUsername);	
	}

}
