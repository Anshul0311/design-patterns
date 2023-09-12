package com.designpatterns.creational.singleton;

/**
 * Before JDK 1.5 support for volatile keyword was not there.
 * So there is another way of implementing LazySingleton using : Lazy Initialization Holder Idiom
 * Using this pattern , we don't need to worry about thread synchronization
 */
public class LazySingletonThreadSafeV2 {

    private LazySingletonThreadSafeV2() {
    }

    /**
     * Here , INSTANCE will only be initialised when the classloader loads this inner class
     * and it will be loaded only when getInstance() method will be called since its a private inner class
     * nobody can access it from outside.
     */
    private static class RegistryHolder {
        static LazySingletonThreadSafeV2 INSTANCE = new LazySingletonThreadSafeV2();
    }

    public static LazySingletonThreadSafeV2 getInstance() {
        return RegistryHolder.INSTANCE;
    }
}
