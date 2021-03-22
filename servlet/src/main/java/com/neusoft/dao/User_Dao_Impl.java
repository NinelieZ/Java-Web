package com.neusoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.neusoft.util.DBUtil;

public class User_Dao_Impl implements User_Dao {

    DBUtil db = DBUtil.getInstance();

    @Override
    public int loginUser(String username, String password) {
        Connection conn = null;
        conn=db.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int id = 0;
        String sql = "select id from user where username = ? and password = ?";
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, username);
            pstm.setString(2, password);
            rs = pstm.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.DBclose(conn, pstm, rs);
        }
        return id;
    }

    @Override
    public int checkTel(String telphone) {
        Connection conn = null;
        conn = db.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int id = 0;
        String sql = "select id from user where telphone = ?";
        try {
            pstm=conn.prepareStatement(sql);
            pstm.setString(1,telphone);
            rs=pstm.executeQuery();
            if(rs.next()) {
                id=rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.DBclose(conn, pstm, rs);
        }
        return id;
    }

}
