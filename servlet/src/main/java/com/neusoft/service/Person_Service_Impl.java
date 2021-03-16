package com.neusoft.service;

import java.util.ArrayList;

import com.neusoft.bean.Person;
import com.neusoft.dao.Person_Dao;
import com.neusoft.dao.Person_Dao_Impl;

public class Person_Service_Impl implements Person_service{
    Person_Dao pd = new Person_Dao_Impl();
    @Override
    public ArrayList<Person> getAll() {
        return pd.selectAll();
    }
}
