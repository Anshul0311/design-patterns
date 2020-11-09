package com.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<Employee>();
        Employee employeeDb = new EmployeeDb("1234", "John", "Wick", "john@wick.com");

        EmployeeLdap employeeLdap = new EmployeeLdap("1234", "Michael", "Schmcuk", "mike@wick.com");
        employees.add(new EmployeeLdapAdapter(employeeLdap));
        employees.add(employeeDb);
        return employees;
    }
}
