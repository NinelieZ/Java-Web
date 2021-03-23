package com.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.mybatis.bean.UserLogin;

public interface UserLoginDao {
    UserLogin selectById(int id);
    UserLogin selectByName(String name);
    UserLogin selectByIdandName(UserLogin user);
    List<UserLogin> getAll();
    List<UserLogin> selectByPage(Map<String, Integer> map);
}
