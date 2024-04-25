package com.me.designPatterns._04_builder._01_before;

public class DetailPlan {

    int day;

    String plan;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getPlan() {
        return plan;
    }

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

}
