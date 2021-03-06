package com.jzh.model;

import java.io.Serializable;

/**
 * 用户实体 customer
 *
 * @author Junhao Zhou
 * @version 1.0
 */
public class Customer implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Long id;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 最近更新时间
     */
    private String latestUpdateTime;

    /**
     * 删除标记位
     */
    private int isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getLatestUpdateTime() {
        return latestUpdateTime;
    }

    public void setLatestUpdateTime(String latestUpdateTime) {
        this.latestUpdateTime = latestUpdateTime;
    }
}
