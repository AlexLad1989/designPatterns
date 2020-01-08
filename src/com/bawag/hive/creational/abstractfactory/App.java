package com.bawag.hive.creational.abstractfactory;


public class App {

    public static void main(String[] args) {
        SuperHero batMan = new SuperHero(new BatmanFactory());
        batMan.create();
        SuperHero superMan = new SuperHero(new SupermanFactory());
        superMan.create();

    }
}
