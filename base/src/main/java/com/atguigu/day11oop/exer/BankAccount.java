package com.atguigu.day11oop.exer;


/**
 * @author Alex
 * @since 2021/12/16 2:50 下午
 * 编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
 * 定义封装这些属性的方法。账号要自动生成。
 * 编写主类，使用银行账户类，输入、输出3个储户的上述信息。
 * 考虑：哪些属性可以设计成static属性。
 */
public class BankAccount {

    private final int id;

    private String password;

    private double balance;

    private double rake;

    private static double minMoney = 1.0;

    private static int init = 1001;//用于自动生成id使用的


    public BankAccount() {
        id = init++;

    }
    public BankAccount(String password, double balance, double rake) {
        id = init++;
        this.password = password;
        this.balance = balance;
        this.rake = rake;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getRake() {
        return rake;
    }
    public void setRake(double rake) {
        this.rake = rake;
    }
    public static double getMinMoney() {
        return minMoney;
    }
    public static void setMinMoney(double minMoney) {
        BankAccount.minMoney = minMoney;
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rake=" + rake +
                '}';
    }
    public static void main(String[] args) {
        BankAccount accountA = new BankAccount("00000", 100, 0.1);
        System.out.println(accountA);
        BankAccount accountB = new BankAccount("00000", 100, 0.1);
        System.out.println(accountB);
        BankAccount accountC = new BankAccount("00000", 100, 0.1);
        System.out.println(accountC);


    }

}
