package com.example.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem8 {
    public static void main(String[] args) {
        // Test email addresses
        String[] testEmails = {
                "abc.123@gmail.com",
                "78_Ty@gmail.com",
                "abc-34@gmail.com",
                "_%+-23Fg@gmail.com", // This one is actually invalid due to the '%' character.
                "invalid@gmail", // Invalid example
                "another.invalid@example.com" // Invalid example
        };

        for (String email : testEmails) {
            System.out.println("Is '" + email + "' a valid Gmail address? " + isValidGmail(email));
        }
    }

    private static boolean isValidGmail(String email) {
        String regex = "^[a-zA-Z0-9]+[\\w\\.\\-+]*[a-zA-Z0-9]+@gmail\\.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }}

