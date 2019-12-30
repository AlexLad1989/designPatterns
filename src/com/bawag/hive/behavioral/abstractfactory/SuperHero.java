package com.bawag.hive.behavioral.abstractfactory;

public class SuperHero {
    private Mask mask;
    private Costume costume;
    private Motto motto;

    public SuperHero(SuperHeroFactory superHeroFactory) {
        this.mask = superHeroFactory.addMask();
        this.costume = superHeroFactory.addCostume();
        this.motto = superHeroFactory.addFear();
    }

    public void create() {
        mask.hideEyes();
        costume.hideBody();
        motto.say();
    }
}
