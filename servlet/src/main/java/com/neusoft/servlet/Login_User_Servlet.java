package com.neusoft.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neusoft.bean.Person;
import com.neusoft.service.Person_Service_Impl;
import com.neusoft.service.Person_service;
import com.neusoft.service.User_Service;
import com.neusoft.service.User_Service_Impl;
@WebServlet("/Login_User_Servlet")
public class Login_User_Servlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User_Service service = new User_Service_Impl();
        int id = service.login(username, password);
        if (id > 0) {
            ArrayList<Person> list = new ArrayList<>();
            Person_service ps = new Person_Service_Impl();
            list = ps.getAll();
            HttpSession session = req.getSession();
            session.setAttribute("Person", list);
            resp.sendRedirect(req.getContextPath()+"/index.jsp");
        } else {
            resp.sendRedirect(req.getContextPath()+"/login.jsp");
        }
    }
    
}
