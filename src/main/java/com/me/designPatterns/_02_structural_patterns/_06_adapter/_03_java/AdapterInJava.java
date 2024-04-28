package com.me.designPatterns._02_structural_patterns._06_adapter._03_java;

import java.io.*;
import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {

        // 배열을 넘겼지만, return은 List
        List<String> strings = Arrays.asList("a", "b", "c");

        /**
         * 이 코드는 클라이언트
         * strings -> Adaptee
         * enumeration() -> Adapter
         * Enumeration -> Target
         */
        Enumeration<String> enumeration = Collections.enumeration(strings);

        ArrayList<String> list = Collections.list(enumeration);

        // io
        try (InputStream is = new FileInputStream("input.txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader reader = new BufferedReader(isr)) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
