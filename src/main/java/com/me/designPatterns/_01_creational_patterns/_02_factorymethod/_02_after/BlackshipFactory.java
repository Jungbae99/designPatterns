package com.me.designPatterns._01_creational_patterns._02_factorymethod._02_after;

import com.me.designPatterns._01_creational_patterns._03_abstract_factory._01_before.DefaultShipFactory;

public class BlackshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
