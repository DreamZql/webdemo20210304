package com.shop.servlet;

import com.shop.bean.User;
import com.shop.dao.impl.UserDaoImpl;
import com.shop.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @作者:zql
 * @日期:2021/3/10 0:09
 * @版本 1.0
 */
@WebServlet(name = "ResistServlet",urlPatterns = "/register.do")
public class ResistServlet  extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(302);
        resp.setContentType("text/html;charset:utf-8");

        String username=req.getParameter("username");
        String password=req.getParameter("password");
        String email=req.getParameter("email");


       UserDao userDao=new UserDaoImpl();

        userDao.addUser(username,password,email);

        resp.setHeader("location","/shop/pages/user/regist_success.html");

    }
}
