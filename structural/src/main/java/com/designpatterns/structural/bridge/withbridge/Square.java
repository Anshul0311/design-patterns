package com.designpatterns.structural.bridge.withbridge;

public abstract class Square {

    protected Color color;

    public Square(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
