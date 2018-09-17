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
@Table(name = "Myshares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Myshares.findAll", query = "SELECT m FROM Myshares m"),
    @NamedQuery(name = "Myshares.findByShId", query = "SELECT m FROM Myshares m WHERE m.shId = :shId"),
    @NamedQuery(name = "Myshares.findByLid", query = "SELECT m FROM Myshares m WHERE m.lid = :lid"),
    @NamedQuery(name = "Myshares.findByShareid", query = "SELECT m FROM Myshares m WHERE m.shareid = :shareid"),
    @NamedQuery(name = "Myshares.findBySymbol", query = "SELECT m FROM Myshares m WHERE m.symbol = :symbol"),
    @NamedQuery(name = "Myshares.findByName", query = "SELECT m FROM Myshares m WHERE m.name = :name"),
    @NamedQuery(name = "Myshares.findByQuantity", query = "SELECT m FROM Myshares m WHERE m.quantity = :quantity")})
public class Myshares implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "sh_id")
    private Integer shId;
    @Basic(optional = false)
    @Column(name = "Lid")
    private int lid;
    @Basic(optional = false)
    @Column(name = "shareid")
    private int shareid;
    @Basic(optional = false)
    @Column(name = "symbol")
    private String symbol;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "quantity")
    private int quantity;

    public Myshares() {
    }

    public Myshares(Integer shId) {
        this.shId = shId;
    }

    public Myshares(Integer shId, int lid, int shareid, String symbol, String name, int quantity) {
        this.shId = shId;
        this.lid = lid;
        this.shareid = shareid;
        this.symbol = symbol;
        this.name = name;
        this.quantity = quantity;
    }

    public Integer getShId() {
        return shId;
    }

    public void setShId(Integer shId) {
        this.shId = shId;
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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shId != null ? shId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Myshares)) {
            return false;
        }
        Myshares other = (Myshares) object;
        if ((this.shId == null && other.shId != null) || (this.shId != null && !this.shId.equals(other.shId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Myshares[ shId=" + shId + " ]";
    }
    
}
