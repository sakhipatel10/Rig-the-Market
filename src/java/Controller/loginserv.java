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
import javax.servlet.http.HttpSession;
import model.Login;
import model.Registeration;
import model.VSMShareDetail;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rohan
 */
public class loginserv extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            Session ss=sf.openSession();
            Transaction t = ss.beginTransaction();
            Criteria cr=ss.createCriteria(Login.class);
            cr.add(Restrictions.eq("userId",request.getParameter("login")));
            cr.add(Restrictions.eq("password",request.getParameter("password")));
            ArrayList<Login> all = (ArrayList<Login>)cr.list();
            t.commit();
            
           if(all.size()==0)
            {
                //RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
                //rd.forward(request, response);
                //out.println("Failed");
                
               
                    request.setAttribute("errorMessage", "Invalid Userid or password");
                    RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                    rd.forward(request, response);
                
            }
            else
            {
                Login l = all.get(0);
                HttpSession hs = request.getSession();
                Registeration r = new Registeration();
                Criteria cr1=ss.createCriteria(Registeration.class);
                cr1.add(Restrictions.eq("lid",l));
                ArrayList<Registeration> all1 = (ArrayList<Registeration>)cr1.list();
                r = all1.get(0);
                hs.setAttribute("Lid", l);
                request.setAttribute("username", r);
                Criteria cr5 = ss.createCriteria(VSMShareDetail.class);
            cr5.addOrder(Order.desc("price"));
            cr5.setMaxResults(7);
            ArrayList<VSMShareDetail> tcal1 = (ArrayList<VSMShareDetail>)cr5.list();
            request.setAttribute("shares",tcal1);
                RequestDispatcher rd = request.getRequestDispatcher("homepage.jsp");
                rd.forward(request, response);
                    
                  
            }
        }
        
        catch(Exception e){
            out.println(e.getMessage());
            
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
