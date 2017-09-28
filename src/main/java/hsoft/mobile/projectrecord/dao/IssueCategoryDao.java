package hsoft.mobile.projectrecord.dao;

import hsoft.mobile.projectrecord.model.IssueCategory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * create by TX on 2017/9/26
 */
public interface IssueCategoryDao {

    @Select("select * from issue_category where issueCategoryName = #{issueCategoryName}")
    List<IssueCategory> findByName(@Param("issueCategoryName") String issueCategoryName);

    @Select("select * from issue_category where issueCategoryId = ${issueCategoryId}")
    IssueCategory findById(@Param("issueCategory") int issueCategory);

    @Select("select * from issue_category")
    List<IssueCategory> findList();

    @Select("select * from issue_category where issueCategoryId = ${issueCategoryId} or issueCategoryName = #{issueCategoryName}")
    List<IssueCategory> findByIdOrName(@Param("issueCategoryId") int issueCategoryId, @Param("issueCategoryName") String issueCategoryName);
}
