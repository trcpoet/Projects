package com.example.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {
    public static void main(String[] args) {
        String originalString = "Apple, Quince, and Raspberry are fruits.";
        String modifiedString = removeSpecificLetters(originalString);
        System.out.println("Original String: " + originalString );
        System.out.println("Modified String: " + modifiedString);

        Pattern pattern = Pattern.compile("[pqr]");
        Matcher matcher = pattern.matcher("Apple, Quince, and Raspberry are fruits.");
        if(matcher.find()){
            System.out.println(matcher.group());
        }
    }

    private static String removeSpecificLetters(String str) {
        if (!str.matches(".*[pqr].*")) {
            return "Not found.";
        }
        return str.replaceAll("[pqr]", "");
    }

