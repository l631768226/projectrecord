package hsoft.mobile.projectrecord.mapper;

import hsoft.mobile.projectrecord.model.ProjectInfo;
import hsoft.mobile.projectrecord.model.ProjectInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectInfoMapper {
    long countByExample(ProjectInfoExample example);

    int deleteByExample(ProjectInfoExample example);

    int deleteByPrimaryKey(String projindex);

    int insert(ProjectInfo record);

    int insertSelective(ProjectInfo record);

    List<ProjectInfo> selectByExampleWithBLOBs(ProjectInfoExample example);

    List<ProjectInfo> selectByExample(ProjectInfoExample example);

    ProjectInfo selectByPrimaryKey(String projindex);

    int updateByExampleSelective(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    int updateByExample(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    int updateByPrimaryKeySelective(ProjectInfo record);

    int updateByPrimaryKeyWithBLOBs(ProjectInfo record);

    int updateByPrimaryKey(ProjectInfo record);
}