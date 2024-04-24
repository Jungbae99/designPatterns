package com.me.designPatterns._03_abstract_factory._01_before;

import com.me.designPatterns._02_factorymethod._02_after.Ship;
import com.me.designPatterns._02_factorymethod._02_after.ShipFactory;

public abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

}
