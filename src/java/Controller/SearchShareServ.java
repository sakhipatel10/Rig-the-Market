package Controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.VSMShareDetail;
import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class SearchShareServ extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            String s= request.getParameter("search");
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            Session ss = sf.openSession();
            Transaction tr = ss.beginTransaction();
            Criteria cr = ss.createCriteria(VSMShareDetail.class);
            cr.add(Restrictions.eq("name",request.getParameter("search")));
            ArrayList<VSMShareDetail> al = (ArrayList<VSMShareDetail>)cr.list();
            if(al.size()!=0)
            {
                VSMShareDetail vsm = al.get(0);
                request.setAttribute("share",vsm);
                RequestDispatcher rd= request.getRequestDispatcher("search.jsp");
                rd.forward(request, response);
            }
            else
            {
                out.println("Sorry! Try different keyword");
            }
            
            tr.commit();
        
        
        
        
        
        }
        catch(Exception e)
        { 
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
