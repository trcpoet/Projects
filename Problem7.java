package com.example.regex30;

public class Problem7 { public static void main(String[] args) {
    String testString1 = "Test123";
    String testString2 = "Test!@#";

    System.out.println("Does '" + testString1 + "' contain only a-z, A-Z, 0-9? " + containsOnlySpecificChars(testString1));
    System.out.println("Does '" + testString2 + "' contain only a-z, A-Z, 0-9? " + containsOnlySpecificChars(testString2));
}

    private static boolean containsOnlySpecificChars(String str) {
        return str.matches("^[a-zA-Z0-9]+$");
    }
}
