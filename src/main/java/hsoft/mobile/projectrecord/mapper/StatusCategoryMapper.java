package hsoft.mobile.projectrecord.mapper;

import hsoft.mobile.projectrecord.model.StatusCategory;
import hsoft.mobile.projectrecord.model.StatusCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StatusCategoryMapper {
    long countByExample(StatusCategoryExample example);

    int deleteByExample(StatusCategoryExample example);

    int deleteByPrimaryKey(Integer statuscategoryid);

    int insert(StatusCategory record);

    int insertSelective(StatusCategory record);

    List<StatusCategory> selectByExample(StatusCategoryExample example);

    StatusCategory selectByPrimaryKey(Integer statuscategoryid);

    int updateByExampleSelective(@Param("record") StatusCategory record, @Param("example") StatusCategoryExample example);

    int updateByExample(@Param("record") StatusCategory record, @Param("example") StatusCategoryExample example);

    int updateByPrimaryKeySelective(StatusCategory record);

    int updateByPrimaryKey(StatusCategory record);
}