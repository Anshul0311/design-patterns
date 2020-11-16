package com.designpatterns.structural.flyweight;

public class FlyweightDemo {

    public void flyweightDemo() {
        InventorySystem inventorySystem = new InventorySystem();
        inventorySystem.takeOrder("Bose Headphones", 35);
        inventorySystem.takeOrder("Bose Headphones", 340);
        inventorySystem.takeOrder("Samsung TV", 455);
        inventorySystem.takeOrder("Samsung TV", 390);

        inventorySystem.processOrder();
        inventorySystem.report();
    }
}
