package com.neusoft.service;

import com.neusoft.dao.User_Dao;
import com.neusoft.dao.User_Dao_Impl;

public class User_Service_Impl implements User_Service{
    User_Dao dao = new User_Dao_Impl();
    @Override
    public int login(String username, String password) {
        return dao.loginUser(username, password);
    }
    
}
