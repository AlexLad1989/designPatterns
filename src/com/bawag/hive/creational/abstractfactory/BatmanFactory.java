package com.bawag.hive.creational.abstractfactory;

public class BatmanFactory implements SuperHeroFactory {

    @Override
    public Mask addMask() {
        return new BatmanMask();
    }

    @Override
    public Costume addCostume() {
        return new BatmanCostume();
    }

    @Override
    public Motto addMotto() {
        return new BatmanMotto();
    }
}
