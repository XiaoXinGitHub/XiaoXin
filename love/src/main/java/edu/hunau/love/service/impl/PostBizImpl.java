package edu.hunau.love.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hunau.love.mapper.PostMapper;
import edu.hunau.love.pojo.Post;
import edu.hunau.love.service.PostBiz;
@Service
public class PostBizImpl implements PostBiz {
	@Autowired
	private PostMapper postMapper;
	@Override
	public List<Post> showAll() {
		List<Post> list = postMapper.selectAll();
		return list;
	}
	@Override
	public void insertPost(Post post) {
		postMapper.insert(post);	
	}
	@Override
	public Post findById(String id) {
		Post post = postMapper.selectByPrimaryKey(id);
		return post;
	}

}
