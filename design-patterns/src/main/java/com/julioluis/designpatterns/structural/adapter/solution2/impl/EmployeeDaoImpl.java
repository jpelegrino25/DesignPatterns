package com.julioluis.designpatterns.structural.adapter.solution2.impl;

import com.julioluis.designpatterns.structural.adapter.solution2.EmployeeDAO;

public class EmployeeDaoImpl implements EmployeeDAO {
    @Override
    public void createEmployee(Integer id, String firstName, String lastName) {
        System.out.println(lastName +" Dao Has been created");
    }
}
