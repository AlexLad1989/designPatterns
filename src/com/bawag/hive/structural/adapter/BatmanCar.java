package com.bawag.hive.structural.adapter;

public class BatmanCar {
    private Batman batman;

    public BatmanCar(Batman batman) {
        this.batman = batman;
    }

    public void move() {
        System.out.println("Let's Go");
    }
}
