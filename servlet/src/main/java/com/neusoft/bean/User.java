package com.neusoft.bean;

public class User {
    int id;
    String userName;
    String password;
    String telphone;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getTelphone() {
        return telphone;
    }
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }


    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", telphone=" + telphone + "]";
    }
}