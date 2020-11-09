package com.designpatterns.structural.adapter;

import java.util.List;

public class AdapterDemo {
    public void adapterDemo() {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();
        System.out.println(employees);
    }
}
