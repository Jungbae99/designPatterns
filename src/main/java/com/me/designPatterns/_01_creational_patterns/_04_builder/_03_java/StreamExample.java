package com.me.designPatterns._01_creational_patterns._04_builder._03_java;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream<String> names = Stream.<String>builder().add("korean").add("whiteship").build();
        names.forEach(System.out::println);


    }
}
