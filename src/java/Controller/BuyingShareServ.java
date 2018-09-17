package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import model.Buyshares;
import model.Login;
import model.MyHistory;
import model.Myshares;
import model.Registeration;
import model.VSMShareDetail;
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
public class BuyingShareServ extends HttpServlet {

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
            Criteria cr = ss.createCriteria(VSMShareDetail.class);
            cr.add(Restrictions.eq("symbol", request.getParameter("symbol")));
            ArrayList<VSMShareDetail> al = (ArrayList<VSMShareDetail>) cr.list();
            VSMShareDetail vsm = al.get(0);

            Buyshares b = new Buyshares();
            HttpSession hs = request.getSession();
            Login l = (Login) hs.getAttribute("Lid");
            
            b.setLid(l.getLid());
            b.setShareid(vsm.getId());
            b.setSymbol(request.getParameter("symbol"));
            b.setBprice(Double.parseDouble((request.getParameter("bprice"))));
            Date dt = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String dtt = dateFormat.format(date);
            b.setBDateTime(dtt);
            b.setBquantity(Integer.parseInt(request.getParameter("buyquantity")));
            double q = Integer.parseInt(request.getParameter("buyquantity"));
            double bp = Double.parseDouble(request.getParameter("bprice"));
            double totalprice = q * bp;
            b.setBtotalPrice(totalprice);
            Criteria crr = ss.createCriteria(Registeration.class);
            crr.add(Restrictions.eq("lid", l));
            ArrayList<Registeration> all = (ArrayList<Registeration>) crr.list();
            Registeration r = all.get(0);

            double vml = r.getVid().getMoney() - totalprice;
            
            ss.save(b);

            Criteria cr1 = ss.createCriteria(VirtualMoney.class);
            cr1.add(Restrictions.eq("vid", r.getVid().getVid()));

            ArrayList<VirtualMoney> al1 = (ArrayList<VirtualMoney>) cr1.list();

            VirtualMoney vm = al1.get(0);

            vm.setVid(vm.getVid());
            vm.setMoney(vml);
            ss.update(vm);
            Criteria cr2 = ss.createCriteria(Myshares.class);
            cr2.add(Restrictions.eq("lid", l.getLid()));
            ArrayList<Myshares> ms = (ArrayList<Myshares>) cr2.list();
            boolean flag = true;
            Myshares m = null;
            if (ms.size() > 0) {
                for (int i = 0; i < ms.size(); i++) {
                    m = ms.get(i);
                    if(vsm.getId().equals(m.getShareid()) && l.getLid().equals(m.getLid())) {
                        int sum = Integer.parseInt(request.getParameter("buyquantity")) + m.getQuantity();
                        m.setQuantity(sum);
                        ss.update(m);
                        flag = false;
                       
                    }
                }
            }
            
            
            if (flag) {
                m = new Myshares();
                System.out.println("===========");
                m.setLid(l.getLid());
                m.setShareid(vsm.getId());
                m.setSymbol(request.getParameter("symbol"));
                m.setName(vsm.getName());
                m.setQuantity(Integer.parseInt(request.getParameter("buyquantity")));
                ss.save(m);
                System.out.println("------saved");
            }
            
             MyHistory mh = new MyHistory();
             mh.setType("Buy");
             mh.setLid(l.getLid());
            mh.setShareid(vsm.getId());
            mh.setSymbol(request.getParameter("symbol"));
            mh.setBprice(Double.parseDouble((request.getParameter("bprice"))));
            mh.setBDateTime(dtt);
            mh.setBquantity(Integer.parseInt(request.getParameter("buyquantity")));
            mh.setBtotalPrice(totalprice);
            mh.setVml(vml);
            ss.save(mh);
            
            
            
            
            
            
            
            
            
            

            t.commit();
            RequestDispatcher rd = request.getRequestDispatcher("Investment.jsp");
            rd.forward(request, response);

        } catch (HibernateException e) {
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
