package com.me.designPatterns._04_builder._03_java;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String result = sb.append("whiteship").append("korean").toString();
        System.out.println(result);
    }
}
