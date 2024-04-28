package com.me.designPatterns._01_creational_patterns._04_builder._01_before;

import com.me.designPatterns._01_creational_patterns._04_builder._02_after.DefaultTourBuilder;
import com.me.designPatterns._01_creational_patterns._04_builder._02_after.TourPlanBuilder;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "아아")
                .addPlan(0, "식사")
                .getPlan();

        TourPlan longBeachTrip = builder.title("롱비치")
                .getPlan();

//        TourPlan shortTrip = new TourPlan();
//        shortTrip.setTitle("오레곤 롱비치 여행");
//        shortTrip.setStartDate(LocalDate.of(2022, 7, 15));
//
//        TourPlan tourPlan = new TourPlan();
//        tourPlan.setTitle("칸쿤 여행");
//        tourPlan.setNights(2);
//        tourPlan.setDays(3);
//        tourPlan.setStartDate(LocalDate.of(2022,12,22));
//        tourPlan.setWhereToStay("리조트");
//        tourPlan.addPlan(0, "체크인 이후 짐풀기");
//        tourPlan.addPlan(0, "저녁 식사");
//        tourPlan.addPlan(1, "조식 뷔페에서 식사");
//        tourPlan.addPlan(1, "해변가 산책");
//        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
//        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
//        tourPlan.addPlan(2, "조식 부페에서 식사");
//        tourPlan.addPlan(2, "체크아웃");



    }
}
