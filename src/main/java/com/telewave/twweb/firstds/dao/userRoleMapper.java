package com.telewave.twweb.firstds.dao;

import com.telewave.twweb.firstds.entity.userRole;
import com.telewave.twweb.firstds.entity.userRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userRoleMapper {
    int countByExample(userRoleExample example);

    int deleteByExample(userRoleExample example);

    int deleteByPrimaryKey(String id);

    int insert(userRole record);

    int insertSelective(userRole record);

    List<userRole> selectByExample(userRoleExample example);

    userRole selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") userRole record, @Param("example") userRoleExample example);

    int updateByExample(@Param("record") userRole record, @Param("example") userRoleExample example);

    int updateByPrimaryKeySelective(userRole record);

    int updateByPrimaryKey(userRole record);
}