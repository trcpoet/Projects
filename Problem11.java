package com.example.regex30;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the main string
        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();

        // Prompt the user to enter the substring to count
        System.out.println("Enter the substring to count:");
        String substring = scanner.nextLine();

        // Count the occurrences of the substring
        int count = countOccurrences(mainString, substring);

        // Display the result
        System.out.println("The substring '" + substring + "' appears " + count + " times in the main string.");

        scanner.close();
    }

    private static int countOccurrences(String str, String sub) {
        if (sub == null || sub.isEmpty()) {
            return 0;
        }

        // Create a pattern for the substring
        Pattern pattern = Pattern.compile(Pattern.quote(sub));
        Matcher matcher = pattern.matcher(str);

        // Count matches
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
