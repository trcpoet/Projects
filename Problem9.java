package com.example.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem9 {
    public static void main(String[] args) {
        // Test URLs
        String[] testURLs = {
                "https://www.example.com:8080/path/to/page.html",
                "http://www.example.net/index.html",
                "https://blog.example.com/category/news/",
                "https://www.example.edu/about-us/team.html",
                "ftp://invalid-protocol.com", // Invalid example
                "http://invalid_domain.com" // Invalid example
        };

        for (String url : testURLs) {
            System.out.println("Is '" + url + "' a valid URL? " + (isValidURL(url) ? "Valid URL" : "Invalid URL"));
        }
    }

    private static boolean isValidURL(String url) {
        String regex = "^(http://|https://)[a-zA-Z0-9-\\.]+(:[0-9]+)?(/.*)?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}
