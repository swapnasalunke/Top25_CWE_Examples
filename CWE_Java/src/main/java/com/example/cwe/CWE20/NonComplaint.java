package com.example.cwe.CWE20;

//      CWE-20: Improper Input Validation

public class NonComplaint {

    public static void main(String[] args){
        double price = 20.00;
        int quantity = getQuantity();

        //  Quantity is not validated for negative values which may cause User account credited
        //  instead of debited

        double total = price * quantity;

        chargeUser(total);
    }

    static void chargeUser(double total) {
        double userBal = 100;
        System.out.println(userBal - total);
    }
    static int getQuantity() {
        return -1;
    }

}
