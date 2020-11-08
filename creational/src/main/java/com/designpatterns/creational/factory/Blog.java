package com.designpatterns.creational.factory;

public class Blog extends Website {

    public void createWebsite() {
        pages.add(new SearchPage());
    }
}
