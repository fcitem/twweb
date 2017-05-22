package com.telewave.twweb.firstds.dao;

import com.telewave.twweb.firstds.entity.Prmission;
import com.telewave.twweb.firstds.entity.PrmissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrmissionMapper {
    int countByExample(PrmissionExample example);

    int deleteByExample(PrmissionExample example);

    int deleteByPrimaryKey(String permissionId);

    int insert(Prmission record);

    int insertSelective(Prmission record);

    List<Prmission> selectByExample(PrmissionExample example);

    Prmission selectByPrimaryKey(String permissionId);

    int updateByExampleSelective(@Param("record") Prmission record, @Param("example") PrmissionExample example);

    int updateByExample(@Param("record") Prmission record, @Param("example") PrmissionExample example);

    int updateByPrimaryKeySelective(Prmission record);

    int updateByPrimaryKey(Prmission record);
}