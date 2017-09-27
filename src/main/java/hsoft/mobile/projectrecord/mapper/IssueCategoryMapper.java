package hsoft.mobile.projectrecord.mapper;

import hsoft.mobile.projectrecord.model.IssueCategory;
import hsoft.mobile.projectrecord.model.IssueCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IssueCategoryMapper {
    long countByExample(IssueCategoryExample example);

    int deleteByExample(IssueCategoryExample example);

    int deleteByPrimaryKey(Integer issuecategoryid);

    int insert(IssueCategory record);

    int insertSelective(IssueCategory record);

    List<IssueCategory> selectByExample(IssueCategoryExample example);

    IssueCategory selectByPrimaryKey(Integer issuecategoryid);

    int updateByExampleSelective(@Param("record") IssueCategory record, @Param("example") IssueCategoryExample example);

    int updateByExample(@Param("record") IssueCategory record, @Param("example") IssueCategoryExample example);

    int updateByPrimaryKeySelective(IssueCategory record);

    int updateByPrimaryKey(IssueCategory record);
}