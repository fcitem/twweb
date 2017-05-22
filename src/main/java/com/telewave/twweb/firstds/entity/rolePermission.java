package com.telewave.twweb.firstds.entity;

public class rolePermission {
    private String id;

    private String roleId;

    private String menuId;

    private String permissionId;

    private String menuPermiss;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }

    public String getMenuPermiss() {
        return menuPermiss;
    }

    public void setMenuPermiss(String menuPermiss) {
        this.menuPermiss = menuPermiss == null ? null : menuPermiss.trim();
    }
}