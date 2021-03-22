package com.neusoft.dao;

public interface User_Dao {
    int loginUser(String username, String password);

    int checkTel(String telphone);
}
