package edu.hunau.love.mapper;

import edu.hunau.love.pojo.SchoolMate;
import edu.hunau.love.pojo.SchoolMateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolMateMapper {
    long countByExample(SchoolMateExample example);

    int deleteByExample(SchoolMateExample example);

    int deleteByPrimaryKey(String id);

    int insert(SchoolMate record);

    int insertSelective(SchoolMate record);

    List<SchoolMate> selectByExampleWithBLOBs(SchoolMateExample example);

    List<SchoolMate> selectByExample(SchoolMateExample example);

    SchoolMate selectByPrimaryKey(String id);
    
    List<SchoolMate> selectAllAlreadyChecked();

    int updateByExampleSelective(@Param("record") SchoolMate record, @Param("example") SchoolMateExample example);

    int updateByExampleWithBLOBs(@Param("record") SchoolMate record, @Param("example") SchoolMateExample example);

    int updateByExample(@Param("record") SchoolMate record, @Param("example") SchoolMateExample example);

    int updateByPrimaryKeySelective(SchoolMate record);

    int updateByPrimaryKeyWithBLOBs(SchoolMate record);

    int updateByPrimaryKey(SchoolMate record);
}