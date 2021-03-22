package com.neusoft.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
    /*
     * 单利模式：一个类 只让其产生一个对象 1. 私有化构造函数 2.提供公有的方法来去创建DBUtil对象
     */
    private String driver;
    private String url;
    private String username;
    private String password;
    public static DBUtil util;

    private DBUtil() {
        Properties p = new Properties();
        try {
            p.load(this.getClass().getClassLoader().getResourceAsStream("mysql.properties"));
            driver = p.getProperty("driver");
            url = p.getProperty("url");
            username=p.getProperty("username");
            password = p.getProperty("password");
        } catch (Exception e) {

        }

    }

    public static DBUtil getInstance() {

        if (util == null) {
            util = new DBUtil();
        }
        return util;

    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("连接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void DBclose(Connection conn, PreparedStatement pstm, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstm != null) {
            try {
                pstm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DBUtil db = new DBUtil();
        db.getConnection();
    }
}
