package edu.hunau.love.mapper;

import edu.hunau.love.pojo.Award;
import edu.hunau.love.pojo.AwardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AwardMapper {
    long countByExample(AwardExample example);

    int deleteByExample(AwardExample example);

    int deleteByPrimaryKey(String id);

    int insert(Award record);

    int insertSelective(Award record);

    List<Award> selectByExampleWithBLOBs(AwardExample example);

    List<Award> selectByExample(AwardExample example);

    Award selectByPrimaryKey(String id);
    
    List<Award> selectByHost(String awHost);

    int updateByExampleSelective(@Param("record") Award record, @Param("example") AwardExample example);

    int updateByExampleWithBLOBs(@Param("record") Award record, @Param("example") AwardExample example);

    int updateByExample(@Param("record") Award record, @Param("example") AwardExample example);

    int updateByPrimaryKeySelective(Award record);

    int updateByPrimaryKeyWithBLOBs(Award record);

    int updateByPrimaryKey(Award record);
}