package com.julioluis.designpatterns.creational.builder;

import java.util.Date;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private String address;

    public Customer(CustomerBuilder builder) {
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.email=builder.email;
        this.dateOfBirth=builder.dateOfBirth;
        this.address=builder.address;
    }

    static class CustomerBuilder {

        private String firstName;
        private String lastName;
        private String email;
        private Date dateOfBirth;
        private String address;

        public CustomerBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public CustomerBuilder firstName(String firstName) {
            this.firstName=firstName;
            return this;
        }

        public CustomerBuilder lastName(String lastName) {
            this.lastName=lastName;
            return this;
        }

        public CustomerBuilder email(String email) {
            this.email=email;
            return this;
        }

        public CustomerBuilder dateOfBirth(Date dateOfBirth) {
            this.dateOfBirth=dateOfBirth;
            return this;
        }

        public CustomerBuilder address(String address) {
            this.address=address;
            return this;
        }

        public Customer build() {
            Customer customer=new Customer(this);
            return customer;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                '}';
    }
}
