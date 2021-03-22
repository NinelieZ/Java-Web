package com.neusoft.util;

import java.util.ArrayList;

import com.neusoft.bean.Person;
import com.neusoft.service.Person_Service_Impl;
import com.neusoft.service.Person_service;

public class Test {
    public static void main(String[] args) {
        // Person_service service = new Person_Service_Impl();
        // ArrayList<Person> p = service.getAll();
        // for (Person person : p) {
        //     System.out.println(person);
        // }
                DBUtil db = DBUtil.getInstance();
    }
}

/* loginUser——Test

import com.neusoft.dao.User_Dao;
import com.neusoft.dao.User_Dao_Impl;

public class Test {
    public static void main(String[] args) {
        User_Dao user = new User_Dao_Impl();
        int id= user.loginUser("Davide","D6789");
        System.out.println(id);
    }
} */

/* 
import java.util.ArrayList;
import com.neusoft.bean.Person;
import com.neusoft.dao.Person_Dao;
import com.neusoft.dao.Person_Dao_Impl;
selectAll——Test
public class Test {
    public static void main(String[] args) {
        Person_Dao pd = new Person_Dao_Impl();
        ArrayList<Person> p = pd.selectAll();
        for (Person person : p) {
            System.out.println(person);
        }
        
    }

} */
