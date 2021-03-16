package com.neusoft.util;

import com.neusoft.dao.User_Dao;
import com.neusoft.dao.User_Dao_Impl;

public class Test {
    public static void main(String[] args) {
        User_Dao user = new User_Dao_Impl();
        int id= user.loginUser("Davide","D6789");
        System.out.println(id);
    }
}