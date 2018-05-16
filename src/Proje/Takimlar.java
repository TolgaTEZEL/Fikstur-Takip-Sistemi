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
@Table(name = "TAKIMLAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Takimlar.findAll", query = "SELECT t FROM Takimlar t"),
    @NamedQuery(name = "Takimlar.findByTakimId", query = "SELECT t FROM Takimlar t WHERE t.takimId = :takimId"),
    @NamedQuery(name = "Takimlar.findByTakimAdi", query = "SELECT t FROM Takimlar t WHERE t.takimAdi = :takimAdi")})
public class Takimlar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TAKIM_ID")
    private Integer takimId;
    @Column(name = "TAKIM_ADI")
    private String takimAdi;

    public Takimlar() {
    }

    public Takimlar(Integer takimId) {
        this.takimId = takimId;
    }

    public Integer getTakimId() {
        return takimId;
    }

    public void setTakimId(Integer takimId) {
        this.takimId = takimId;
    }

    public String getTakimAdi() {
        return takimAdi;
    }

    public void setTakimAdi(String takimAdi) {
        this.takimAdi = takimAdi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (takimId != null ? takimId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Takimlar)) {
            return false;
        }
        Takimlar other = (Takimlar) object;
        if ((this.takimId == null && other.takimId != null) || (this.takimId != null && !this.takimId.equals(other.takimId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proje.Takimlar[ takimId=" + takimId + " ]";
    }
    
}
