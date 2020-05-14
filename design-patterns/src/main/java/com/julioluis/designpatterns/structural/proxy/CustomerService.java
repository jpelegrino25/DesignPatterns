package com.julioluis.designpatterns.structural.proxy;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);
    void update(Customer customer);
    List<Customer> findAll();
    Customer findById(Integer id);
}
