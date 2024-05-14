package com.atguigu.day10oop.exer2;


/**
 * @author Alex
 * @since 2022/4/20 08:56
 */
public class Bank {


    private final Customer[] customer;

    private int numberOfCustomers;

    public Bank() {

        customer = new Customer[10000];
    }

    public void addCustomer(String firstName, String lastName) {

        Customer c = new Customer(firstName, lastName);
        this.customer[numberOfCustomers++] = c;
    }

    public int getNumberOfCustomers() {

        return this.numberOfCustomers;
    }

    public Customer getCustomer(int index) {

        if (index >= 0 && index < numberOfCustomers) {
            return customer[index];
        }
        return null;

    }

}
