package com.me.designPatterns._02_structural_patterns._06_adapter._04_mine;

public class AppleCTypeCable implements AppleCable {
    @Override
    public void connect() {
        System.out.println("애플 C type 연결됨");
    }
}
