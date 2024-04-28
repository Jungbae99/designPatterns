package com.me.designPatterns._01_creational_patterns._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        Settings settings = Settings.INSTANCE;

        // 1. 리플렉션 사용하기
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();

        // 2. 직렬화 & 역직렬화
        Settings settings2 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obs"))){
            out.writeObject(settings);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (Settings) in.readObject();
        }

        System.out.println(settings1 == settings);
    }
}
