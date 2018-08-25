package edu.hunau.love.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.hunau.love.mapper.ActivityMapper;
import edu.hunau.love.pojo.Activity;
import edu.hunau.love.service.ActivityBiz;
@Service
public class ActivityBizImpl implements ActivityBiz {
	@Autowired
	private ActivityMapper activityMapper;
	@Override
	public List<Activity> findAllActivity() {
		List<Activity> list = activityMapper.selectAll();
		if(list.size()==0) {
			throw new RuntimeException("服务器繁忙!");
		}
		return list;
	}
	@Override
	public Activity findById(String id) {
		Activity activity = activityMapper.selectByPrimaryKey(id);
		if(activity==null) {
			throw new RuntimeException("活动不存在或已经被删除!");
		}
		return activity;
	}
	@Override
	public void insertActivity(Activity activity) {
		activityMapper.insert(activity);
	}
	@Override
	public List<Activity> findMyTeamActivityRunning(String aTeamName) {
		List<Activity> activityOnTime = activityMapper.selectMyTeamActivityOnTime(aTeamName);
		return activityOnTime;	
	}
	@Override
	public List<Activity> findMyTeamActivityFinished(String aTeamName) {
		List<Activity> activityAlreadyFinished = activityMapper.selectMyTeamActivityAlreadyFinished(aTeamName);
		return activityAlreadyFinished;
	}
	@Override
	public List<Activity> findAllActivitys() {
		List<Activity> allActivity = activityMapper.selectAllActivity();
		return allActivity;
	}
	@Override
	public List<Activity> findAllActivityMyTeam(String aTeamName) {
		List<Activity> list = activityMapper.selectAllMyTeamActivity(aTeamName);
		return list;
	}
	@Override
	public List<Activity> findAllActivityThisTeam(String aTeamName) {
		List<Activity> list = activityMapper.selectAllThisTeamChecked(aTeamName);
		return list;
	}
	@Override
	public List<Activity> findAllActivitysNotChecked() {
		List<Activity> list = activityMapper.selectAllNotCheckedAndRunning();
		return list;
	}
	@Override
	public void checkActivity(Activity activity) {
		activityMapper.updateByPrimaryKeySelective(activity);
	}
}
