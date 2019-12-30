package com.bawag.hive.behavioral.abstractfactory;

public class SupermanFactory implements SuperHeroFactory {

    @Override
    public Mask addMask() {
        return new SupermanMask();
    }

    @Override
    public Costume addCostume() {
        return new SupermanCostume();
    }

    @Override
    public Motto addFear() {
        return new SupermanMotto();
    }
}
