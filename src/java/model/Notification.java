/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rohan
 */
@Entity
@Table(name = "Notification")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notification.findAll", query = "SELECT n FROM Notification n"),
    @NamedQuery(name = "Notification.findByNotificationid", query = "SELECT n FROM Notification n WHERE n.notificationid = :notificationid"),
    @NamedQuery(name = "Notification.findByLid", query = "SELECT n FROM Notification n WHERE n.lid = :lid"),
    @NamedQuery(name = "Notification.findByShareid", query = "SELECT n FROM Notification n WHERE n.shareid = :shareid"),
    @NamedQuery(name = "Notification.findByPrice", query = "SELECT n FROM Notification n WHERE n.price = :price"),
    @NamedQuery(name = "Notification.findByHighset", query = "SELECT n FROM Notification n WHERE n.highset = :highset"),
    @NamedQuery(name = "Notification.findByLowset", query = "SELECT n FROM Notification n WHERE n.lowset = :lowset")})
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "Notificationid")
    private Integer notificationid;
    @Basic(optional = false)
    @Column(name = "Lid")
    private int lid;
    @Basic(optional = false)
    @Column(name = "shareid")
    private int shareid;
    @Basic(optional = false)
    @Column(name = "price")
    private double price;
    @Basic(optional = false)
    @Column(name = "highset")
    private double highset;
    @Basic(optional = false)
    @Column(name = "lowset")
    private double lowset;

    public Notification() {
    }

    public Notification(Integer notificationid) {
        this.notificationid = notificationid;
    }

    public Notification(Integer notificationid, int lid, int shareid, double price, double highset, double lowset) {
        this.notificationid = notificationid;
        this.lid = lid;
        this.shareid = shareid;
        this.price = price;
        this.highset = highset;
        this.lowset = lowset;
    }

    public Integer getNotificationid() {
        return notificationid;
    }

    public void setNotificationid(Integer notificationid) {
        this.notificationid = notificationid;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getShareid() {
        return shareid;
    }

    public void setShareid(int shareid) {
        this.shareid = shareid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getHighset() {
        return highset;
    }

    public void setHighset(double highset) {
        this.highset = highset;
    }

    public double getLowset() {
        return lowset;
    }

    public void setLowset(double lowset) {
        this.lowset = lowset;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notificationid != null ? notificationid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notification)) {
            return false;
        }
        Notification other = (Notification) object;
        if ((this.notificationid == null && other.notificationid != null) || (this.notificationid != null && !this.notificationid.equals(other.notificationid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Notification[ notificationid=" + notificationid + " ]";
    }
    
}
