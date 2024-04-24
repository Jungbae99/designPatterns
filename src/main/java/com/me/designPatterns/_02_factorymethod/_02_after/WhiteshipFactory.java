package com.me.designPatterns._02_factorymethod._02_after;

import com.me.designPatterns._03_abstract_factory._01_before.DefaultShipFactory;
import com.me.designPatterns._03_abstract_factory._02_after.ShipPartsFactory;
import com.me.designPatterns._03_abstract_factory._02_after.WhitePartsProFactory;

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
