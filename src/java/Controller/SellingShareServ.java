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
import model.Buyshares;
import model.Login;
import model.MyHistory;
import model.Myshares;
import model.Registeration;
import model.Sellshares;
import model.VSMShareDetail;
import model.VirtualMoney;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rohan
 */
public class SellingShareServ extends HttpServlet {

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
            
            Sellshares ssh = new Sellshares();
            HttpSession hs = request.getSession();
            Login l = (Login) hs.getAttribute("Lid");
            ssh.setLid(l.getLid());
            ssh.setShareid(vsm.getId());
            ssh.setSymbol(request.getParameter("symbol"));
            ssh.setSprice(vsm.getPrice());
            Date dt = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String dtt = dateFormat.format(date);
            ssh.setSDateTime(dtt);
            
            Buyshares bs = null;
            
            int squantity = Integer.parseInt(request.getParameter("sellquantity"));
            ssh.setSquantity(squantity);
            double q = Integer.parseInt(request.getParameter("sellquantity"));
            double sp = vsm.getPrice();
            double stp=q*sp;
            ssh.setStotalPrice(stp);
            Criteria crr = ss.createCriteria(Registeration.class);
            crr.add(Restrictions.eq("lid", l));
            ArrayList<Registeration> all = (ArrayList<Registeration>) crr.list();
            Registeration r = all.get(0);

            double vma = r.getVid().getMoney() + stp;
            ssh.setVma(vma);
            
             MyHistory mh = new MyHistory();
             mh.setType("Sell");
             mh.setLid(l.getLid());
             mh.setShareid(vsm.getId());
             mh.setSymbol(request.getParameter("symbol"));
             mh.setSprice(vsm.getPrice());
             mh.setSDateTime(dtt);
             mh.setSquantity(squantity);
             mh.setStotalPrice(stp);
             mh.setVma(vma);
            
             
            
            
            
            Criteria cr1 = ss.createCriteria(Buyshares.class);
            cr1.add(Restrictions.eq("lid", l.getLid()));
            cr1.add(Restrictions.eq("shareid", vsm.getId()));
            ArrayList<Buyshares> als = (ArrayList<Buyshares>) cr1.list();
            
            
            
            
            if(als.size()>0){
             double left10=0;
            double left01 = 0;
            double left2 = 0;
            double left3 = 0;
            double left;
                for(int i =0;i<als.size();i++){
                    bs=als.get(i);
                    if(squantity>bs.getBquantity())
                    {
                    int a;    
                    left01 = ((vsm.getPrice()*bs.getBquantity())- (bs.getBtotalPrice()));
                    left10 = left01+ left10;
                    a = squantity-(bs.getBquantity());
                    String hql = "DELETE FROM Buyshares WHERE id = :buy_id";
                    Query query = ss.createQuery(hql);
                    query.setParameter("buy_id", bs.getBuyId());
                    query.executeUpdate();
                    int j=i+1;
                    bs = new Buyshares();
                    bs = als.get(j);
                    squantity =a;   
                    if(squantity>(bs.getBquantity())){
                        bs = new Buyshares();
                      bs=als.get(i);
                      }
                      }
                    if(squantity <(bs.getBquantity()))
                    {
                      
                     double bmoney = squantity*bs.getBprice();
                     left2 = (squantity*(vsm.getPrice()))-bmoney;
                     left=left10+left2;
                     ssh.setSellprofitloss(left);
                     mh.setSellprofitloss(left);
                     int sharesleft = bs.getBquantity()- squantity;
                     double btotalprice = sharesleft * bs.getBprice();
                    String hql1 = "UPDATE Buyshares set bquantity = :bquantity  WHERE id =:buy_id";
                    Query query1 = ss.createQuery(hql1);
                    query1.setParameter("bquantity", sharesleft);
                    query1.setParameter("buy_id", bs.getBuyId());
                    query1.executeUpdate();
                    
                    String hql4 = "UPDATE Buyshares set btotal_price = :btotal_price  WHERE id =:buy_id";
                    Query query4 = ss.createQuery(hql4);
                    query4.setParameter("btotal_price", btotalprice);
                    query4.setParameter("buy_id", bs.getBuyId());
                    query4.executeUpdate();
                    break;
                   
                    }
                    if(squantity == bs.getBquantity()){
                    left3 = ((vsm.getPrice())*squantity)-((bs.getBtotalPrice()));
                    left = left10+left3;
                    ssh.setSellprofitloss(left);
                    mh.setSellprofitloss(left);
                    String hql2 = "DELETE FROM Buyshares WHERE id = :buy_id";
                    Query query2 = ss.createQuery(hql2);
                    query2.setParameter("buy_id", bs.getBuyId());
                    query2.executeUpdate();
                    break;
                    }
                                       
                    
                }
                
               ss.save(ssh);
               ss.save(mh);
            }
            
                  
                  
                  Criteria cr2 = ss.createCriteria(VirtualMoney.class);
            cr2.add(Restrictions.eq("vid", r.getVid().getVid()));

            ArrayList<VirtualMoney> vmal1 = (ArrayList<VirtualMoney>) cr2.list();

            VirtualMoney vm = vmal1.get(0);

            vm.setVid(vm.getVid());
            vm.setMoney(vma);
            ss.update(vm);
            Myshares m = new Myshares();
            Criteria cr3 = ss.createCriteria(Myshares.class);
            cr3.add(Restrictions.eq("lid",l.getLid()));
            cr3.add(Restrictions.eq("shareid",vsm.getId()));
            ArrayList<Myshares> msal = (ArrayList<Myshares>)cr3.list();
            if(msal.size()>0){
                int SellQuantity = Integer.parseInt(request.getParameter("sellquantity"));
               
                m = msal.get(0);
                if(SellQuantity < m.getQuantity() ){
                    
                
                int sum = m.getQuantity() - Integer.parseInt(request.getParameter("sellquantity"));
                        m.setQuantity(sum);
                        ss.update(m);
                }
                else{
                    String mshql = "DELETE FROM Myshares WHERE id = :sh_id";
                    Query query = ss.createQuery(mshql);
                    query.setParameter("sh_id", m.getShId());
                    query.executeUpdate();
                    
                }
            }
            else{
                m.setLid(l.getLid());
                m.setShareid(vsm.getId());
                m.setSymbol(request.getParameter("symbol"));
                m.setName(vsm.getName());
                m.setQuantity(Integer.parseInt(request.getParameter("sellquantity")));
                ss.save(m);
                
            }
            
            
            
            t.commit();
            RequestDispatcher rd = request.getRequestDispatcher("Investment.jsp");
            rd.forward(request, response);
           
        }
        catch(HibernateException e){
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
