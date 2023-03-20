package com.example.cwe.CWE798;
import java.io.*;
import java.util.*;


//      CWE-798: Use of Hard-coded Credentials

public class Complaint {

    public static void main(String[] arg) throws IOException {
    String passInvalid = "InvalidPassword";
    System.out.println(validatePassword(passInvalid));

    String passValid = "Admin";
    System.out.println(validatePassword(passValid));

    }

    private static String validatePassword(String password) throws IOException {
        FileInputStream input = new FileInputStream("src/main/resources/config.properties");
        Properties prop = new Properties();
        prop.load(input);
        final String key = prop.getProperty("password");
        if(password.equals(key)){
            return "Access Granted";
        }
        return "Access Denied";
    }
}
