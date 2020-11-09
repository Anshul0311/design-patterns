package com.designpatterns.structural.adapter;

public class EmployeeLdap {

    private String cn;
    private String surName;
    private String givenName;
    private String mail;

    public EmployeeLdap(String cn, String surName, String givenName, String mail) {
        this.cn = cn;
        this.surName = surName;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getFirstName() {
        return surName;
    }

    public String getLastName() {
        return givenName;
    }

    public String getEmail() {
        return mail;
    }

}
