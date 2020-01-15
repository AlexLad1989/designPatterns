package com.bawag.hive.behavioral.strategy;

public class IronMan implements SuperHero {
    @Override
    public void saveTheWorld() {
        System.out.println("Put on Mask!");
        System.out.println("Put on Costume!");
        System.out.println("Fly to right place!");
        System.out.println("Find Criminal!");
        System.out.println("Kill him!");
        System.out.println("World has been saved!");
    }
}
