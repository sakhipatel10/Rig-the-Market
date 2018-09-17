/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Rohan
 */
@Entity
@Table(name = "VSM_ShareDetail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VSMShareDetail.findAll", query = "SELECT v FROM VSMShareDetail v"),
    @NamedQuery(name = "VSMShareDetail.findById", query = "SELECT v FROM VSMShareDetail v WHERE v.id = :id"),
    @NamedQuery(name = "VSMShareDetail.findBySymbol", query = "SELECT v FROM VSMShareDetail v WHERE v.symbol = :symbol"),
    @NamedQuery(name = "VSMShareDetail.findByName", query = "SELECT v FROM VSMShareDetail v WHERE v.name = :name"),
    @NamedQuery(name = "VSMShareDetail.findByPrice", query = "SELECT v FROM VSMShareDetail v WHERE v.price = :price"),
    @NamedQuery(name = "VSMShareDetail.findByPreviousopen", query = "SELECT v FROM VSMShareDetail v WHERE v.previousopen = :previousopen"),
    @NamedQuery(name = "VSMShareDetail.findByPreviousclose", query = "SELECT v FROM VSMShareDetail v WHERE v.previousclose = :previousclose"),
    @NamedQuery(name = "VSMShareDetail.findByLow", query = "SELECT v FROM VSMShareDetail v WHERE v.low = :low"),
    @NamedQuery(name = "VSMShareDetail.findByHigh", query = "SELECT v FROM VSMShareDetail v WHERE v.high = :high"),
    @NamedQuery(name = "VSMShareDetail.findByChange", query = "SELECT v FROM VSMShareDetail v WHERE v.change = :change"),
    @NamedQuery(name = "VSMShareDetail.findByChangeinpercentage", query = "SELECT v FROM VSMShareDetail v WHERE v.changeinpercentage = :changeinpercentage")})
public class VSMShareDetail implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private Collection<SetPointer> setPointerCollection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private Collection<Watchlist> watchlistCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "symbol")
    private String symbol;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @Column(name = "previousopen")
    private Double previousopen;
    @Column(name = "previousclose")
    private Double previousclose;
    @Column(name = "low")
    private Double low;
    @Column(name = "high")
    private Double high;
    @Column(name = "change")
    private Double change;
    @Column(name = "changeinpercentage")
    private Double changeinpercentage;

    public VSMShareDetail() {
    }

    public VSMShareDetail(Integer id) {
        this.id = id;
    }

    public VSMShareDetail(Integer id, String symbol, String name) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPreviousopen() {
        return previousopen;
    }

    public void setPreviousopen(Double previousopen) {
        this.previousopen = previousopen;
    }

    public Double getPreviousclose() {
        return previousclose;
    }

    public void setPreviousclose(Double previousclose) {
        this.previousclose = previousclose;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Double getChangeinpercentage() {
        return changeinpercentage;
    }

    public void setChangeinpercentage(Double changeinpercentage) {
        this.changeinpercentage = changeinpercentage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VSMShareDetail)) {
            return false;
        }
        VSMShareDetail other = (VSMShareDetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.VSMShareDetail[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<Watchlist> getWatchlistCollection() {
        return watchlistCollection;
    }

    public void setWatchlistCollection(Collection<Watchlist> watchlistCollection) {
        this.watchlistCollection = watchlistCollection;
    }

    @XmlTransient
    public Collection<SetPointer> getSetPointerCollection() {
        return setPointerCollection;
    }

    public void setSetPointerCollection(Collection<SetPointer> setPointerCollection) {
        this.setPointerCollection = setPointerCollection;
    }
    
}
