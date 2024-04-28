package com.me.designPatterns._02_structural_patterns._06_adapter._04_mine;

public class SamsungCTypeCable implements SamsungCable {
    @Override
    public void connect() {
        System.out.println("삼성 CType 연결됨");
    }
}
