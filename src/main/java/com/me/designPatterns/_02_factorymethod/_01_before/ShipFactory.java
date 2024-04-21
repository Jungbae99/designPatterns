package com.me.designPatterns._02_factorymethod._01_before;

import org.springframework.util.StringUtils;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {

        if (!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (!StringUtils.hasText(email)) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        // Customizing for specific name
        if (name.equalsIgnoreCase("whiteship")) {
            ship.setLogo("w");
        } else if (name.equalsIgnoreCase("blackship")) {
            ship.setLogo("b");
        }

        sendEmailTo(email, ship);

        return ship;
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(email + "에게 " + ship + "을 보내는 중");
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 준비중");
    }
}
