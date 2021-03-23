package com.mybatis.test;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            user.setU_username("Davide");
            System.out.println(dao.selectById(user.getId()));
            System.out.println(dao.selectByName(user.getU_username()));
            System.out.println(dao.selectByIdandName(user));

            List<UserLogin> list = dao.getAll();
            for (UserLogin userLogin : list) {
                System.out.println(userLogin);
            }
            Map<String, Integer> map = new HashMap<>();
            map.put("k_index",0);
            map.put("k_size",2);
            List<UserLogin> list2 = dao.selectByPage(map);
            for (UserLogin userLogin : list2) {
                System.out.println(userLogin);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
