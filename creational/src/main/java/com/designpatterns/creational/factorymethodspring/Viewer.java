package com.designpatterns.creational.factorymethodspring;

public interface Viewer<T> {

    ViewerType getType();

    void view(T object);

}
