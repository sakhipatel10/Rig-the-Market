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
@Table(name = "Buyshares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Buyshares.findAll", query = "SELECT b FROM Buyshares b"),
    @NamedQuery(name = "Buyshares.findByBuyId", query = "SELECT b FROM Buyshares b WHERE b.buyId = :buyId"),
    @NamedQuery(name = "Buyshares.findByLid", query = "SELECT b FROM Buyshares b WHERE b.lid = :lid"),
    @NamedQuery(name = "Buyshares.findByShareid", query = "SELECT b FROM Buyshares b WHERE b.shareid = :shareid"),
    @NamedQuery(name = "Buyshares.findBySymbol", query = "SELECT b FROM Buyshares b WHERE b.symbol = :symbol"),
    @NamedQuery(name = "Buyshares.findByBprice", query = "SELECT b FROM Buyshares b WHERE b.bprice = :bprice"),
    @NamedQuery(name = "Buyshares.findByBDateTime", query = "SELECT b FROM Buyshares b WHERE b.bDateTime = :bDateTime"),
    @NamedQuery(name = "Buyshares.findByBquantity", query = "SELECT b FROM Buyshares b WHERE b.bquantity = :bquantity"),
    @NamedQuery(name = "Buyshares.findByBtotalPrice", query = "SELECT b FROM Buyshares b WHERE b.btotalPrice = :btotalPrice")})
public class Buyshares implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "buy_id")
    private Integer buyId;
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
    @Column(name = "bprice")
    private double bprice;
    @Basic(optional = false)
    @Column(name = "b_date_time")
    private String bDateTime;
    @Basic(optional = false)
    @Column(name = "bquantity")
    private int bquantity;
    @Basic(optional = false)
    @Column(name = "btotal_price")
    private double btotalPrice;

    public Buyshares() {
    }

    public Buyshares(Integer buyId) {
        this.buyId = buyId;
    }

    public Buyshares(Integer buyId, int lid, int shareid, String symbol, double bprice, String bDateTime, int bquantity, double btotalPrice) {
        this.buyId = buyId;
        this.lid = lid;
        this.shareid = shareid;
        this.symbol = symbol;
        this.bprice = bprice;
        this.bDateTime = bDateTime;
        this.bquantity = bquantity;
        this.btotalPrice = btotalPrice;
    }

    public Integer getBuyId() {
        return buyId;
    }

    public void setBuyId(Integer buyId) {
        this.buyId = buyId;
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

    public double getBprice() {
        return bprice;
    }

    public void setBprice(double bprice) {
        this.bprice = bprice;
    }

    public String getBDateTime() {
        return bDateTime;
    }

    public void setBDateTime(String bDateTime) {
        this.bDateTime = bDateTime;
    }

    public int getBquantity() {
        return bquantity;
    }

    public void setBquantity(int bquantity) {
        this.bquantity = bquantity;
    }

    public double getBtotalPrice() {
        return btotalPrice;
    }

    public void setBtotalPrice(double btotalPrice) {
        this.btotalPrice = btotalPrice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (buyId != null ? buyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Buyshares)) {
            return false;
        }
        Buyshares other = (Buyshares) object;
        if ((this.buyId == null && other.buyId != null) || (this.buyId != null && !this.buyId.equals(other.buyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Buyshares[ buyId=" + buyId + " ]";
    }
    
}
