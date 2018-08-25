package edu.hunau.love.mapper;

import edu.hunau.love.pojo.Discusss;
import edu.hunau.love.pojo.DiscusssExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscusssMapper {
    long countByExample(DiscusssExample example);

    int deleteByExample(DiscusssExample example);

    int deleteByPrimaryKey(String id);

    int insert(Discusss record);

    int insertSelective(Discusss record);

    List<Discusss> selectByExampleWithBLOBs(DiscusssExample example);

    List<Discusss> selectByExample(DiscusssExample example);
    
    List<Discusss> selectBypostId(String discussPid);

    Discusss selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Discusss record, @Param("example") DiscusssExample example);

    int updateByExampleWithBLOBs(@Param("record") Discusss record, @Param("example") DiscusssExample example);

    int updateByExample(@Param("record") Discusss record, @Param("example") DiscusssExample example);

    int updateByPrimaryKeySelective(Discusss record);

    int updateByPrimaryKeyWithBLOBs(Discusss record);

    int updateByPrimaryKey(Discusss record);
}