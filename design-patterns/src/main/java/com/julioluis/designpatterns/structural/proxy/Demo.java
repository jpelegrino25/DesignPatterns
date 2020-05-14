package com.julioluis.designpatterns.structural.proxy;

public class Demo {
    public static void main(String[] args) {
        CustomerProxy customerProxy=new CustomerProxyImpl();

        customerProxy.saveCustomer(new Customer());
    }
}
