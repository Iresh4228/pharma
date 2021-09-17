package com.pharma.pharmacyApp.pharma.model;

import javax.persistence.*;

@Entity
@Table(name = "pharm_stk")
public class Pharm_stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idpharm_stk")
    private Integer pharmstk_id;

    @Column(name = "pharm_stkqty")
    private String pharmstk_qty;

    @Column(name = "pharm_stkitems")
    private String pharmstk_items;

    @Column(name = "idpharm_med")
    private Integer idpharmed;

    public Integer getPharmstk_id() {
        return pharmstk_id;
    }

    public void setPharmstk_id(Integer pharmstk_id) {
        this.pharmstk_id = pharmstk_id;
    }

    public String getPharmstk_qty() {
        return pharmstk_qty;
    }

    public void setPharmstk_qty(String pharmstk_qty) {
        this.pharmstk_qty = pharmstk_qty;
    }

    public String getPharmstk_items() {
        return pharmstk_items;
    }

    public void setPharmstk_items(String pharmstk_items) {
        this.pharmstk_items = pharmstk_items;
    }

    public Integer getIdpharmed() {
        return idpharmed;
    }

    public void setIdpharmed(Integer idpharmed) {
        this.idpharmed = idpharmed;
    }
}
