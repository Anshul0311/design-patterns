package com.designpatterns.structural.bridge.withoutbridge;

public class WithoutBridgeDemo {
    public void withoutBridgeDemo() {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        circle.applyColor();
        square.applyColor();

        // Now the problem with this pattern is with more shapes and colors , we are creating more classes
    }
}
