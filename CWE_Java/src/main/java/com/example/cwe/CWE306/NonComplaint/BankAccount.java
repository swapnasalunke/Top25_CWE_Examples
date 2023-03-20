package com.example.cwe.CWE306.NonComplaint;

public class BankAccount {

    String accountNumber;
    String accountType;
    String accountName;
    double balance;
    public void setAccountNumber(String accNo) {
        accountNumber = accNo;
    }

    public void setAccountType(String accType) {
        accountType = accType;
    }

    public void setAccountOwnerName(String accName) {
        accountName = accName;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    public void getOwnerName(){
        System.out.println(accountName);
    }
}
