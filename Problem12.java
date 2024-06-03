package com.example.regex30;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem12 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a string
            System.out.println("Enter a string to check if it contains only alphabetic characters:");
            String inputString = scanner.nextLine();

            // Check if the string contains only alphabetic characters
            boolean isAlphabetic = isOnlyAlphabetic(inputString);

            // Display the result
            if (isAlphabetic) {
                System.out.println("'" + inputString + "' contains only alphabetic characters.");
            } else {
                System.out.println("'" + inputString + "' does not contain only alphabetic characters.");
            }

            scanner.close();
        }

        private static boolean isOnlyAlphabetic(String str) {
            Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
            Matcher matcher = pattern.matcher(str);
            return matcher.matches();
}}
