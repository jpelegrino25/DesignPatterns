package com.julioluis.designpatterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class CustomerServiceImpl implements CustomerService,CustomerProxy {

    @Override
    public void save(Customer customer) {
        System.out.println("Saving Customer "+ customer);
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Update Customer "+ customer);
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> list= Arrays.asList(new Customer(),new Customer());
        return list;
    }

    @Override
    public Customer findById(Integer id) {
        return new Customer();
    }

    @Override
    public void saveCustomer(Customer customer) {
        System.out.println("Via proxy");
        this.save(customer);
    }

    @Override
    public Customer findCustomerById(Integer id) {
        System.out.println("Via proxy");
        return this.findById(id);
    }
}
