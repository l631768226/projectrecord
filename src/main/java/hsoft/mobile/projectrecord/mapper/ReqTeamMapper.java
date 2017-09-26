package hsoft.mobile.projectrecord.mapper;

import hsoft.mobile.projectrecord.model.ReqTeam;
import hsoft.mobile.projectrecord.model.ReqTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReqTeamMapper {
    long countByExample(ReqTeamExample example);

    int deleteByExample(ReqTeamExample example);

    int deleteByPrimaryKey(Integer reqteamid);

    int insert(ReqTeam record);

    int insertSelective(ReqTeam record);

    List<ReqTeam> selectByExample(ReqTeamExample example);

    ReqTeam selectByPrimaryKey(Integer reqteamid);

    int updateByExampleSelective(@Param("record") ReqTeam record, @Param("example") ReqTeamExample example);

    int updateByExample(@Param("record") ReqTeam record, @Param("example") ReqTeamExample example);

    int updateByPrimaryKeySelective(ReqTeam record);

    int updateByPrimaryKey(ReqTeam record);
}