package edu.hunau.love.service;

import java.util.List;
import edu.hunau.love.pojo.Activity;
public interface ActivityBiz {
		
	List<Activity> findAllActivity();
	
	Activity findById(String id);
	
	void insertActivity(Activity activity);
	
	List<Activity>  findMyTeamActivityRunning(String aTeamName);
	
	List<Activity>  findMyTeamActivityFinished(String aTeamName);
	
	List<Activity> findAllActivitys();
	
	List<Activity> findAllActivityMyTeam(String aTeamName);
	
	List<Activity> findAllActivityThisTeam(String aTeamName);
	
	List<Activity> findAllActivitysNotChecked();
	
	void checkActivity(Activity activity);
}
