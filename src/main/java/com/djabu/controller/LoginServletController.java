package com.djabu.controller;

import com.djabu.dao.UserDAO;
import com.djabu.model.UserModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login")
public class LoginServletController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");


        UserModel user = new UserDAO().login(email,password);
        if (user != null) {
            request.getRequestDispatcher("/WEB-INF/view/inventario.jsp").forward(request, response);
        }else {
            request.setAttribute("loginMessage", "invalid credentials");
            request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request, response);
        }

    }

}
