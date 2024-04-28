package com.me.designPatterns._02_structural_patterns._06_adapter._04_mine;

public class Phone {
    public static void main(String[] args) {

        AppleCable appleCable = new AppleCTypeCable();
        appleCable.connect();

        appleCable = new Adapter(new SamsungCTypeCable());
        appleCable.connect();

    }
}
