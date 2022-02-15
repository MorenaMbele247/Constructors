package com.company;

public class Account {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    //Getters and setters
    //Shortcut alt+insert

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //Methods
    public void deposit(double depositAmount) {
        this.accountBalance += depositAmount;
    }
    public void withdraw(double withdrawAmount) {
        if (this.accountBalance - withdrawAmount < 0){
            System.out.println("Only "+  this.accountBalance + " available. Withdrawal not processed");
        } else {
            this.accountBalance -= withdrawAmount;
            System.out.println("Withdrawal of "+ withdrawAmount+" processed. Remaining balance :" + this.accountBalance);
        }
    }

}
