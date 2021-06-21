package com.julioluis.designpatterns.structural.adapter.solution2.impl;

import com.julioluis.designpatterns.structural.adapter.solution2.Employee;
import com.julioluis.designpatterns.structural.adapter.solution2.EmployeeRepository;

public class EmployeeRepositoryService implements EmployeeRepository {
    @Override
    public void saveEmployee(Employee employee) {
        System.out.println(employee.getLastName() +" Repository has been created!");
    }
}
