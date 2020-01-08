package com.bawag.hive.structural.adapter;

import com.bawag.hive.creational.builder.Coat;
import com.bawag.hive.creational.builder.Costume;
import com.bawag.hive.creational.builder.Mask;

public class Batman {
    private Mask mask;
    private Costume costume;
    private Coat coat;

    public Batman() {
    }

    public Batman(Mask mask, Costume costume, Coat coat) {
        this.mask = mask;
        this.costume = costume;
        this.coat = coat;
    }
}
