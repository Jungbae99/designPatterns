package com.me.designPatterns._01_creational_patterns._02_factorymethod._02_after;

import com.me.designPatterns._01_creational_patterns._03_abstract_factory._01_before.DefaultShipFactory;
import com.me.designPatterns._01_creational_patterns._03_abstract_factory._02_after.ShipPartsFactory;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
