package com.designpatterns.structural.adapter;

public class EmployeeAdapterCSV implements Employee {

    private EmployeeCSV employeeCSV;
    public String getId() {
        return employeeCSV.getId() + "";
    }

    public String getFirstName() {
        return employeeCSV.getFirstname();
    }

    public String getLastName() {
        return null;
    }

    public String getEmail() {
        return employeeCSV.getEmailAddress();
    }
}
