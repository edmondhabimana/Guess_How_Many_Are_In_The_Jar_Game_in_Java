package com.company;

/**
 * Created by edmon on 1/31/2017.
 */
public class Jar {
    private String name;
    private final int MAX_ITEMS;

    public Jar(String name, int item){
        this.name = name;
        this.MAX_ITEMS = item;
    }

    public int fill(){
        return (int)(Math.random() * MAX_ITEMS) + 1;
    }

    public int getMAX_ITEMS() {
        return MAX_ITEMS;
    }

    public String getName() {
        return name;
    }
}
