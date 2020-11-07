package com.designpatterns.creational.singleton;

/**
 * description : Runtime is a singleton class of Java
 */

public class RuntimeSingletonDemo {
    public void runtimeDemo() {
        Runtime runtimeInstanceOne = Runtime.getRuntime();
        runtimeInstanceOne.gc();
        System.out.println(runtimeInstanceOne);
        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);
        if(runtimeInstanceOne == anotherInstance) {
            System.out.println("They are same instance");
        }
    }
}
