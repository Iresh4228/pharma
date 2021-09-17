package com.pharma.pharmacyApp.pharma.model;

import javax.persistence.*;

@Entity
@Table(name = "purchasing_phar")
public class Pharm_purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idpurchasing_phar")
    private Integer idpurchase;

    @Column(name = "idsystem_user")
    private Integer iduser;

    @Column(name = "idpharm_med")
    private Integer idmed;

    @Column(name = "purchasing_pharamount")
    private String pamount;

    @Column(name = "purchasing_phardate")
    private String pdate;

    public Integer getIdpurchase() {
        return idpurchase;
    }

    public void setIdpurchase(Integer idpurchase) {
        this.idpurchase = idpurchase;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public Integer getIdmed() {
        return idmed;
    }

    public void setIdmed(Integer idmed) {
        this.idmed = idmed;
    }

    public String getPamount() {
        return pamount;
    }

    public void setPamount(String pamount) {
        this.pamount = pamount;
    }

    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }
}
