package edu.hunau.love.service;

import java.util.List;

import edu.hunau.love.pojo.SchoolMate;

public interface SchoolMateBiz {
	
	List<SchoolMate> findAllAlreadyChecked();
	
	void insertImg(SchoolMate schoolmate);

}
