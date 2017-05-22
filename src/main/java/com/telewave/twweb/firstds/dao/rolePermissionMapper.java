package com.telewave.twweb.firstds.dao;

import com.telewave.twweb.firstds.entity.rolePermission;
import com.telewave.twweb.firstds.entity.rolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface rolePermissionMapper {
    int countByExample(rolePermissionExample example);

    int deleteByExample(rolePermissionExample example);

    int deleteByPrimaryKey(String id);

    int insert(rolePermission record);

    int insertSelective(rolePermission record);

    List<rolePermission> selectByExample(rolePermissionExample example);

    rolePermission selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") rolePermission record, @Param("example") rolePermissionExample example);

    int updateByExample(@Param("record") rolePermission record, @Param("example") rolePermissionExample example);

    int updateByPrimaryKeySelective(rolePermission record);

    int updateByPrimaryKey(rolePermission record);
}