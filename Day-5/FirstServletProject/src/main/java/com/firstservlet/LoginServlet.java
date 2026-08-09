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
                @WebInitParam(name = "password", value = "Divya@1234")
        }
)
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");


        // UC3 - NAME VALIDATION

        if (user == null || !user.matches("^[A-Z][a-zA-Z]{2,}$")) {

            response.setContentType("text/html");

            PrintWriter out = response.getWriter();

            out.println("<h2 style='color:red;'>Invalid User Name!</h2>");
            out.println("<p>Name must:</p>");
            out.println("<ul>");
            out.println("<li>Start with a capital letter</li>");
            out.println("<li>Have minimum 3 characters</li>");
            out.println("</ul>");

            out.println("<a href='login.html'>Go Back</a>");

            out.close();
            return;
        }


        // UC4 - PASSWORD VALIDATION

        if (!isValidPassword(pwd)) {

            response.setContentType("text/html");

            PrintWriter out = response.getWriter();

            out.println("<h2 style='color:red;'>Invalid Password!</h2>");
            out.println("<p>Password must:</p>");
            out.println("<ul>");
            out.println("<li>Have minimum 8 characters</li>");
            out.println("<li>Have at least 1 uppercase letter</li>");
            out.println("<li>Have at least 1 numeric digit</li>");
            out.println("<li>Have exactly 1 special character</li>");
            out.println("</ul>");

            out.println("<a href='login.html'>Go Back</a>");

            out.close();
            return;
        }


        // UC2 - LOGIN VALIDATION

        String userID = getServletConfig().getInitParameter("user");
        String password = getServletConfig().getInitParameter("password");

        if (userID.equals(user) && password.equals(pwd)) {

            request.setAttribute("user", user);

            RequestDispatcher rd = request.getRequestDispatcher("LoginSuccess.jsp");

            rd.forward(request, response);
        }
        else {
            response.setContentType("text/html");

            PrintWriter out = response.getWriter();

            out.println("<font color=red>User name or password is wrong.</font>");

            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");

            rd.include(request, response);

            out.close();
        }
    }


    // UC4 - PASSWORD VALIDATION METHOD

    private boolean isValidPassword(String password) {

        if (password == null || password.length() < 8) {
            return false;
        }

        int uppercaseCount = 0;
        int numberCount = 0;
        int specialCount = 0;

        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            }
            else if (Character.isDigit(ch)) {
                numberCount++;
            }
            else if (!Character.isLetterOrDigit(ch)) {
                specialCount++;
            }
        }

        return uppercaseCount >= 1
                && numberCount >= 1
                && specialCount == 1;
    }
}