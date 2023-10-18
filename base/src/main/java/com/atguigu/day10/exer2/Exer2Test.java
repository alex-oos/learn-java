package com.atguigu.day10.exer2;


/**
 * @author Alex
 * @since 2022/4/20 08:26
 */
public class Exer2Test {

    public static void main(String[] args) {
        Customer customer = new Customer("ALex", "Li");
        Account account = new Account(1000, 2000, 0.0123);
        System.out.println("account = " + account);
        customer.setAccount(account);
        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);
        System.out.println(customer);


    }

}
