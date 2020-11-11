package com.designpatterns.structural.bridge.withbridge;

public abstract  class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
