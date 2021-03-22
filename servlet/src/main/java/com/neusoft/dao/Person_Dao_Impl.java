package com.neusoft.dao;

import com.neusoft.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.neusoft.bean.Person;

public class Person_Dao_Impl implements Person_Dao {

    DBUtil db = DBUtil.getInstance();

    @Override
    public ArrayList<Person> selectAll() {
        Connection conn = null;
        conn = db.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Person> list = new ArrayList<>();
        String sql = "select * from person";
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Person p = new Person();
                p.setId(rs.getInt("id"));
                p.setNickName(rs.getString("nickName"));
                p.setRealName(rs.getString("realName"));
                p.setBirthday(rs.getDate("birthday"));
                p.setShowTime(rs.getString("showTime"));
                list.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            db.DBclose(conn, pstm, rs);
        }
        return list;
    }

}
