package com.me.designPatterns._02_structural_patterns._07_bridge._01_before;

public class 정복자아리 implements Champion {
    @Override
    public void move() {
        System.out.println("정복자아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("정복자아리 q");
    }

    @Override
    public void skillW() {
        System.out.println("정복자아리 w");
    }

    @Override
    public void skillE() {
        System.out.println("정복자아리 e");
    }

    @Override
    public void skillR() {
        System.out.println("정복자아리 r");
    }

    @Override
    public String getName() {
        return null;
    }
}
