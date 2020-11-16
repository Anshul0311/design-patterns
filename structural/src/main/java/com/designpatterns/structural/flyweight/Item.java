package com.designpatterns.structural.flyweight;

//Instances of the Item will be flyweight
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
