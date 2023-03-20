package com.example.cwe.CWE125;

//      CWE-125	Out-of-bounds Read

public class NonComplaint {
    public static void main(String[] args) {
        NonComplaint obj = new NonComplaint();
        int[] arr = new int[3];
        System.out.println("Value = " + obj.getValue(arr,arr.length,2));
        System.out.println("Value = " + obj.getValue(arr,arr.length,-2));
    }

    int getValue(int[] arr,int len,int index){
        int value;
        if (index < len) {                        // negative index will cause out of bound

            value = arr[index];
        }
        else {
            System.out.println("Invalid index " + index);
            value = -1;
        }
        return value;
    }
}