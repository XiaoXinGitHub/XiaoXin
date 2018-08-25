package edu.hunau.love.service;

import java.util.List;

import edu.hunau.love.pojo.Post;

public interface PostBiz {
	/*
	 * 查找所有帖子
	 */
	List<Post> showAll();
	
	/*
	 *插入一条新帖子
	 */
	void insertPost(Post post);
	
	Post findById(String id);
}
