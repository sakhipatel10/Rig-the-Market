/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Login;
import model.SetPointer;
import model.VSMShareDetail;
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
public class SetPointerServ extends HttpServlet {

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
            Session ss = sf.openSession();
            Transaction t = ss.beginTransaction();
            SetPointer s = new SetPointer();
             Criteria cr = ss.createCriteria(VSMShareDetail.class);
            cr.add(Restrictions.eq("symbol", request.getParameter("symbol")));
            ArrayList<VSMShareDetail> al = (ArrayList<VSMShareDetail>) cr.list();
            VSMShareDetail vsm = al.get(0);
            HttpSession hs = request.getSession();
            Login l = (Login) hs.getAttribute("Lid");
            s.setLid(l.getLid());
            s.setId(vsm);
            s.setMaxp(Double.parseDouble(request.getParameter("Maximum")));
            s.setMinp(Double.parseDouble(request.getParameter("Minimum")));
            Date dt = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String dtt = dateFormat.format(date);
            s.setSpDT(dtt);
            ss.save(s);
            t.commit();
            RequestDispatcher rd = request.getRequestDispatcher("Notification.jsp");
            rd.forward(request, response);
        
            
        }
        catch(HibernateException e ){
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
