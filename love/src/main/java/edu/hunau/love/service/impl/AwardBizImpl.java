package edu.hunau.love.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hunau.love.mapper.AwardMapper;
import edu.hunau.love.pojo.Award;
import edu.hunau.love.service.AwardBiz;
@Service
public class AwardBizImpl implements AwardBiz {
	@Autowired
	private AwardMapper awardMapper;
	@Override
	public List<Award> findByHost(String awHost) {
		List<Award> host = awardMapper.selectByHost(awHost);
		return host;
	}
	
}
