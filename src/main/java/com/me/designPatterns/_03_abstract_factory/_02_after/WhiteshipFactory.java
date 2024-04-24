package com.me.designPatterns._03_abstract_factory._02_after;

import com.me.designPatterns._02_factorymethod._02_after.Ship;
import com.me.designPatterns._02_factorymethod._02_after.Whiteship;
import com.me.designPatterns._03_abstract_factory._01_before.DefaultShipFactory;

public class WhiteshipFactory extends DefaultShipFactory {


    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        return ship;
    }
}
