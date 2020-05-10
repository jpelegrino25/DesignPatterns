package com.julioluis.designpatterns.creational.builder;

public class Demo {
    public static void main(String[] args) {
        Customer customer=new Customer
                .CustomerBuilder("Juan","Martinez")
                .address("Ensanche Luperon")
                .build();

        System.out.println(customer);

        Customer customer1=new Customer
                .CustomerBuilder("Peter","Suarez")
                .email("peters@gmail.com")
                .build();
        System.out.println(customer1);




    }
}
