package com.me.designPatterns._03_abstract_factory._02_after;

import com.me.designPatterns._02_factorymethod._02_after.Ship;
import com.me.designPatterns._02_factorymethod._02_after.ShipFactory;
import com.me.designPatterns._02_factorymethod._02_after.WhiteshipFactory;

public class ShipInventory {
    public static void main(String[] args) {

        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
//        System.out.println(ship.getAnchor().getClass());
//        System.out.println(ship.getWheel().getClass());

    }
}
