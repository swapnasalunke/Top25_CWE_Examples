package com.example.cwe.CWE200.NonComplaint;
import java.util.*;

//      CWE-200: Exposure of Sensitive Information to an Unauthorized Actor

public class NonComplaint {

        // Method that requires authorization
        public void sensitiveOperation(User user, String resource) {
            // Check if user is authorized to access the resource
            if (user.getPermissions().contains(resource)) {
                System.out.println("Safe Operation:: "+resource);
            } else {

                // user details are exposed in error message

                throw new UnauthorizedAccessException("User is not authorized to access the " +
                        "resource." + user);
            }
        }

        // Example usage
        public static void main(String[] args) {
            User user = new User("johndoe", Arrays.asList("read:file1", "write:file2"));
            NonComplaint service = new NonComplaint();
            try {
                service.sensitiveOperation(user, "read:file1");
            } catch (UnauthorizedAccessException ex) {
                // Handle unauthorized access exception
                // ...
            }
        }

}
