package com.dfmzone;

public class CreditCard {

    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;

    public CreditCard(String customer, String bank, String account, int limit) {
        this(customer, bank, account, limit, 0.0);
    }

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public boolean charge(double amount) {
        if (amount + balance > limit) {
            return false;
        }
        balance += amount;
        return true;
    }

    public void makePayment(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance -= amount;
    }

    public static void printSummary(CreditCard card) {
        System.out.println("Customer : " + card.customer);
        System.out.println("Bank : " + card.bank);
        System.out.println("Account : " + card.account);
        System.out.println("Limit : " + card.limit);
        System.out.println("Balance : " + card.balance);
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }
}
