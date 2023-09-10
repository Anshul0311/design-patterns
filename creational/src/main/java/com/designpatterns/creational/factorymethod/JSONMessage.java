package com.designpatterns.creational.factorymethod;

public class JSONMessage extends Message {

    @Override
    public String content() {
        return "This represents a json content";
    }
}
