package com.example.cwe.CWE476;

//  CWE-476: NULL Pointer Dereference

public class NonComplaint {
    public static void main(String[] arg) {
    String name = getName();

    if(name.length()>0)                 // length function is called on a null variable
        System.out.println(name);
    }

    public static String getName(){
        return null;
    }
}
