package com.me.designPatterns._01_creational_patterns._04_builder._02_after;

import com.me.designPatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {
    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder
                .newInstance()
                .title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "아아")
                .addPlan(0, "식사")
                .getPlan();
    }

    public TourPlan longBeach() {
        return tourPlanBuilder
                .newInstance()
                .title("롱비치")
                .getPlan();
    }



}
