package com.neusoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.service.User_Service;
import com.neusoft.service.User_Service_Impl;

@WebServlet("/Ajax_Test_Servlet")
public class Ajax_Test_Servlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // PrintWriter pw = resp.getWriter();
        // System.out.println("收到Ajax");
        // String telphone = req.getParameter("telphone");
        // System.out.println(telphone);
        // if (telphone.equals("110")) {
        //     pw.print("正确");
        // } else {
        //     pw.print("sorry");
        // }
        // pw.flush();
        // pw.close();
        System.out.println("Welcome to Ajax");
        PrintWriter pw = resp.getWriter();
        String telphone = req.getParameter("telphone");
        User_Service service = new User_Service_Impl();
        int id = service.checkPhone(telphone);
        if (id==0) {
            pw.print(0);
        } else {
            pw.print(1);
        }
        // pw.println("Thank You");
        pw.flush();
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
