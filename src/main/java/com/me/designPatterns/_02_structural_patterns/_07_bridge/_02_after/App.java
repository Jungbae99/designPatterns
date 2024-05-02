package com.me.designPatterns._02_structural_patterns._07_bridge._02_after;

import com.me.designPatterns._02_structural_patterns._07_bridge._01_before.Champion;

public class App {
    public static void main(String[] args) {
        Champion kdaAri = new Ari(new KDA());
        kdaAri.skillQ();
        kdaAri.skillW();

        Champion poolPartyAri = new Ari(new PoolParty());
        poolPartyAri.skillR();
        poolPartyAri.skillW();
    }
}
