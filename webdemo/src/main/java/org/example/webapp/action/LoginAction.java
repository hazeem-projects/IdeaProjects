package org.example.webapp.action;
import org.example.webapp.model.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

@WebServlet(name = "LoginAction",urlPatterns = "/login-action")

public class LoginAction extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("e");
        String password = request.getParameter("p");



        boolean login = false;
        ServletContext context=getServletContext();
        if(context.getAttribute("users") !=null){

            LinkedList<User> users= (LinkedList<User>) context.getAttribute("users");
            for (User user : users ){
                if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                    login=true;
                    break;

                }

            }


        }



        if(login){

            response.sendRedirect("profile.jsp");
        }else {

            response.sendRedirect("login.jsp");
        }
    }
}
