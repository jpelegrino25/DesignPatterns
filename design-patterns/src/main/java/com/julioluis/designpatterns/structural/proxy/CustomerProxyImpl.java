package com.julioluis.designpatterns.structural.proxy;

public class CustomerProxyImpl implements CustomerProxy {


    @Override
    public void saveCustomer(Customer customer) {
        CustomerServiceImpl customerService=new CustomerServiceImpl();
        customerService.saveCustomer(customer);
    }

    @Override
    public Customer findCustomerById(Integer id) {
        CustomerServiceImpl customerService=new CustomerServiceImpl();
        return customerService.findCustomerById(id);
    }
}
