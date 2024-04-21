package com.me.designPatterns._02_factorymethod._02_after;

import org.springframework.util.StringUtils;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();

        sendEmailTo(email, ship);
        return ship;
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    };

    Ship createShip();

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }


    private void validate(String name, String email) {
        if (!StringUtils.hasText(name)) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (!StringUtils.hasText(email)) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

}
