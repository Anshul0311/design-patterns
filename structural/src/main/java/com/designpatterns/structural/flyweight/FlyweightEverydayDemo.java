package com.designpatterns.structural.flyweight;

public class FlyweightEverydayDemo {

    public void flyweightEverydayDemo() {
        Integer first = Integer.valueOf(5);
        Integer second = Integer.valueOf(5);
        Integer third = Integer.valueOf(5);

        System.out.println(System.identityHashCode(first));
        System.out.println(System.identityHashCode(second));
        System.out.println(System.identityHashCode(third));
    }
}
