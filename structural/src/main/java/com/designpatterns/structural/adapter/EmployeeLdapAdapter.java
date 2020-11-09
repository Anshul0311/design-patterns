package com.designpatterns.structural.adapter;

public class EmployeeLdapAdapter implements Employee {

    private EmployeeLdap employeeLdap;

    public EmployeeLdapAdapter(EmployeeLdap employeeLdap) {
        this.employeeLdap = employeeLdap;
    }

    public String getId() {
        return employeeLdap.getCn();
    }

    public String getFirstName() {
        return employeeLdap.getFirstName();
    }

    public String getLastName() {
        return employeeLdap.getLastName();
    }

    public String getEmail() {
        return employeeLdap.getEmail();
    }
}
