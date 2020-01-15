package com.bawag.hive.behavioral.strategy;

public class App {

    public static void main(String[] args) {
        String superHeroName = "Batman";
        SuperHero superHero = null;
        switch (superHeroName) {
            case "Batman" : superHero=new Batman();
            break;
            case "IronMan" : superHero=new IronMan();
            break;
            case "Superman" : superHero=new Superman();
        }
        EmergencyDispatcher emergencyDispatcher = new EmergencyDispatcher(superHero);
        emergencyDispatcher.saveTheWorld();
    }





}
