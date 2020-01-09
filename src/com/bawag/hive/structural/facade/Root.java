package com.bawag.hive.structural.facade;

public class Root {
    private District currentDistrict;
    private District destinationDistrict;

    public Root(District currentDistrict, District destinationDistrict) {
        this.currentDistrict = currentDistrict;
        this.destinationDistrict = destinationDistrict;
    }
}
