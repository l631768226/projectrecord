package hsoft.mobile.projectrecord.dao;

import hsoft.mobile.projectrecord.model.Department;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * create by TX on 2017/9/26
 */
public interface DepartmentDao {

    @Select("select * from department where departmentName = #{departmentName}")
    List<Department> findByName(@Param("departmentName") String departmentName);

    @Select("select * from department where departmentId = ${departmentId}")
    Department findById(@Param("departmentId") int departmentId);

    @Select("select * from department")
    List<Department> findList();

    @Select("select * from department where departmentId = ${departmentId} or departmentName = #{departmentName}")
    List<Department> findByIdOrName(@Param("departmentId") int departmentId, @Param("departmentName") String departmentName);
}
