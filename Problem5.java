package com.example.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem5 {
    public static void main(String[] args) {
        String problem4 = "{0, 2}, {0, 7}, {1, 3}, {2, 4}";
        Pattern pattern = Pattern.compile("\\{([^}]+)\\}");
        Matcher matcher = pattern.matcher(problem4);

        while (matcher.find()) {
            System.out.println(matcher.group(1)); // prints the content within each set of curly braces
        }
    }
}
