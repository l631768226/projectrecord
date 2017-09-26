package hsoft.mobile.projectrecord.mapper;

import hsoft.mobile.projectrecord.model.Document;
import hsoft.mobile.projectrecord.model.DocumentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DocumentMapper {
    long countByExample(DocumentExample example);

    int deleteByExample(DocumentExample example);

    int deleteByPrimaryKey(Integer docid);

    int insert(Document record);

    int insertSelective(Document record);

    List<Document> selectByExample(DocumentExample example);

    Document selectByPrimaryKey(Integer docid);

    int updateByExampleSelective(@Param("record") Document record, @Param("example") DocumentExample example);

    int updateByExample(@Param("record") Document record, @Param("example") DocumentExample example);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKey(Document record);
}