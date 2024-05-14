package com.atguigu.day10oop.exer2;


/**
 * @author Alex
 * @since 2022/4/20 10:12
 */
public class BankTest {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.addCustomer("Alex", "Li");
        Customer customer = bank.getCustomer(0);
        customer.setAccount(new Account(2000));
        System.out.println("customer = " + customer);
        System.out.println("***********************");
        bank.addCustomer("万里", "杨");
        System.out.println("银行客户个数为： " + bank.getNumberOfCustomers());

    }

}
