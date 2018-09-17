package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Login;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rohan
 */
public class MailServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           String mail=request.getParameter("mail");
            SessionFactory sf=NewHibernateUtil.getSessionFactory();
            Session s=sf.openSession();
            Transaction tr=s.beginTransaction();
            
            Criteria c=s.createCriteria(Login.class);
            c.add(Restrictions.eq("userId", mail));
            
            ArrayList<Login> al=(ArrayList<Login>)c.list();
            tr.commit();
            String name=null;
            if(al.size()>0)
            {
                        Login l=al.get(0);
                        name=l.getPassword();
                        System.out.println(name);
                        String subject= "Forgot Password";
                        String content= "Your password is" +name;

                        String[] recipients = new String[]{mail};  
                        //String[] bccRecipients = new String[]{"sunilkotadiya777@gmail.com"};  

                        if(new MailUtil().sendMail(recipients, subject, content))
                        {
                        String msg = "Password is sent to your registered email id!";
                        request.setAttribute("msg1",msg);
                        RequestDispatcher rd = request.getRequestDispatcher("reset.jsp");
                        rd.forward(request, response);
                        }
            }
            else
            {
                String msg="plz enter the correct email";
                out.println(msg);
            }

        }
        catch(HibernateException he)
        {
            System.out.println(he.getMessage());
        }
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
