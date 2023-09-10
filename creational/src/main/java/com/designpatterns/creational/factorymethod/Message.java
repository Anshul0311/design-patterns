package com.designpatterns.creational.factorymethod;

/**
 * This class represents our base product and it can have multiple message subclasses
 * This class is our base product.
 */
public abstract class Message {

    public abstract String content();

    public void encrypt() {

    }

    public void addDefaultHeaders() {

    }
}
