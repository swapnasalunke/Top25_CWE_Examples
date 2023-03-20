package com.example.cwe.CWE125;

public class Complaint {
    public static void main(String[] args) {
        Complaint obj = new Complaint();
        int[] arr = new int[3];
        System.out.println("Value = " + obj.getValue(arr,arr.length,2));
        System.out.println("Value = " + obj.getValue(arr,arr.length,-2));
    }

    int getValue(int[] arr,int len,int index){
        int value;

        if (index >= 0 && index < len) {        // Checking max and min value for index

            value = arr[index];
        }
        else {
            value = -1;
        }
        return value;
    }
}
