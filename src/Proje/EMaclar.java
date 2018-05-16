/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proje;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "MACLAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EMaclar.findAll", query = "SELECT e FROM EMaclar e"),
    @NamedQuery(name = "EMaclar.findByMackod", query = "SELECT e FROM EMaclar e WHERE e.mackod = :mackod"),
    @NamedQuery(name = "EMaclar.findByTakimbir", query = "SELECT e FROM EMaclar e WHERE e.takimbir = :takimbir"),
    @NamedQuery(name = "EMaclar.findByVs", query = "SELECT e FROM EMaclar e WHERE e.vs = :vs"),
    @NamedQuery(name = "EMaclar.findByTakimiki", query = "SELECT e FROM EMaclar e WHERE e.takimiki = :takimiki"),
    @NamedQuery(name = "EMaclar.findBySkor", query = "SELECT e FROM EMaclar e WHERE e.skor = :skor")})
public class EMaclar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MACKOD")
    private Integer mackod;
    @Basic(optional = false)
    @Column(name = "TAKIMBIR")
    private String takimbir;
    @Basic(optional = false)
    @Column(name = "VS")
    private String vs;
    @Basic(optional = false)
    @Column(name = "TAKIMIKI")
    private String takimiki;
    @Column(name = "SKOR")
    private Integer skor;

    public EMaclar() {
    }

    public EMaclar(Integer mackod) {
        this.mackod = mackod;
    }

    public EMaclar(Integer mackod, String takimbir, String vs, String takimiki) {
        this.mackod = mackod;
        this.takimbir = takimbir;
        this.vs = vs;
        this.takimiki = takimiki;
    }

    public Integer getMackod() {
        return mackod;
    }

    public void setMackod(Integer mackod) {
        this.mackod = mackod;
    }

    public String getTakimbir() {
        return takimbir;
    }

    public void setTakimbir(String takimbir) {
        this.takimbir = takimbir;
    }

    public String getVs() {
        return vs;
    }

    public void setVs(String vs) {
        this.vs = vs;
    }

    public String getTakimiki() {
        return takimiki;
    }

    public void setTakimiki(String takimiki) {
        this.takimiki = takimiki;
    }

    public Integer getSkor() {
        return skor;
    }

    public void setSkor(Integer skor) {
        this.skor = skor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mackod != null ? mackod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EMaclar)) {
            return false;
        }
        EMaclar other = (EMaclar) object;
        if ((this.mackod == null && other.mackod != null) || (this.mackod != null && !this.mackod.equals(other.mackod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proje.EMaclar[ mackod=" + mackod + " ]";
    }
    
}
