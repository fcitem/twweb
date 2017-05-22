package com.telewave.twweb.firstds.entity;

public class Prmission {
    private String permissionId;

    private Object permissionName;

    private Object decscription;

    private Object permissionDisplay;

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId == null ? null : permissionId.trim();
    }

    public Object getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(Object permissionName) {
        this.permissionName = permissionName;
    }

    public Object getDecscription() {
        return decscription;
    }

    public void setDecscription(Object decscription) {
        this.decscription = decscription;
    }

    public Object getPermissionDisplay() {
        return permissionDisplay;
    }

    public void setPermissionDisplay(Object permissionDisplay) {
        this.permissionDisplay = permissionDisplay;
    }
}