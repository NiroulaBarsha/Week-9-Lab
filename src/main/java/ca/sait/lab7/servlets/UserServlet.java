/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.lab7.servlets;

import ca.sait.lab7.models.User;
//import ca.sait.lab7.services.UserService;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.List;
//import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.persistence.*;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author dbrai
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

    //private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{

                EntityManagerFactory emf =
                       (EntityManagerFactory)getServletContext().getAttribute("emf");
                EntityManager em = emf.createEntityManager();
                //UserService service = new UserService();
               try{
                       List<User> users;
                    users = em.createQuery("SELECT user FROM users user", User.class).getResultList();
                       
                       request.setAttribute("users",users);
                       

                        this.getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request,response);
               }finally {
                    // Close the database connection:
                    if (em.getTransaction().isActive())
                        em.getTransaction().rollback();
                        em.close();
               }	
}
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{

	
}

}
