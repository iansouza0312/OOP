package org.example;

public class Account {
    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder, double firstDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(firstDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 2.50;
    }

    @Override
    public String toString() {
        return "Account" + number +
                ", holder= '" + holder + '\'' +
                ", balance=" + balance +
                '.';
    }
}
