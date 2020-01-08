package com.bawag.hive.structural.adapter;

public class App {
    public static void main(String[] args) {
        Batman batman = new Batman(new BatmanMask(), new BatmanCostume(),new BatmanCoat());
        BatmanCar batmanCar = new BatmanCar(batman);
        batmanCar.move();

        Superman superman = new Superman(new SupermanCostume(),new SupermanCoat());
        //BatmanCar batmanCar1 = new BatmanCar(superman);
        SupermanBatmanCarAdapter supermanBatmanCarAdapter = new SupermanBatmanCarAdapter(superman);
        BatmanCar batmanCar1 = new BatmanCar(supermanBatmanCarAdapter);
        batmanCar1.move();
    }
}
