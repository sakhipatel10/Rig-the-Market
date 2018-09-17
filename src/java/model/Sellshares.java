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
@Table(name = "Sellshares")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sellshares.findAll", query = "SELECT s FROM Sellshares s"),
    @NamedQuery(name = "Sellshares.findBySellId", query = "SELECT s FROM Sellshares s WHERE s.sellId = :sellId"),
    @NamedQuery(name = "Sellshares.findByLid", query = "SELECT s FROM Sellshares s WHERE s.lid = :lid"),
    @NamedQuery(name = "Sellshares.findByShareid", query = "SELECT s FROM Sellshares s WHERE s.shareid = :shareid"),
    @NamedQuery(name = "Sellshares.findBySymbol", query = "SELECT s FROM Sellshares s WHERE s.symbol = :symbol"),
    @NamedQuery(name = "Sellshares.findBySprice", query = "SELECT s FROM Sellshares s WHERE s.sprice = :sprice"),
    @NamedQuery(name = "Sellshares.findBySDateTime", query = "SELECT s FROM Sellshares s WHERE s.sDateTime = :sDateTime"),
    @NamedQuery(name = "Sellshares.findBySquantity", query = "SELECT s FROM Sellshares s WHERE s.squantity = :squantity"),
    @NamedQuery(name = "Sellshares.findByStotalPrice", query = "SELECT s FROM Sellshares s WHERE s.stotalPrice = :stotalPrice"),
    @NamedQuery(name = "Sellshares.findByVma", query = "SELECT s FROM Sellshares s WHERE s.vma = :vma"),
    @NamedQuery(name = "Sellshares.findBySellprofitloss", query = "SELECT s FROM Sellshares s WHERE s.sellprofitloss = :sellprofitloss")})
public class Sellshares implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "sell_id")
    private Integer sellId;
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
    @Column(name = "sprice")
    private double sprice;
    @Basic(optional = false)
    @Column(name = "s_date_time")
    private String sDateTime;
    @Basic(optional = false)
    @Column(name = "squantity")
    private int squantity;
    @Basic(optional = false)
    @Column(name = "stotal_price")
    private double stotalPrice;
    @Basic(optional = false)
    @Column(name = "vma")
    private double vma;
    @Basic(optional = false)
    @Column(name = "sellprofitloss")
    private double sellprofitloss;

    public Sellshares() {
    }

    public Sellshares(Integer sellId) {
        this.sellId = sellId;
    }

    public Sellshares(Integer sellId, int lid, int shareid, String symbol, double sprice, String sDateTime, int squantity, double stotalPrice, double vma, double sellprofitloss) {
        this.sellId = sellId;
        this.lid = lid;
        this.shareid = shareid;
        this.symbol = symbol;
        this.sprice = sprice;
        this.sDateTime = sDateTime;
        this.squantity = squantity;
        this.stotalPrice = stotalPrice;
        this.vma = vma;
        this.sellprofitloss = sellprofitloss;
    }

    public Integer getSellId() {
        return sellId;
    }

    public void setSellId(Integer sellId) {
        this.sellId = sellId;
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

    public double getSprice() {
        return sprice;
    }

    public void setSprice(double sprice) {
        this.sprice = sprice;
    }

    public String getSDateTime() {
        return sDateTime;
    }

    public void setSDateTime(String sDateTime) {
        this.sDateTime = sDateTime;
    }

    public int getSquantity() {
        return squantity;
    }

    public void setSquantity(int squantity) {
        this.squantity = squantity;
    }

    public double getStotalPrice() {
        return stotalPrice;
    }

    public void setStotalPrice(double stotalPrice) {
        this.stotalPrice = stotalPrice;
    }

    public double getVma() {
        return vma;
    }

    public void setVma(double vma) {
        this.vma = vma;
    }

    public double getSellprofitloss() {
        return sellprofitloss;
    }

    public void setSellprofitloss(double sellprofitloss) {
        this.sellprofitloss = sellprofitloss;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sellId != null ? sellId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sellshares)) {
            return false;
        }
        Sellshares other = (Sellshares) object;
        if ((this.sellId == null && other.sellId != null) || (this.sellId != null && !this.sellId.equals(other.sellId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Sellshares[ sellId=" + sellId + " ]";
    }
    
}
