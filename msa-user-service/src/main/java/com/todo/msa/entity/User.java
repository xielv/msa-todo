package com.todo.msa.entity;

/**
 * Created by rochuan on 2017/6/2.
 */
public class User {
    private Integer userId;
    private String username;
    private String mobile;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
