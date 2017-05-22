package com.telewave.twweb.firstds.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Menu {
    private String menuId;

    private Object menuName;

    private String parentId;

    private Object menuUrl;

    private BigDecimal status;

    private BigDecimal menuOrder;

    private Date createTime;

    private Object description;

    private String menuOpname;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public Object getMenuName() {
        return menuName;
    }

    public void setMenuName(Object menuName) {
        this.menuName = menuName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Object getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(Object menuUrl) {
        this.menuUrl = menuUrl;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(BigDecimal menuOrder) {
        this.menuOrder = menuOrder;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getMenuOpname() {
        return menuOpname;
    }

    public void setMenuOpname(String menuOpname) {
        this.menuOpname = menuOpname == null ? null : menuOpname.trim();
    }
}