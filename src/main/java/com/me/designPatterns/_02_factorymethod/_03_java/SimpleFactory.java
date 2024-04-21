package com.me.designPatterns._02_factorymethod._03_java;

import com.me.designPatterns._02_factorymethod._02_after.Blackship;
import com.me.designPatterns._02_factorymethod._02_after.Whiteship;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")){
            return new Blackship();
        }

        throw new IllegalArgumentException("없어요");
    }

}
