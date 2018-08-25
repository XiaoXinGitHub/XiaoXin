package edu.hunau.love.mapper;

import edu.hunau.love.pojo.Activity;
import edu.hunau.love.pojo.ActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityMapper {
    long countByExample(ActivityExample example);

    int deleteByExample(ActivityExample example);

    int deleteByPrimaryKey(String id);

    int insert(Activity record);

    int insertSelective(Activity record);

    List<Activity> selectByExampleWithBLOBs(ActivityExample example);

    List<Activity> selectByExample(ActivityExample example);
    /*
     * 查找已经审核完并且正在进行的所有活动 根据时间倒叙排列
     */
    List<Activity> selectAll();
    /*
     * 查找已经审核并根据时间倒叙排列的所有活动
     */
    List<Activity> selectAllActivity();
    /*
     * 根据队伍名查找团队正在进行的活动，根据时间倒叙排列
     */
    List<Activity> selectMyTeamActivityOnTime(String aTeamName);
    /*
     * 根据队伍名查找已经结束并且已经审核的所有活动  根据时间降序排列
     */
    List<Activity> selectMyTeamActivityAlreadyFinished(String aTeamName);
    /*
     * 根据队伍名查找已经通过审核并且按照时间降序排列的所有活动
     */
    List<Activity> selectAllMyTeamActivity(String aTeamName);
    /*
     * 根据队伍名查找正在进行并且已经通过审核、按照时间降序排列的所有活动
     */
    List<Activity> selectAllThisTeamChecked(String aTeamName);
    /*
     * 根据活动id查找所有活动
     */
    Activity selectByPrimaryKey(String id);
    /*
     * 查找未审核并且正在进行的活动
     */
    List<Activity>  selectAllNotCheckedAndRunning();
    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKeyWithBLOBs(Activity record);
    int updateByPrimaryKey(Activity record);
}