package edu.hunau.love.service;

import java.util.List;

import edu.hunau.love.pojo.Award;

public interface AwardBiz {
	List<Award> findByHost(String awHost);
}
