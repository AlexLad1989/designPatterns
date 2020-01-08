package com.bawag.hive.creational.builder;

public class SuperHero {
    //Obligatory fields;
    private String name;
    private String slogan;
    private Costume costume;
    private Mask mask;

    //Optional fields;
    private Car car;
    private Coat coat;
    private Fear fear;
    private Shield shield;

    private SuperHero(SuperHeroBuilder builder) {
        this.name=builder.name;
        this.slogan=builder.slogan;
        this.costume=builder.costume;
        this.mask=builder.mask;
        this.car=builder.car;
        this.coat=builder.coat;
        this.fear=builder.fear;
        this.shield=builder.shield;
    }

    public static class SuperHeroBuilder {
        //Obligatory fields;
        private String name;
        private String slogan;
        private Costume costume;
        private Mask mask;

        //Optional fields;
        private Car car;
        private Coat coat;
        private Fear fear;
        private Shield shield;

        public SuperHeroBuilder (String name,String slogan,Costume costume,Mask mask) {
            this.name = name;
            this.slogan = slogan;
            this.costume = costume;
            this.mask = mask;
        }

        public SuperHeroBuilder setCar(Car car) {
            this.car = car;
            return this;
        }

        public SuperHeroBuilder setCoat(Coat coat) {
            this.coat = coat;
            return this;
        }

        public SuperHeroBuilder setFear(Fear fear) {
            this.fear = fear;
            return this;
        }

        public SuperHeroBuilder setShield(Shield shield) {
            this.shield = shield;
            return this;
        }

        public SuperHero build() {
            return new SuperHero(this);
        }
    }

    public SuperHero() {

    }

    public SuperHero(String name, String slogan, Costume costume, Mask mask) {
        this.name = name;
        this.slogan = slogan;
        this.costume = costume;
        this.mask = mask;
    }

    public SuperHero(String name, String slogan, Costume costume, Mask mask, Car car) {
        this.name = name;
        this.slogan = slogan;
        this.costume = costume;
        this.mask = mask;
        this.car = car;
    }
}
