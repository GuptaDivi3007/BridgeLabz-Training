package com.firstservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        urlPatterns = "/LoginServlet",
        initParams = {
                @WebInitParam(name = "user", value = "Divyanshi"),
                @WebInitParam(name = "password", value = "Divya1234")
        }
)
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        String userID = getServletConfig().getInitParameter("user");
        String password = getServletConfig().getInitParameter("password");

        if (userID.equals(user) && password.equals(pwd)) {

            request.setAttribute("user", user);

            RequestDispatcher rd =
                    request.getRequestDispatcher("LoginSuccess.jsp");

            rd.forward(request, response);

        } else {

            PrintWriter out = response.getWriter();

            out.println(
                    "<font color=red>User name or password is wrong.</font>"
            );

            RequestDispatcher rd =
                    getServletContext().getRequestDispatcher("/login.html");

            rd.include(request, response);
        }
    }
}