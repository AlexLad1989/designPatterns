package com.bawag.hive.structural.facade;

import com.bawag.hive.structural.adapter.BatmanCar;

public class Action {
    private Root root;
    private BatmanCar batmanCar;
    private Evil evil;

    public Action(Root root, BatmanCar batmanCar, Evil evil) {
        this.root = root;
        this.batmanCar = batmanCar;
        this.evil = evil;
    }

    public void attackEvil() {
        System.out.println("The evil has been destroyed");
    }
}
