package com.example.traveleventportal.request;

public record UserRecord(Long userId, String mobileNumber, String email, String password, String fullName) {
    public static boolean hasValidEmail(String email) {
        return email != null && email.contains("@");
    }
}

