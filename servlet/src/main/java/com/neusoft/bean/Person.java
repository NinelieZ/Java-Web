package com.neusoft.bean;

import java.sql.Date;

public class Person {
    private int id;
    private String nickName;
    private String realName;
    private String showTime;
    private Date birthday;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getRealName() {
        return realName;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public String getShowTime() {
        return showTime;
    }
    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", birthday=" + birthday + ", nickName=" + nickName + ", realName=" + realName
                + ", showTime=" + showTime + "]";
    }
    
}
