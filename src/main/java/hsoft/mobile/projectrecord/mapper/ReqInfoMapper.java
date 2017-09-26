package hsoft.mobile.projectrecord.mapper;

import hsoft.mobile.projectrecord.model.ReqInfo;
import hsoft.mobile.projectrecord.model.ReqInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReqInfoMapper {
    long countByExample(ReqInfoExample example);

    int deleteByExample(ReqInfoExample example);

    int deleteByPrimaryKey(Integer reqid);

    int insert(ReqInfo record);

    int insertSelective(ReqInfo record);

    List<ReqInfo> selectByExampleWithBLOBs(ReqInfoExample example);

    List<ReqInfo> selectByExample(ReqInfoExample example);

    ReqInfo selectByPrimaryKey(Integer reqid);

    int updateByExampleSelective(@Param("record") ReqInfo record, @Param("example") ReqInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ReqInfo record, @Param("example") ReqInfoExample example);

    int updateByExample(@Param("record") ReqInfo record, @Param("example") ReqInfoExample example);

    int updateByPrimaryKeySelective(ReqInfo record);

    int updateByPrimaryKeyWithBLOBs(ReqInfo record);

    int updateByPrimaryKey(ReqInfo record);
}