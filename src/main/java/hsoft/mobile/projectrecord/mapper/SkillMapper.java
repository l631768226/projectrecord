package hsoft.mobile.projectrecord.mapper;

import hsoft.mobile.projectrecord.model.Skill;
import hsoft.mobile.projectrecord.model.SkillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkillMapper {
    long countByExample(SkillExample example);

    int deleteByExample(SkillExample example);

    int deleteByPrimaryKey(Integer skillid);

    int insert(Skill record);

    int insertSelective(Skill record);

    List<Skill> selectByExample(SkillExample example);

    Skill selectByPrimaryKey(Integer skillid);

    int updateByExampleSelective(@Param("record") Skill record, @Param("example") SkillExample example);

    int updateByExample(@Param("record") Skill record, @Param("example") SkillExample example);

    int updateByPrimaryKeySelective(Skill record);

    int updateByPrimaryKey(Skill record);
}