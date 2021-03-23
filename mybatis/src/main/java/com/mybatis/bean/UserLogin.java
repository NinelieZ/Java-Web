package com.mybatis.bean;

public class UserLogin {
    private int id;
    private String username;
    private String password;
    private String email;
    private int work_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getWork_id() {
        return work_id;
    }

    public void setWork_id(int work_id) {
        this.work_id = work_id;
    }

    @Override
    public String toString() {
        return "UserLogin [email=" + email + ", id=" + id + ", password=" + password + ", username=" + username
                + ", work_id=" + work_id + "]";
    }

}
