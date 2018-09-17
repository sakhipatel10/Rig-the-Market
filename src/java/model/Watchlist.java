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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rohan
 */
@Entity
@Table(name = "watchlist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Watchlist.findAll", query = "SELECT w FROM Watchlist w"),
    @NamedQuery(name = "Watchlist.findByWlid", query = "SELECT w FROM Watchlist w WHERE w.wlid = :wlid"),
    @NamedQuery(name = "Watchlist.findByLid", query = "SELECT w FROM Watchlist w WHERE w.lid = :lid")})
public class Watchlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "wlid")
    private Integer wlid;
    @Basic(optional = false)
    @Column(name = "Lid")
    private int lid;
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private VSMShareDetail id;

    public Watchlist() {
    }

    public Watchlist(Integer wlid) {
        this.wlid = wlid;
    }

    public Watchlist(Integer wlid, int lid) {
        this.wlid = wlid;
        this.lid = lid;
    }

    public Integer getWlid() {
        return wlid;
    }

    public void setWlid(Integer wlid) {
        this.wlid = wlid;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public VSMShareDetail getId() {
        return id;
    }

    public void setId(VSMShareDetail id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wlid != null ? wlid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Watchlist)) {
            return false;
        }
        Watchlist other = (Watchlist) object;
        if ((this.wlid == null && other.wlid != null) || (this.wlid != null && !this.wlid.equals(other.wlid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Watchlist[ wlid=" + wlid + " ]";
    }
    
}
