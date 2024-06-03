package com.example.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem10 { public static void main(String[] args) {
    // Example text containing various domain names
    String text = "Visit our website at www.example.com or our blog at blog.example.net. Avoid visiting www.invalidsite.unknown for security reasons.";

    // Regular expression to match domain names
    String regex = "\\b(?:www|blog)\\.[a-zA-Z0-9-]+\\.(com|net)\\b";

    // Compile the regular expression
    Pattern pattern = Pattern.compile(regex);

    // Create a matcher object
    Matcher matcher = pattern.matcher(text);

    // Find and print all matches
    while (matcher.find()) {
        System.out.println("Found domain: " + matcher.group());
    }
}
}