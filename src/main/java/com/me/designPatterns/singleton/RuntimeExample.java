package com.me.designPatterns.singleton;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

public class RuntimeExample {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }



}
