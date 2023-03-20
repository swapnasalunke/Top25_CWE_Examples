package com.example.cwe.CWE862.Complaint;
import java.util.Arrays;

//      CWE-862	Missing Authorization

public class Complaint {

    // Method that requires authorization
    public void sensitiveOperation(User user, String resource) {
        // Check if user is authorized to access the resource
        if (user.getPermissions().contains(resource)) {
            System.out.println("Safe Operation:: "+resource);
        } else {
            throw new UnauthorizedAccessException("User is not authorized to access the resource.");
        }
    }

    // Example usage
    public static void main(String[] args) {
        User user = new User("johndoe", Arrays.asList("read:file1", "write:file2"));
        Complaint service = new Complaint();
        try {
            service.sensitiveOperation(user, "read:file1");
        } catch (UnauthorizedAccessException ex) {
            // Handle unauthorized access exception
            // ...
        }
    }
}




