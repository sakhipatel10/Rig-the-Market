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
@Table(name = "MyHistory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MyHistory.findAll", query = "SELECT m FROM MyHistory m"),
    @NamedQuery(name = "MyHistory.findByTransactionId", query = "SELECT m FROM MyHistory m WHERE m.transactionId = :transactionId"),
    @NamedQuery(name = "MyHistory.findByType", query = "SELECT m FROM MyHistory m WHERE m.type = :type"),
    @NamedQuery(name = "MyHistory.findByLid", query = "SELECT m FROM MyHistory m WHERE m.lid = :lid"),
    @NamedQuery(name = "MyHistory.findByShareid", query = "SELECT m FROM MyHistory m WHERE m.shareid = :shareid"),
    @NamedQuery(name = "MyHistory.findBySymbol", query = "SELECT m FROM MyHistory m WHERE m.symbol = :symbol"),
    @NamedQuery(name = "MyHistory.findByBprice", query = "SELECT m FROM MyHistory m WHERE m.bprice = :bprice"),
    @NamedQuery(name = "MyHistory.findBySprice", query = "SELECT m FROM MyHistory m WHERE m.sprice = :sprice"),
    @NamedQuery(name = "MyHistory.findByBDateTime", query = "SELECT m FROM MyHistory m WHERE m.bDateTime = :bDateTime"),
    @NamedQuery(name = "MyHistory.findBySDateTime", query = "SELECT m FROM MyHistory m WHERE m.sDateTime = :sDateTime"),
    @NamedQuery(name = "MyHistory.findBySquantity", query = "SELECT m FROM MyHistory m WHERE m.squantity = :squantity"),
    @NamedQuery(name = "MyHistory.findByBquantity", query = "SELECT m FROM MyHistory m WHERE m.bquantity = :bquantity"),
    @NamedQuery(name = "MyHistory.findByBtotalPrice", query = "SELECT m FROM MyHistory m WHERE m.btotalPrice = :btotalPrice"),
    @NamedQuery(name = "MyHistory.findByStotalPrice", query = "SELECT m FROM MyHistory m WHERE m.stotalPrice = :stotalPrice"),
    @NamedQuery(name = "MyHistory.findByVml", query = "SELECT m FROM MyHistory m WHERE m.vml = :vml"),
    @NamedQuery(name = "MyHistory.findByVma", query = "SELECT m FROM MyHistory m WHERE m.vma = :vma"),
    @NamedQuery(name = "MyHistory.findBySellprofitloss", query = "SELECT m FROM MyHistory m WHERE m.sellprofitloss = :sellprofitloss")})
public class MyHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "TransactionId")
    private Integer transactionId;
    @Basic(optional = false)
    @Column(name = "Type")
    private String type;
    @Basic(optional = false)
    @Column(name = "Lid")
    private int lid;
    @Basic(optional = false)
    @Column(name = "shareid")
    private int shareid;
    @Basic(optional = false)
    @Column(name = "symbol")
    private String symbol;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "bprice")
    private Double bprice;
    @Column(name = "sprice")
    private Double sprice;
    @Column(name = "b_date_time")
    private String bDateTime;
    @Column(name = "s_date_time")
    private String sDateTime;
    @Column(name = "squantity")
    private Integer squantity;
    @Column(name = "bquantity")
    private Integer bquantity;
    @Column(name = "btotal_price")
    private Double btotalPrice;
    @Column(name = "stotal_price")
    private Double stotalPrice;
    @Column(name = "vml")
    private Double vml;
    @Column(name = "vma")
    private Double vma;
    @Column(name = "sellprofitloss")
    private Double sellprofitloss;

    public MyHistory() {
    }

    public MyHistory(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public MyHistory(Integer transactionId, String type, int lid, int shareid, String symbol) {
        this.transactionId = transactionId;
        this.type = type;
        this.lid = lid;
        this.shareid = shareid;
        this.symbol = symbol;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Double getBprice() {
        return bprice;
    }

    public void setBprice(Double bprice) {
        this.bprice = bprice;
    }

    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    public String getBDateTime() {
        return bDateTime;
    }

    public void setBDateTime(String bDateTime) {
        this.bDateTime = bDateTime;
    }

    public String getSDateTime() {
        return sDateTime;
    }

    public void setSDateTime(String sDateTime) {
        this.sDateTime = sDateTime;
    }

    public Integer getSquantity() {
        return squantity;
    }

    public void setSquantity(Integer squantity) {
        this.squantity = squantity;
    }

    public Integer getBquantity() {
        return bquantity;
    }

    public void setBquantity(Integer bquantity) {
        this.bquantity = bquantity;
    }

    public Double getBtotalPrice() {
        return btotalPrice;
    }

    public void setBtotalPrice(Double btotalPrice) {
        this.btotalPrice = btotalPrice;
    }

    public Double getStotalPrice() {
        return stotalPrice;
    }

    public void setStotalPrice(Double stotalPrice) {
        this.stotalPrice = stotalPrice;
    }

    public Double getVml() {
        return vml;
    }

    public void setVml(Double vml) {
        this.vml = vml;
    }

    public Double getVma() {
        return vma;
    }

    public void setVma(Double vma) {
        this.vma = vma;
    }

    public Double getSellprofitloss() {
        return sellprofitloss;
    }

    public void setSellprofitloss(Double sellprofitloss) {
        this.sellprofitloss = sellprofitloss;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionId != null ? transactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MyHistory)) {
            return false;
        }
        MyHistory other = (MyHistory) object;
        if ((this.transactionId == null && other.transactionId != null) || (this.transactionId != null && !this.transactionId.equals(other.transactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.MyHistory[ transactionId=" + transactionId + " ]";
    }
    
}
