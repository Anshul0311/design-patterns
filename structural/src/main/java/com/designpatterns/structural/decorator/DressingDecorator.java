package com.designpatterns.structural.decorator;

public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() + addDessing();
    }

    private String addDessing() {
        return " + mustard";
    }

}
