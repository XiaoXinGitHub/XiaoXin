package edu.hunau.love.mapper;

import edu.hunau.love.pojo.Team;
import edu.hunau.love.pojo.TeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamMapper {
    long countByExample(TeamExample example);

    int deleteByExample(TeamExample example);

    int deleteByPrimaryKey(String teamId);

    int insert(Team record);

    int insertSelective(Team record);

    List<Team> selectByExampleWithBLOBs(TeamExample example);

    List<Team> selectByExample(TeamExample example);

    Team selectByPrimaryKey(String teamId);

    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExampleWithBLOBs(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKeyWithBLOBs(Team record);

    int updateByPrimaryKey(Team record);
    /*
     * 查找所有已经通过审核的队伍 并按照队伍名正序排列
     */
    List<Team> selectAllTeam();
    /*
     * 根据队伍名查找已经通过审核的队伍
     */
    Team selectByTeamName(String teamName);
    /*
     * 根据队伍名更新一个队伍的数据
     */
    int updateByTeamName(Team team);
    /*
     * 主要用来审核团队
     */
    int updateTeamChecked(String teamName);
    /*
     * 查找所有没有通过审核的团队并按照团队申请时间降序排列
     */
    List<Team> selectAllNotChecked();
    /*
     * 根据队伍名修改部分数据
     */
    int updateTeam(Team team);

    
}