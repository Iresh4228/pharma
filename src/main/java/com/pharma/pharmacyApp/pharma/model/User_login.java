package com.pharma.pharmacyApp.pharma.model;

import javax.persistence.*;

@Entity
@Table(name = "user_login")
public class User_login {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iduser_login")
    private Integer logid;

    @Column(name = "login_username", nullable = false)
    private String loguname;

    @Column(name = "login_password")
    private String logpass;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getLoguname() {
        return loguname;
    }

    public void setLoguname(String loguname) {
        this.loguname = loguname;
    }

    public String getLogpass() {
        return logpass;
    }

    public void setLogpass(String logpass) {
        this.logpass = logpass;
    }
}
