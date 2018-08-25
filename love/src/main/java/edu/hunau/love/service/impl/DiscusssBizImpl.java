package edu.hunau.love.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hunau.love.mapper.DiscusssMapper;
import edu.hunau.love.pojo.Discusss;
import edu.hunau.love.service.DiscusssBiz;
@Service
public class DiscusssBizImpl implements DiscusssBiz {
	@Autowired
	private DiscusssMapper discusssMapper;
	@Override
	public void insertDiscuss(Discusss discuss) {
		discusssMapper.insert(discuss);
	}
	@Override
	public List<Discusss> showDiscuss(String discussPid) {
		List<Discusss> list = discusssMapper.selectBypostId(discussPid);
		return list;
	}

}
