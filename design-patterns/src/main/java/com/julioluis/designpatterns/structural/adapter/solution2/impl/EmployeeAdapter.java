package com.julioluis.designpatterns.structural.adapter.solution2.impl;

import com.julioluis.designpatterns.structural.adapter.solution2.Employee;
import com.julioluis.designpatterns.structural.adapter.solution2.EmployeeDAO;
import com.julioluis.designpatterns.structural.adapter.solution2.EmployeeRepository;

public class EmployeeAdapter implements EmployeeRepository {

    EmployeeDAO employeeDAO=new EmployeeDaoImpl();

    @Override
    public void saveEmployee(Employee employee) {
        employeeDAO.createEmployee(employee.getId(),employee.getFirstName(),employee.getLastName());
    }
}
