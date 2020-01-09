package com.bawag.hive.structural.facade;

public class District {
    private City city;
    private String name;

    public District(City city,String name) {
        this.city = city;
        this.name=name;
    }

    public City getCity() {
        return city;
    }

    public String getName() {
        return name;
    }
}
