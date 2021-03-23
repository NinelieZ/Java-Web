package com.mybatis.bean;

public class UserLogin {
    private int id;
    private String U_username;
    private String password;
    private String U_email;
    private int work_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getWork_id() {
        return work_id;
    }

    public void setWork_id(int work_id) {
        this.work_id = work_id;
    }

    @Override
    public String toString() {
        return "UserLogin [U_email=" + U_email + ", U_username=" + U_username + ", id=" + id + ", password=" + password
                + ", work_id=" + work_id + "]";
    }

    public String getU_username() {
        return U_username;
    }

    public void setU_username(String u_username) {
        U_username = u_username;
    }

    public String getU_email() {
        return U_email;
    }

    public void setU_email(String u_email) {
        U_email = u_email;
    }

}
