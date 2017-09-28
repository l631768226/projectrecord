package hsoft.mobile.projectrecord.dao;

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

    /**
     * 根据项目编号或项目名称查询
     * @param projIndex 项目编号
     * @param projName 项目名称
     * @return 项目信息list
     */
    @Select("select * from project_info where (projIndex = #{projIndex} or projName = #{projName}) and hide = 0")
    List<ProjectInfo> findByIndexOrProjName(@Param("projIndex") String projIndex, @Param("projName") String projName);

    /**
     * 根据项目编号查询
     * @param projIndex 项目编号
     * @return 项目信息model
     */
    @Select("select * from project_info where projIndex = #{projIndex} and hide = 0")
    ProjectInfo findByIndex(@Param("projIndex") String projIndex);

}
