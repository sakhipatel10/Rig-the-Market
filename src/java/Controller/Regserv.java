package Controller;

        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Login;
import model.Registeration;
import model.VirtualMoney;
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
public class Regserv extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            Session ss = sf.openSession();
            Transaction tr = ss.beginTransaction();
            Login l =new Login();
            String ud = request.getParameter("un");
            Criteria c= ss.createCriteria(Login.class);
            c.add(Restrictions.eq("userId", ud));
            ArrayList<Login> al=(ArrayList<Login>)c.list();
            
            if(al.size()>0)
            {
                String msg="you are already registered";
                out.println(msg);
            }
            else{
                l.setUserId(ud);
            
            }
            l.setPassword(request.getParameter("pwd1"));
            ss.save(l);
            VirtualMoney va = new VirtualMoney();
            va.setMoney(1000000);
            ss.save(va);
            Registeration r = new Registeration();
            r.setName(request.getParameter("name"));
            r.setMobileNo(request.getParameter("mn"));
            r.setGender(request.getParameter("gender"));
            r.setBirthday(request.getParameter("bd"));
            r.setCity(request.getParameter("city"));
            r.setOccupation(request.getParameter("Occupation"));
            String industry="";
            String arr[] = request.getParameterValues("Industry");
            
            for(int i=0;i<arr.length;i++)
            {
                 industry=industry+","+arr[i];
                
            }
            
            
            
            r.setIndustry(industry);
            r.setIncome(Integer.parseInt(request.getParameter("ai")));
            r.setLid(l);
            r.setVid(va);
            ss.save(r);
            tr.commit();
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Welcome to Rig the Market.Your virtual money is added in to your account.');");
            out.println("location='homepage.jsp';");
            out.println("</script>");
            
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
