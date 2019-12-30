package com.bawag.hive.behavioral.abstractfactory;

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
    public Motto addFear() {
        return new BatmanMotto();
    }
}
