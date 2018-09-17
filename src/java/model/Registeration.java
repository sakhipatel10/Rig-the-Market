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
@Table(name = "Registeration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registeration.findAll", query = "SELECT r FROM Registeration r"),
    @NamedQuery(name = "Registeration.findByUid", query = "SELECT r FROM Registeration r WHERE r.uid = :uid"),
    @NamedQuery(name = "Registeration.findByName", query = "SELECT r FROM Registeration r WHERE r.name = :name"),
    @NamedQuery(name = "Registeration.findByMobileNo", query = "SELECT r FROM Registeration r WHERE r.mobileNo = :mobileNo"),
    @NamedQuery(name = "Registeration.findByGender", query = "SELECT r FROM Registeration r WHERE r.gender = :gender"),
    @NamedQuery(name = "Registeration.findByBirthday", query = "SELECT r FROM Registeration r WHERE r.birthday = :birthday"),
    @NamedQuery(name = "Registeration.findByCity", query = "SELECT r FROM Registeration r WHERE r.city = :city"),
    @NamedQuery(name = "Registeration.findByOccupation", query = "SELECT r FROM Registeration r WHERE r.occupation = :occupation"),
    @NamedQuery(name = "Registeration.findByIndustry", query = "SELECT r FROM Registeration r WHERE r.industry = :industry"),
    @NamedQuery(name = "Registeration.findByIncome", query = "SELECT r FROM Registeration r WHERE r.income = :income")})
public class Registeration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "Uid")
    private Integer uid;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "MobileNo")
    private String mobileNo;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "Birthday")
    private String birthday;
    @Basic(optional = false)
    @Column(name = "City")
    private String city;
    @Basic(optional = false)
    @Column(name = "Occupation")
    private String occupation;
    @Basic(optional = false)
    @Column(name = "Industry")
    private String industry;
    @Basic(optional = false)
    @Column(name = "income")
    private int income;
    @JoinColumn(name = "Lid", referencedColumnName = "Lid")
    @ManyToOne(optional = false)
    private Login lid;
    @JoinColumn(name = "Vid", referencedColumnName = "Vid")
    @ManyToOne(optional = false)
    private VirtualMoney vid;

    public Registeration() {
    }

    public Registeration(Integer uid) {
        this.uid = uid;
    }

    public Registeration(Integer uid, String name, String mobileNo, String gender, String birthday, String city, String occupation, String industry, int income) {
        this.uid = uid;
        this.name = name;
        this.mobileNo = mobileNo;
        this.gender = gender;
        this.birthday = birthday;
        this.city = city;
        this.occupation = occupation;
        this.industry = industry;
        this.income = income;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public Login getLid() {
        return lid;
    }

    public void setLid(Login lid) {
        this.lid = lid;
    }

    public VirtualMoney getVid() {
        return vid;
    }

    public void setVid(VirtualMoney vid) {
        this.vid = vid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registeration)) {
            return false;
        }
        Registeration other = (Registeration) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Registeration[ uid=" + uid + " ]";
    }
    
}
