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
@Table(name = "FIKSTUR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EFikstur.findAll", query = "SELECT e FROM EFikstur e"),
    @NamedQuery(name = "EFikstur.findByMackod", query = "SELECT e FROM EFikstur e WHERE e.mackod = :mackod"),
    @NamedQuery(name = "EFikstur.findByHafta", query = "SELECT e FROM EFikstur e WHERE e.hafta = :hafta"),
    @NamedQuery(name = "EFikstur.findByTakimbir", query = "SELECT e FROM EFikstur e WHERE e.takimbir = :takimbir"),
    @NamedQuery(name = "EFikstur.findByVs", query = "SELECT e FROM EFikstur e WHERE e.vs = :vs"),
    @NamedQuery(name = "EFikstur.findByTakimiki", query = "SELECT e FROM EFikstur e WHERE e.takimiki = :takimiki"),
    @NamedQuery(name = "EFikstur.findByOynandimi", query = "SELECT e FROM EFikstur e WHERE e.oynandimi = :oynandimi")})
public class EFikstur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MACKOD")
    private Integer mackod;
    @Basic(optional = false)
    @Column(name = "HAFTA")
    private int hafta;
    @Basic(optional = false)
    @Column(name = "TAKIMBIR")
    private String takimbir;
    @Basic(optional = false)
    @Column(name = "VS")
    private String vs;
    @Basic(optional = false)
    @Column(name = "TAKIMIKI")
    private String takimiki;
    @Column(name = "OYNANDIMI")
    private Integer oynandimi;

    public EFikstur() {
    }

    public EFikstur(Integer mackod) {
        this.mackod = mackod;
    }

    public EFikstur(Integer mackod, int hafta, String takimbir, String vs, String takimiki) {
        this.mackod = mackod;
        this.hafta = hafta;
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

    public int getHafta() {
        return hafta;
    }

    public void setHafta(int hafta) {
        this.hafta = hafta;
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

    public Integer getOynandimi() {
        return oynandimi;
    }

    public void setOynandimi(Integer oynandimi) {
        this.oynandimi = oynandimi;
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
        if (!(object instanceof EFikstur)) {
            return false;
        }
        EFikstur other = (EFikstur) object;
        if ((this.mackod == null && other.mackod != null) || (this.mackod != null && !this.mackod.equals(other.mackod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proje.EFikstur[ mackod=" + mackod + " ]";
    }
    
}
