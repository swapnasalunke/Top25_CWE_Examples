package com.example.cwe.CWE306.NonComplaint;

//      CWE-306: Missing Authentication for Critical Function

public class NonComplaint {
    public static void main(String[] args) {
        BankAccount user1 = createBankAccount("123","saving","Owner",300);
        user1.getOwnerName();
    }

    public static BankAccount createBankAccount(String accountNumber, String accountType,
                                                String accountOwnerName, double balance) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(accountNumber);
        account.setAccountType(accountType);
        account.setAccountOwnerName(accountOwnerName);
        account.setBalance(balance);

        return account;
    }

}
