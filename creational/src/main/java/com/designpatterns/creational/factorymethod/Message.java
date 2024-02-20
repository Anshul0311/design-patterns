package com.designpatterns.creational.factorymethod;

/**
 * This class represents our base product and it can have multiple message subclasses
 * This class is our base product.
 */
public abstract class Message<T> {

    public abstract T content();

    public void encrypt() {

    }

    public void addDefaultHeaders() {

    }
}
