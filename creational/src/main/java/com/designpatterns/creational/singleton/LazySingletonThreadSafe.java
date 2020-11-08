package com.designpatterns.creational.singleton;

public class LazySingletonThreadSafe {
    private static volatile LazySingletonThreadSafe instance;

    private LazySingletonThreadSafe() {
        //to prevent from reflection
        if(instance != null) {
            throw new RuntimeException("use getInstance() method to create");
        }
    }

    public static LazySingletonThreadSafe getInstance() {
        if(instance == null) {
            synchronized (LazySingletonThreadSafe.class) {
                if(instance == null) {
                    instance = new LazySingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
