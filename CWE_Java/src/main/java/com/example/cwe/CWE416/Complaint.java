package com.example.cwe.CWE416;

//      CWE-416: Use After Free

public class Complaint {
    public static void main(String[] args) {

        Complaint obj = new Complaint();
        obj.getStatus();
        obj = null;
        System.gc();

        if(obj!=null)
        {
            obj.getStatus();
        }

        System.out.println("Object is null");   // obj is used after it is free

    }

    void getStatus(){
        System.out.println("Method of Complaint Class");
    }

}