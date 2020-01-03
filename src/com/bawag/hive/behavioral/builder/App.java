package com.bawag.hive.behavioral.builder;

public class App {

    public static void main(String[] args) {
        //Constructors examples
        //SuperHero superHero = new SuperHero("Batman","I'm Batman",new Costume(),new Mask(),new Car());
        //SuperHero ironMan = new SuperHero("Iron Man","I'm Iron Man",new Costume(),new Mask(),new Car());

        SuperHero batman = new SuperHero
                .SuperHeroBuilder("Batman","I'm the Batman",new Costume(), new Mask())
                .setCar(new Car())
                .setCoat(new Coat())
                .build();

        SuperHero ironMan = new SuperHero
                .SuperHeroBuilder("Iron Man","I'm the Iron Man",new Costume(), new Mask())
                .build();

        SuperHero captainAmerica = new SuperHero
                .SuperHeroBuilder("Captain America","I'm the Captain America",new Costume(), new Mask())
                .setShield(new Shield())
                .build();

        SuperHero superMan = new SuperHero
                .SuperHeroBuilder("Super Man","I'm the Super Man",new Costume(), new Mask())
                .setFear(new Fear())
                .build();
    }
}
