package com.example.cwe.CWE416;

//      CWE-416: Use After Free

public class NonComplaint {
    public static void main(String[] args) {

        NonComplaint obj = new NonComplaint();
        obj.getStatus();
        obj = null;
        System.gc();
        obj.getStatus();    // obj is used after it is free

    }

    void getStatus(){
    System.out.println("Method of NonComplaint Class");
    }

}