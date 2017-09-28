package hsoft.mobile.projectrecord.dao;

import hsoft.mobile.projectrecord.model.Issue;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * create by TX on 2017/9/26
 */
public interface IssueDao extends BaseDao {

    @Select("select * from issue where name = #{name}")
    List<Issue> findByName(@Param("name") String name);

    @Select("select * from issue where id = ${id}")
    Issue findById(@Param("id") int id);

    @Select("select * from issue")
    List<Issue> findList();

    @Select("select * from issue where id = ${id} or name = #{name}")
    List<Issue> findByIdOrName(@Param("id") int id, @Param("name") String name);
}
