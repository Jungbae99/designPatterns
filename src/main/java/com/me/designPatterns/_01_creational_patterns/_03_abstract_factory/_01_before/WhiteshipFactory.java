package com.me.designPatterns._01_creational_patterns._03_abstract_factory._01_before;

import com.me.designPatterns._01_creational_patterns._02_factorymethod._02_after.Ship;
import com.me.designPatterns._01_creational_patterns._02_factorymethod._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        return ship;
    }
}
