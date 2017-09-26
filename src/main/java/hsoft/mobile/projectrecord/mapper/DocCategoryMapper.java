package hsoft.mobile.projectrecord.mapper;

import hsoft.mobile.projectrecord.model.DocCategory;
import hsoft.mobile.projectrecord.model.DocCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocCategoryMapper {
    long countByExample(DocCategoryExample example);

    int deleteByExample(DocCategoryExample example);

    int deleteByPrimaryKey(Integer doccategoryid);

    int insert(DocCategory record);

    int insertSelective(DocCategory record);

    List<DocCategory> selectByExample(DocCategoryExample example);

    DocCategory selectByPrimaryKey(Integer doccategoryid);

    int updateByExampleSelective(@Param("record") DocCategory record, @Param("example") DocCategoryExample example);

    int updateByExample(@Param("record") DocCategory record, @Param("example") DocCategoryExample example);

    int updateByPrimaryKeySelective(DocCategory record);

    int updateByPrimaryKey(DocCategory record);
}