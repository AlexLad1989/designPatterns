package com.bawag.hive.creational.abstractfactory;

public class SuperHero {
    private Mask mask;
    private Costume costume;
    private Motto motto;

    public SuperHero(SuperHeroFactory superHeroFactory) {
        this.mask = superHeroFactory.addMask();
        this.costume = superHeroFactory.addCostume();
        this.motto = superHeroFactory.addMotto();
    }

    public void create() {
        mask.hideEyes();
        costume.hideBody();
        motto.say();
    }
}
