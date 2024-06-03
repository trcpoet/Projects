package com.example.regex30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem1 {
    public static void main(String[] args) {
        String problem1 = "abcd.135”";
        Pattern pattern = Pattern.compile("[a-zA-Z]+\\.(\\d+)");
        Matcher matcher = pattern.matcher(problem1);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }}