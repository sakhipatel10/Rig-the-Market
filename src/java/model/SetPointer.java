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
@Table(name = "SetPointer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SetPointer.findAll", query = "SELECT s FROM SetPointer s"),
    @NamedQuery(name = "SetPointer.findBySPid", query = "SELECT s FROM SetPointer s WHERE s.sPid = :sPid"),
    @NamedQuery(name = "SetPointer.findByLid", query = "SELECT s FROM SetPointer s WHERE s.lid = :lid"),
    @NamedQuery(name = "SetPointer.findByMaxp", query = "SELECT s FROM SetPointer s WHERE s.maxp = :maxp"),
    @NamedQuery(name = "SetPointer.findByMinp", query = "SELECT s FROM SetPointer s WHERE s.minp = :minp"),
    @NamedQuery(name = "SetPointer.findBySpDT", query = "SELECT s FROM SetPointer s WHERE s.spDT = :spDT")})
public class SetPointer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "SP_id")
    private Integer sPid;
    @Basic(optional = false)
    @Column(name = "Lid")
    private int lid;
    @Basic(optional = false)
    @Column(name = "Max_p")
    private double maxp;
    @Basic(optional = false)
    @Column(name = "Min_p")
    private double minp;
    @Basic(optional = false)
    @Column(name = "Sp_DT")
    private String spDT;
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private VSMShareDetail id;

    public SetPointer() {
    }

    public SetPointer(Integer sPid) {
        this.sPid = sPid;
    }

    public SetPointer(Integer sPid, int lid, double maxp, double minp, String spDT) {
        this.sPid = sPid;
        this.lid = lid;
        this.maxp = maxp;
        this.minp = minp;
        this.spDT = spDT;
    }

    public Integer getSPid() {
        return sPid;
    }

    public void setSPid(Integer sPid) {
        this.sPid = sPid;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public double getMaxp() {
        return maxp;
    }

    public void setMaxp(double maxp) {
        this.maxp = maxp;
    }

    public double getMinp() {
        return minp;
    }

    public void setMinp(double minp) {
        this.minp = minp;
    }

    public String getSpDT() {
        return spDT;
    }

    public void setSpDT(String spDT) {
        this.spDT = spDT;
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
        hash += (sPid != null ? sPid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SetPointer)) {
            return false;
        }
        SetPointer other = (SetPointer) object;
        if ((this.sPid == null && other.sPid != null) || (this.sPid != null && !this.sPid.equals(other.sPid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.SetPointer[ sPid=" + sPid + " ]";
    }
    
}
