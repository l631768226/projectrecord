package hsoft.mobile.projectrecord.controller;

import hsoft.mobile.projectrecord.model.ProjectInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProjectDao {

    /**
     * 根据项目名称查询
     * @param projName 项目名称
     * @return 项目信息list
     */
    @Select("select * from project_info where projName = #{projName} and hide = 0")
    List<ProjectInfo> findByProjName(@Param("projName") String projName);
}
