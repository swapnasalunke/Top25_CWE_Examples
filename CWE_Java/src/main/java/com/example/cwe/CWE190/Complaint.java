package com.example.cwe.CWE190;

//      CWE-190: Integer Overflow or Wraparound

public class Complaint {
    public static void main(String[] arg) {
        int x = 50;
        long result = 1;        // long can store value greater than MAX value of integer

        for (int i = 1; i < x; i++) {
            result = result * i;

        }
        System.out.println(result);
    }
}
