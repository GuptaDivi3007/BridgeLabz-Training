package com.testCase.TestCase;

public class Bank {
    private double balance;
    Bank(double balance){
    	this.balance=balance;
    }
    public double getBalance() {
    	return balance;
    }
    public void deposit(double amount) {
    	if(amount<0) {
    		throw new IllegalArgumentException("Deposit amount cannot be negative");
    	}
    	balance=balance+amount;
    }
    public void withdraw(double amount) {
    	if(amount>balance) {
    		throw new IllegalArgumentException("Insufficient balance");
    	}
    	balance=balance-amount;
    }
}
