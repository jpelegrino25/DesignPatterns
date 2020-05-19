package com.julioluis.designpatterns.structural.proxy;

public interface CustomerProxy {
    void saveCustomer(Customer customer);
    Customer findCustomerById(Integer integer);
}
