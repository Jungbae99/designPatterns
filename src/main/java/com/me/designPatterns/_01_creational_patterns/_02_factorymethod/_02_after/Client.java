package com.me.designPatterns._01_creational_patterns._02_factorymethod._02_after;

import com.me.designPatterns._01_creational_patterns._03_abstract_factory._02_after.WhiteshipFactory;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "keesun@mail.com");
        client.print(new BlackshipFactory(), "blackship", "keesun@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
