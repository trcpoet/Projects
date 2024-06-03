package com.example.finalexam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^(\\d+) divided by (\\d+)$");
        Matcher matcher = pattern.matcher("10 divided by 2");

        if (matcher.find()){
            String simplified = "result " + matcher.replaceFirst("$1/$2");
            System.out.println(simplified);
            int result = Integer.valueOf(matcher.group(1)) / Integer.valueOf(matcher.group(2));
            System.out.println(result);
        }



        }
    }
