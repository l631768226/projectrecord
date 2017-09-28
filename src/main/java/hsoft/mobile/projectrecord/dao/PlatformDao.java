package hsoft.mobile.projectrecord.dao;

import hsoft.mobile.projectrecord.model.Platform;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * create by LY on 2017/9/25
 */
public interface PlatformDao {

    @Select("select * from platform where platformName = #{platformName}")
    List<Platform> findByPlatformName(@Param("platformName") String platformName);

    @Select("select * from platform")
    List<Platform> findList();

    @Select("select * from platform where platformId = ${platformId} or platformName = #{platformName}")
    List<Platform> findByIdOrName(@Param("platformId") int platformId, @Param("platformName") String platformName);

    @Select("select * from platform where platformId = ${platformId}")
    Platform findById(@Param("platformId") int platformId);
}
