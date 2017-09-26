package hsoft.mobile.projectrecord.mapper;

import hsoft.mobile.projectrecord.model.ReqSchedule;
import hsoft.mobile.projectrecord.model.ReqScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReqScheduleMapper {
    long countByExample(ReqScheduleExample example);

    int deleteByExample(ReqScheduleExample example);

    int deleteByPrimaryKey(Integer schedid);

    int insert(ReqSchedule record);

    int insertSelective(ReqSchedule record);

    List<ReqSchedule> selectByExample(ReqScheduleExample example);

    ReqSchedule selectByPrimaryKey(Integer schedid);

    int updateByExampleSelective(@Param("record") ReqSchedule record, @Param("example") ReqScheduleExample example);

    int updateByExample(@Param("record") ReqSchedule record, @Param("example") ReqScheduleExample example);

    int updateByPrimaryKeySelective(ReqSchedule record);

    int updateByPrimaryKey(ReqSchedule record);
}