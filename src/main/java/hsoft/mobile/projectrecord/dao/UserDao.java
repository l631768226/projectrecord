package hsoft.mobile.projectrecord.dao;

import hsoft.mobile.projectrecord.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 操作用户信息表（user）
 * create by LY on 2017/9/22
 */
public interface UserDao {

    /**
     * 根据用户名和密码查询用户信息表
     * @param username 用户名
     * @param password 密码
     * @return 用户信息model
     */
    @Select("select * from user where username = #{username} and password = #{password} and hide = 0")
    User processLogin(@Param("username") String username, @Param("password") String password);

    /**
     * 根据用户名查询用户信息表
     * @param username 用户名
     * @return 用户信息list
     */
    @Select("select * from user where username = #{username} and hide = 0")
    List<User> findByUsername(@Param("username") String username);

    /**
     * 根据用户id或用户名查询用户信息
     * @param userId 用户id
     * @param username 用户名
     * @return 用户信息list
     */
    @Select("select * from user where (userId = ${userId} or username = #{username} ) and hide = 0")
    List<User> findByIdOrUsername(@Param("userId") int userId, @Param("username") String username);

    /**
     * 根据userId查询用户信息
     * @param userId 用户信息主键id
     * @return 用户信息model
     */
    @Select("select * from user where userId = ${userId} and hide = 0")
    User findById(@Param("userId") int userId);

    /**
     * 获取用户列表
     * @return 用户信息list
     */
    @Select("select * from user where hide = 0")
    List<User> findList();

    /**
     * 关联用户表和技能表，根据技能查询用户列表
     * @param platformId 平台信息id
     * @return 用户信息list
     */
    @Select("select * from user as A, skill as B where A.userId = B.userId and B.platformId = " +
            "${platformId} and A.hide = 0 order by A.userId asc")
    List<User> findSkillList(@Param("platformId") int platformId);
}
