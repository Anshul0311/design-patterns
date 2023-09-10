package com.designpatterns.creational.factorymethod;

public class TextMessage extends Message {

    @Override
    public String content() {
        return "Text Content";
    }
}
