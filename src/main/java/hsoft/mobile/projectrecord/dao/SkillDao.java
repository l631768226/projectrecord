package hsoft.mobile.projectrecord.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

/**
 * create by LY on 2017/9/25
 */
public interface SkillDao {

    @Delete("delete from skill where userId = ${userId}")
    void deleteById(@Param("userId") int userId);
}
