package com.mybatis.dao;

import com.mybatis.bean.UserLogin;

public interface UserLoginDao {
    UserLogin selectById(int id);
    UserLogin selectByName(String name);
    UserLogin selectByIdandName(UserLogin user);
}
