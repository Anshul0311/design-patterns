package com.designpatterns.creational.factorymethod;

public class JSONMessage extends Message<String> {

    @Override
    public String content() {
        return "This represents a json content";
    }
}
