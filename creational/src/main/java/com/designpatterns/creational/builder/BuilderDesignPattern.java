package com.designpatterns.creational.builder;

import com.designpatterns.behavioral.DesignPatternStrategy;

public class BuilderDesignPattern implements DesignPatternStrategy {

    @Override
    public void implementDesignPattern() {
        LunchOrder lunchOrder = LunchOrder.builder()
                .bread("White Bread")
                .meat("Meat")
                .build();
    }
}
