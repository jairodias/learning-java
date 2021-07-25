package exercises.entities;

import java.util.Random;

public class Account {

    private static final double TAX_BY_WITHDRAWAL = 5;

    private int accountNumber;
    private String customerName;
    private double balance;

    public Account(String customerName, double balance) {
        this.customerName = customerName;
        this.balance = balance;

        this.generatorIdAccount();
    }

    public Account(String customerName) {
        this.customerName = customerName;
        this.generatorIdAccount();
    }

    private void generatorIdAccount() {
        Random generator = new Random();

        this.accountNumber = generator.nextInt(9999);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double value) {
        this.balance += value;

        System.out.printf("%nDeposit made from: R$ %.2f%n", value);
        System.out.printf("Current balance: R$ %.2f%n", this.balance);
        System.out.println();
    }

    public void withdrawal(double value) {

        if ((value + TAX_BY_WITHDRAWAL) < this.balance) {
            this.balance -= value;
            this.taxBywithdrawal();

            System.out.printf("%nWithdrawal made from: R$ %.2f + rate of: R$ %.2f", value, TAX_BY_WITHDRAWAL);
            System.out.printf("%nCurrent balance: R$ %.2f%n", this.balance);
            System.out.println();
        } else {
            System.out.printf("Insufficient funds.");
            System.out.println();
        }
    }

    private void taxBywithdrawal() {
        this.balance -= TAX_BY_WITHDRAWAL;
    }
}
