package com.atguigu.day10.exer2;


/**
 * @author Alex
 * @date 2022/4/20 08:19
 */
public class Account {

    private int id;

    private double balance;

    private double annualInterestRate;


    public Account(double balance) {
        this.balance = balance;
    }
    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("余额不足，取钱失败～ ");
            return;
        }
        this.balance -= amount;
        System.out.println("取钱： " + amount);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("存款：" + amount);
    }
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                '}';
    }


}






