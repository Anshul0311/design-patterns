package com.designpatterns.creational.factory;

public class Shop extends Website {

    public void createWebsite() {
        pages.add(new CartPage());
    }
}
