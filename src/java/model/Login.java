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
import javax.persistence.GeneratedValue;
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
@Table(name = "Login")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l"),
    @NamedQuery(name = "Login.findByLid", query = "SELECT l FROM Login l WHERE l.lid = :lid"),
    @NamedQuery(name = "Login.findByUserId", query = "SELECT l FROM Login l WHERE l.userId = :userId"),
    @NamedQuery(name = "Login.findByPassword", query = "SELECT l FROM Login l WHERE l.password = :password")})
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "Lid")
    private Integer lid;
    @Basic(optional = false)
    @Column(name = "UserId")
    private String userId;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lid")
    private Collection<Registeration> registerationCollection;

    public Login() {
    }

    public Login(Integer lid) {
        this.lid = lid;
    }

    public Login(Integer lid, String userId, String password) {
        this.lid = lid;
        this.userId = userId;
        this.password = password;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public Collection<Registeration> getRegisterationCollection() {
        return registerationCollection;
    }

    public void setRegisterationCollection(Collection<Registeration> registerationCollection) {
        this.registerationCollection = registerationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lid != null ? lid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.lid == null && other.lid != null) || (this.lid != null && !this.lid.equals(other.lid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Login[ lid=" + lid + " ]";
    }
    
}
