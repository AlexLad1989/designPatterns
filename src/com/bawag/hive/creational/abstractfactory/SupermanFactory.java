package com.bawag.hive.creational.abstractfactory;

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
    public Motto addMotto() {
        return new SupermanMotto();
    }
}
