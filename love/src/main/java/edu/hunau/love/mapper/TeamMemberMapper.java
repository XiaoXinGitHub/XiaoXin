package edu.hunau.love.mapper;

import edu.hunau.love.pojo.TeamMember;
import edu.hunau.love.pojo.TeamMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamMemberMapper {
    long countByExample(TeamMemberExample example);

    int deleteByExample(TeamMemberExample example);

    int deleteByPrimaryKey(String uName);

    int insert(TeamMember record);

    int insertSelective(TeamMember record);

    List<TeamMember> selectByExample(TeamMemberExample example);

    TeamMember selectByPrimaryKey(String uName);
    
    List<TeamMember> selectByTeamNames(String teamNames);
    
    List<TeamMember> selectByCheckedTeamNames(String teamNames);

    int updateByExampleSelective(@Param("record") TeamMember record, @Param("example") TeamMemberExample example);

    int updateByExample(@Param("record") TeamMember record, @Param("example") TeamMemberExample example);

    int updateByPrimaryKeySelective(TeamMember record);

    int updateByPrimaryKey(TeamMember record);
}