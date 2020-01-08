package com.bawag.hive.structural.adapter;

public class SupermanBatmanCarAdapter extends Batman {


    public SupermanBatmanCarAdapter(Superman superman) {
        super(new BatmanMask(),superman.getCostume(),superman.getCoat());
    }
}
