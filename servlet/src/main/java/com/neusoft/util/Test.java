package com.neusoft.util;

import java.util.ArrayList;

import com.neusoft.bean.Person;
import com.neusoft.dao.Person_Dao;
import com.neusoft.dao.Person_Dao_Impl;

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

public class Test {
    public static void main(String[] args) {
        Person_Dao pd = new Person_Dao_Impl();
        ArrayList<Person> p = pd.selectAll();
        for (Person person : p) {
            System.out.println(person);
        }
        
    }

}