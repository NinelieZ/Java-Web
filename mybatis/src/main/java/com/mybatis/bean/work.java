package com.mybatis.bean;

import java.util.List;

public class work {
    private int work_id;
    private String job;
    private List<UserLogin> list;
    public int getWork_id() {
        return work_id;
    }
    public void setWork_id(int work_id) {
        this.work_id = work_id;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public List<UserLogin> getList() {
        return list;
    }
    public void setList(List<UserLogin> list) {
        this.list = list;
    }
    @Override
    public String toString() {
        return "work [job=" + job + ", list=" + list + ", work_id=" + work_id + "]";
    }
}
