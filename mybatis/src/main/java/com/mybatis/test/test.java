package com.mybatis.test;

import java.io.IOException;
import java.io.Reader;

import com.mybatis.bean.UserLogin;
import com.mybatis.dao.UserLoginDao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class test {
    public static void main(String[] args) {
        try {
            Reader read = Resources.getResourceAsReader("sqlMapConfig.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(read);
            SqlSession sessiong = factory.openSession();
            UserLoginDao dao = sessiong.getMapper(UserLoginDao.class);
            UserLogin user = new UserLogin();
            user.setId(1);
            user.setUsername("Davide");
            System.out.println(dao.selectById(user.getId()));
            System.out.println(dao.selectByName(user.getUsername()));
            System.out.println(dao.selectByIdandName(user));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
