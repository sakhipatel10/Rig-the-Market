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
@Table(name = "VirtualMoney")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VirtualMoney.findAll", query = "SELECT v FROM VirtualMoney v"),
    @NamedQuery(name = "VirtualMoney.findByVid", query = "SELECT v FROM VirtualMoney v WHERE v.vid = :vid"),
    @NamedQuery(name = "VirtualMoney.findByMoney", query = "SELECT v FROM VirtualMoney v WHERE v.money = :money")})
public class VirtualMoney implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "Vid")
    private Integer vid;
    @Basic(optional = false)
    @Column(name = "Money")
    private double money;

    public VirtualMoney() {
    }

    public VirtualMoney(Integer vid) {
        this.vid = vid;
    }

    public VirtualMoney(Integer vid, double money) {
        this.vid = vid;
        this.money = money;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vid != null ? vid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VirtualMoney)) {
            return false;
        }
        VirtualMoney other = (VirtualMoney) object;
        if ((this.vid == null && other.vid != null) || (this.vid != null && !this.vid.equals(other.vid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.VirtualMoney[ vid=" + vid + " ]";
    }
    
}
