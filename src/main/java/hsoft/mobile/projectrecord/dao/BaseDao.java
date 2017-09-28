package hsoft.mobile.projectrecord.dao;

import hsoft.mobile.projectrecord.model.IssueCategory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * create by TX on 2017/9/26
 */
public interface BaseDao<T> {

    List<T> findByName(String name);

    T findById(int id);

    List<T> findList();

    List<T> findByIdOrName(int id, String name);
}
