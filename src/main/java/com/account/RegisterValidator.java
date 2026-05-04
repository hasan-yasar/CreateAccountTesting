package com.account;

public class RegisterValidator {

    public boolean isValidFirstName(String firstName) {

        if (firstName == null || firstName.trim().isEmpty()) {
            return false;
        }

        if (firstName.length() < 2 || firstName.length() > 20) {
            return false;
        }

        return firstName.matches("[a-zA-Z]+");
    }

    public boolean isValidLastName(String lastName) {

        if (lastName == null || lastName.trim().isEmpty()) {
            return false;
        }

        if (lastName.length() < 2 || lastName.length() > 20) {
            return false;
        }

        return lastName.matches("[a-zA-Z]+");
    }

    public boolean isValidEmail(String email) {

        if (email == null || email.trim().isEmpty()) {
            return false;
        }

        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }

    public boolean isValidPassword(String password) {

        if (password == null || password.trim().isEmpty()) {
            return false;
        }

        return password.length() >= 8 && password.length() <= 20;
    }

    public boolean passwordsMatch(String password, String confirmPassword) {

        if (password == null || confirmPassword == null) {
            return false;
        }

        return password.equals(confirmPassword);
    }

    public boolean isValidDateOfBirth(String dob) {

        if (dob == null || dob.trim().isEmpty()) {
            return false;
        }

        if (!dob.matches("\\d{2}/\\d{2}/\\d{4}")) {
            return false;
        }

        String[] parts = dob.split("/");

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        if (day < 1 || day > 31) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        if (year < 1900 || year > 2026) {
            return false;
        }

        return true;
    }
}