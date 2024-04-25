package com.me.designPatterns._04_builder._02_after;

import com.me.designPatterns._04_builder._01_before.TourPlan;

public class App {
    public static void main(String[] args) {

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();

        System.out.println(tourPlan);
        TourPlan tourPlan1 = director.longBeach();

    }
}
