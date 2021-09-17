package com.pharma.pharmacyApp.pharma.model;


import javax.persistence.*;

@Entity
@Table(name = "pharm_med")
public class Pharm_med {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "idpharm_med")
    private Integer idpharmed;

    @Column(name = "pharm_medname")
    private String pharmmedname;

    @Column(name = "pharm_medtype")
    private String pharmmedtype;

    public Integer getIdpharmed() {
        return idpharmed;
    }

    public void setIdpharmed(Integer idpharmed) {
        this.idpharmed = idpharmed;
    }

    public String getPharmmedname() {
        return pharmmedname;
    }

    public void setPharmmedname(String pharmmedname) {
        this.pharmmedname = pharmmedname;
    }

    public String getPharmmedtype() {
        return pharmmedtype;
    }

    public void setPharmmedtype(String pharmmedtype) {
        this.pharmmedtype = pharmmedtype;
    }
}
