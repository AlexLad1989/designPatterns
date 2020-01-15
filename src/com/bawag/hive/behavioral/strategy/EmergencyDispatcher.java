package com.bawag.hive.behavioral.strategy;

public class EmergencyDispatcher {
    private SuperHero superHero;

    public EmergencyDispatcher(SuperHero superHero) {
        this.superHero = superHero;
    }

    public void setSuperHero(SuperHero superHero) {
        this.superHero = superHero;
    }

    public void saveTheWorld() {
        superHero.saveTheWorld();
    }
}
