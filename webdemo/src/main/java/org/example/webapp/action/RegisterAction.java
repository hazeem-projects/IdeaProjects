package org.example.webapp.action;

import org.example.webapp.model.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

@WebServlet(name = "RegisterAction",urlPatterns = "/register-action")
public class RegisterAction extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("n");
        String email=req.getParameter("e");
        String password=req.getParameter("p");

        ServletContext context=getServletContext();
        LinkedList<User> users;

        if(context.getAttribute("users")==null){
            users=new LinkedList<>();
            context.setAttribute("users",users);


        }else {

            users= (LinkedList<User>) context.getAttribute("users");
        }

        if(name !=null && email !=null&& password !=null){


            User user=new User();
            user.setName(name);
            user.setEmail(email);
            user.setPassword(password);
            users.add(user);

            resp.sendRedirect("index.jsp");

        }else {

            resp.sendRedirect("register.jsp");
        }


    }
}
