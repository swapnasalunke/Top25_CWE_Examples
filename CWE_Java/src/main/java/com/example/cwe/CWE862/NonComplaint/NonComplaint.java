package com.example.cwe.CWE862.NonComplaint;

import java.util.*;

//      CWE-862: Missing Authorization

public class NonComplaint {

    // Method that requires authorization
    public void sensitiveOperation(User user, String resource) {
        System.out.println("Unsafe Operation::"+resource);
    }

    // Example usage
    public static void main(String[] args) {
        User user = new User("user", Arrays.asList("read:file1", "write:file2"));
        NonComplaint service = new NonComplaint();
        service.sensitiveOperation(user, "write:file1");
    }
}




