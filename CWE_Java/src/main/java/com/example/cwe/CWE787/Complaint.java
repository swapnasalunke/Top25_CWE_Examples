package com.example.cwe.CWE787;

//      CWE-787: Out-of-bounds Write

import java.util.Scanner;

public class Complaint {
    public static void main(String[] args) {

        int[] arr = new int[3];

        Scanner sc= new Scanner(System.in);
        for(int i = 0;i<=3;i++) {
            arr[i] = sc.nextInt();           // arr[3] is out of bounds
        }

        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);

    }
}