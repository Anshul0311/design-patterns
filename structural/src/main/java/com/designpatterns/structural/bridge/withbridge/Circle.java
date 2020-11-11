package com.designpatterns.structural.bridge.withbridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    public void applyColor() {
        color.applyColor();
    }
}
