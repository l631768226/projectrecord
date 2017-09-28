package hsoft.mobile.projectrecord.dao;

import hsoft.mobile.projectrecord.model.StatusCategory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StatusDao {

    /**
     * 根据状态类型名称查询
     * @param statusName 状态类型名称
     * @return 状态类型信息list
     */
    @Select("select * from status_category where statusName = #{statusName}")
    List<StatusCategory> findByStatusName(@Param("statusName") String statusName);

    /**
     * 根据id或状态类型名称查询
     * @param statusCategoryId 主键id
     * @param statusName 状态类型名称
     * @return 状态类型信息list
     */
    @Select("select * from status_category where statusCategoryId = ${statusCategoryId} or" +
            " statusName = #{stausName}")
    List<StatusCategory> findByIdOrName(@Param("statusCategoryId") int statusCategoryId,
                                        @Param("statusName") String statusName);

    /**
     * 获取状态类型信息列表
     * @return 状态类型信息list
     */
    @Select("select * from status_category")
    List<StatusCategory> findList();
}
