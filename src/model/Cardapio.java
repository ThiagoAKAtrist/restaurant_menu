/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Thiago
 */
@Entity
@Table(name = "cardapio")
@NamedQueries({
    @NamedQuery(name = "Cardapio.findAll", query = "SELECT c FROM Cardapio c"),
    @NamedQuery(name = "Cardapio.findByIdcardapio", query = "SELECT c FROM Cardapio c WHERE c.idcardapio = :idcardapio"),
    @NamedQuery(name = "Cardapio.findByDiacardapio", query = "SELECT c FROM Cardapio c WHERE c.diacardapio = :diacardapio"),
    @NamedQuery(name = "Cardapio.findBySaladacardapio", query = "SELECT c FROM Cardapio c WHERE c.saladacardapio = :saladacardapio"),
    @NamedQuery(name = "Cardapio.findByCarboidratocardapio", query = "SELECT c FROM Cardapio c WHERE c.carboidratocardapio = :carboidratocardapio"),
    @NamedQuery(name = "Cardapio.findByGraoscardapio", query = "SELECT c FROM Cardapio c WHERE c.graoscardapio = :graoscardapio"),
    @NamedQuery(name = "Cardapio.findByProteinacardapio", query = "SELECT c FROM Cardapio c WHERE c.proteinacardapio = :proteinacardapio"),
    @NamedQuery(name = "Cardapio.findByBebidacardapio", query = "SELECT c FROM Cardapio c WHERE c.bebidacardapio = :bebidacardapio")})
public class Cardapio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcardapio")
    private Integer idcardapio;
    @Basic(optional = false)
    @Column(name = "diacardapio")
    private String diacardapio;
    @Basic(optional = false)
    @Column(name = "saladacardapio")
    private String saladacardapio;
    @Basic(optional = false)
    @Column(name = "carboidratocardapio")
    private String carboidratocardapio;
    @Basic(optional = false)
    @Column(name = "graoscardapio")
    private String graoscardapio;
    @Basic(optional = false)
    @Column(name = "proteinacardapio")
    private String proteinacardapio;
    @Basic(optional = false)
    @Column(name = "bebidacardapio")
    private String bebidacardapio;

    public Cardapio() {
    }

    public Cardapio(Integer idcardapio) {
        this.idcardapio = idcardapio;
    }

    public Cardapio(Integer idcardapio, String diacardapio, String saladacardapio, String carboidratocardapio, String graoscardapio, String proteinacardapio, String bebidacardapio) {
        this.idcardapio = idcardapio;
        this.diacardapio = diacardapio;
        this.saladacardapio = saladacardapio;
        this.carboidratocardapio = carboidratocardapio;
        this.graoscardapio = graoscardapio;
        this.proteinacardapio = proteinacardapio;
        this.bebidacardapio = bebidacardapio;
    }

    public Integer getIdcardapio() {
        return idcardapio;
    }

    public void setIdcardapio(Integer idcardapio) {
        this.idcardapio = idcardapio;
    }

    public String getDiacardapio() {
        return diacardapio;
    }

    public void setDiacardapio(String diacardapio) {
        this.diacardapio = diacardapio;
    }

    public String getSaladacardapio() {
        return saladacardapio;
    }

    public void setSaladacardapio(String saladacardapio) {
        this.saladacardapio = saladacardapio;
    }

    public String getCarboidratocardapio() {
        return carboidratocardapio;
    }

    public void setCarboidratocardapio(String carboidratocardapio) {
        this.carboidratocardapio = carboidratocardapio;
    }

    public String getGraoscardapio() {
        return graoscardapio;
    }

    public void setGraoscardapio(String graoscardapio) {
        this.graoscardapio = graoscardapio;
    }

    public String getProteinacardapio() {
        return proteinacardapio;
    }

    public void setProteinacardapio(String proteinacardapio) {
        this.proteinacardapio = proteinacardapio;
    }

    public String getBebidacardapio() {
        return bebidacardapio;
    }

    public void setBebidacardapio(String bebidacardapio) {
        this.bebidacardapio = bebidacardapio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcardapio != null ? idcardapio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cardapio)) {
            return false;
        }
        Cardapio other = (Cardapio) object;
        if ((this.idcardapio == null && other.idcardapio != null) || (this.idcardapio != null && !this.idcardapio.equals(other.idcardapio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cardapio[ idcardapio=" + idcardapio + " ]";
    }
    
}
