package com.bawag.hive.structural.facade;

import com.bawag.hive.structural.adapter.*;

public class SuperHeroFacade {
    public void saveTheWorld() {
        City city = new City("New York");
        District district = new District(city,"1");
        District district2 = new District(city,"2");
        Batman batman = new Batman(new BatmanMask(), new BatmanCostume(),new BatmanCoat());
        Superman superman = new Superman(new SupermanCostume(),new SupermanCoat());
        BatmanCar batmanCar = new BatmanCar(batman);
        Root root = new Root(district,district2);
        Evil evil = new Joker();
        Action action = new Action(root,batmanCar,evil);
        action.attackEvil();
    }
}
