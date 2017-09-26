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

    @Select("select * from user where username = #{username} and password = #{password} and hide = 0")
    public User processLogin(@Param("username") String username, @Param("password") String password);

    @Select("select * from user where username = #{username} and hide = 0")
    List<User> findByUsername(@Param("username") String username);

    @Select("select * from user where username = #{username} and hide = 0")
    List<User> findByIdOrUsername(@Param("userId") int userId, @Param("username") String username);

    /**
     * 根据userId查询用户信息
     * @param userId 用户信息主键id
     * @return 用户信息model
     */
    @Select("select * from user where userId = ${userId} and hide = 0")
    User findById(@Param("userId") int userId);

    @Select("select * from user where hide = 0")
    List<User> findList();
}
