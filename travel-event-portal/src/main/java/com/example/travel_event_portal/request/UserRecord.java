package com.example.travel_event_portal.request;

public record UserRecord(Long userId, String mobileNumber, String email, String password, String fullName) {
    public static boolean hasValidEmail(String email) {
        return email != null && email.contains("@");
    }
}

