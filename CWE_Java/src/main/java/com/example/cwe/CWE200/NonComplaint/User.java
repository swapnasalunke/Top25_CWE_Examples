package com.example.cwe.CWE200.NonComplaint;

import java.util.*;

class User {

    private String username;
    private List<String> permissions;

    public User(String username, List<String> permissions) {
        this.username = username;
        this.permissions = permissions;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getPermissions() {
        return Arrays.asList("read:file1","write:file2");
    }
}


