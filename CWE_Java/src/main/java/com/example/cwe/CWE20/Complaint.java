package com.example.cwe.CWE20;

//      CWE-20: Improper Input Validation

public class Complaint {

    public static void main(String[] args){
        double price = 20.00;
        int quantity = getQuantity();

        if(quantity >= 1) {
        double total = price * quantity;
        chargeUser(total);
        }
        else {
            System.out.println("Invalid Quantity!!");
        }

    }

    static void chargeUser(double total) {
        double userBal = 100;
        System.out.println(userBal - total);
    }
    static int getQuantity() {
        return -1;
    }

}
