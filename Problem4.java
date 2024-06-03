package com.example.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem4 {
    public static void main(String[] args) {
        String problem3 = "abcd.135\tuvqz.7\ttzik.888\n";
        Pattern pattern = Pattern.compile("[a-zA-Z]+\\.(\\d+)(?:\\t|\\n)");
        Matcher matcher = pattern.matcher(problem3);

        while (matcher.find()) {
            int startIndex = matcher.start(1); // start index of the digit group
            int endIndex = matcher.end(1) - 1; // end index of the digit group, adjusted to be inclusive
            System.out.println("Start index: " + startIndex + ", End index: " + endIndex);
        }
    }
}
