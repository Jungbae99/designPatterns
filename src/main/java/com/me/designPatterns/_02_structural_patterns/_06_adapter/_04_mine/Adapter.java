package com.me.designPatterns._02_structural_patterns._06_adapter._04_mine;

public class Adapter implements AppleCable {

    private final SamsungCable samsungCable;

    public Adapter(SamsungCable samsungCable) {
        this.samsungCable = samsungCable;
    }

    @Override
    public void connect() {
        System.out.println("어댑터를 사용해서 변환");
        samsungCable.connect();
    }
}
