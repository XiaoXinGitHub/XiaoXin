package edu.hunau.love.service;

import java.util.List;

import edu.hunau.love.pojo.Discusss;

public interface DiscusssBiz {

	public void insertDiscuss(Discusss discuss);
	
	public List<Discusss> showDiscuss(String discussPid);
}
