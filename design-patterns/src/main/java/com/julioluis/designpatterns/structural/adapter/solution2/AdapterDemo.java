package com.julioluis.designpatterns.structural.adapter.solution2;

import com.julioluis.designpatterns.structural.adapter.solution2.impl.EmployeeAdapter;

public class AdapterDemo {

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setFirstName("Juan");
        employee.setLastName("Martinez");

        EmployeeRepository employeeRepository=new EmployeeAdapter();
        employeeRepository.saveEmployee(employee);
    }
}
