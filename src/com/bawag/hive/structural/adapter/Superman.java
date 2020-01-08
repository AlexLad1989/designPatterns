package com.bawag.hive.structural.adapter;

import com.bawag.hive.creational.builder.Coat;
import com.bawag.hive.creational.builder.Costume;

public class Superman {
    private Costume costume;
    private Coat coat;

    public Superman(Costume costume, Coat coat) {
        this.costume = costume;
        this.coat = coat;
    }

    public Costume getCostume() {
        return costume;
    }

    public Coat getCoat() {
        return coat;
    }
}
