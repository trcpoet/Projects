package com.example.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem3 {
        public static void main(String[] args) {
            String problem3 = "abcd.135\tuvqz.7\ttzik.888\n";
            Pattern pattern = Pattern.compile("[a-zA-Z]+\\.(\\d+)(?:\\t|\\n)");
            Matcher matcher = pattern.matcher(problem3);

            while (matcher.find()) {
                System.out.println(matcher.group(1)); // prints the digits part of each match
            }
        }
    }

