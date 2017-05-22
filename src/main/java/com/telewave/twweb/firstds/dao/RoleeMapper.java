package com.telewave.twweb.firstds.dao;

import com.telewave.twweb.firstds.entity.Rolee;
import com.telewave.twweb.firstds.entity.RoleeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleeMapper {
    int countByExample(RoleeExample example);

    int deleteByExample(RoleeExample example);

    int deleteByPrimaryKey(String roleId);

    int insert(Rolee record);

    int insertSelective(Rolee record);

    List<Rolee> selectByExample(RoleeExample example);

    Rolee selectByPrimaryKey(String roleId);

    int updateByExampleSelective(@Param("record") Rolee record, @Param("example") RoleeExample example);

    int updateByExample(@Param("record") Rolee record, @Param("example") RoleeExample example);

    int updateByPrimaryKeySelective(Rolee record);

    int updateByPrimaryKey(Rolee record);
}