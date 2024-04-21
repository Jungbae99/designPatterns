package com.me.designPatterns._02_factorymethod._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = new WhiteshipFactory().orderShip("whiteship", "keesun@mail.com");

        System.out.println(whiteship);

        Ship blackship = new BlackshipFactory().orderShip("blackship", "keesun@mail.com");

        System.out.println(blackship);
    }
}
