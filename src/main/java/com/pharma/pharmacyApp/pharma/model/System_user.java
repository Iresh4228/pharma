package com.pharma.pharmacyApp.pharma.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "system_user")
public class System_user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idsystem_user")
    private Integer sysid;

    @Column(name = "system_username", nullable = false)
    private String sysuname;

    @Column(name = "system_userpassword", nullable = false)
    private String upass;

    @Column(name = "system_useraddress", nullable = false)
    private String uaddress;

    public Integer getSysid() {
        return sysid;
    }

    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    public String getSysuname() {
        return sysuname;
    }

    public void setSysuname(String sysuname) {
        this.sysuname = sysuname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }


    public void addAttribute(String sysu, List<System_user> allUsers) {
    }
}
