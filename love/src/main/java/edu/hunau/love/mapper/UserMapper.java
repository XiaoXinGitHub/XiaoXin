package edu.hunau.love.mapper;

import edu.hunau.love.pojo.User;
import edu.hunau.love.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);
    /*
     * 根据id查找用户
     */
    User selectByPrimaryKey(String id);
    /*
     * 根据用户名和密码查找用户
     */
    User selectByUsernameAndPwd(@Param("uUsername")String uUsername,@Param("uPwd")String uPwd);    
    /*
     * 根据用户名查找用户
     */
    User selectByUsername(String uUsername);
    /*
     * 根据邮箱查找用户
     */
    User SelectByEmail(String uEmail);
    /*
     * 根据学号查找用户
     */
    User selectBySid(String u_SId);
    /*
     * 查找除管理员意外的所有用户并按照用户名正序排列
     */
    List<User> selectAll();
    /*
     * 根据用户名删除一个用户
     */
    int deleteByUsername(String uUsername);
   
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /*
     * 根据用户名更新一个用户的数据，字段可为空
     */
    int updateByUsername(User u);
}