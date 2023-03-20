package com.example.cwe.CWE306.Complaint;

//      CWE-306: Missing Authentication for Critical Function

import java.util.*;

public class Complaint {
    public static void main(String[] args) {

        BankAccount user1 = createBankAccount("authKey","123","saving","Owner",300);
        user1.getOwnerName();
    }

    public static BankAccount createBankAccount(String authenticationKey,String accountNumber,
                                                String accountType, String accountOwnerName, double balance) {
        BankAccount account = new BankAccount();
        if (Objects.equals(authenticationKey, "authKey")) {
            account.setAccountNumber(accountNumber);
            account.setAccountType(accountType);
            account.setAccountOwnerName(accountOwnerName);
            account.setBalance(balance);
        }
        return account;
    }
}
