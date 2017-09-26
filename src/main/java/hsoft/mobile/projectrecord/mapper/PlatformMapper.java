package hsoft.mobile.projectrecord.mapper;

import hsoft.mobile.projectrecord.model.Platform;
import hsoft.mobile.projectrecord.model.PlatformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlatformMapper {
    long countByExample(PlatformExample example);

    int deleteByExample(PlatformExample example);

    int deleteByPrimaryKey(Integer platformid);

    int insert(Platform record);

    int insertSelective(Platform record);

    List<Platform> selectByExample(PlatformExample example);

    Platform selectByPrimaryKey(Integer platformid);

    int updateByExampleSelective(@Param("record") Platform record, @Param("example") PlatformExample example);

    int updateByExample(@Param("record") Platform record, @Param("example") PlatformExample example);

    int updateByPrimaryKeySelective(Platform record);

    int updateByPrimaryKey(Platform record);
}