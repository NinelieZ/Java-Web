package com.neusoft.servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet("/Upload_Servlet")
@MultipartConfig
public class Upload_Servlet extends HttpServlet{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        super.doGet(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Part part = req.getPart("upload");
        System.out.println(part.getSize());
        System.out.println(part.getName());
        String header = part.getHeader("Content-Disposition");
        System.out.println(header);
        int idx = header.lastIndexOf("filename=\"");
        String filename = header.substring(idx + "filename=\"".length(), header.length() - 1);
        InputStream is = part.getInputStream();
        OutputStream os = new FileOutputStream(this.getServletContext().getRealPath("/upload") + "/" + filename);
        String Res = "upload/" + filename;
        byte[] bt = new byte[1024];
        int len = 0;
        while ((len = is.read(bt)) != -1) {
            os.write(bt, 0, len);
            System.out.println("在写了");
        }
        is.close();
        os.close();
        HttpSession session = req.getSession();
        session.setAttribute("Res", Res);
        System.out.println("写完了");
        resp.sendRedirect("video.jsp");

    }
}
