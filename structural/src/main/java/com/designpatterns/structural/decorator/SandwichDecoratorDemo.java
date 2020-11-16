package com.designpatterns.structural.decorator;

public class SandwichDecoratorDemo {

    public void decoratorDemo() {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }
}
