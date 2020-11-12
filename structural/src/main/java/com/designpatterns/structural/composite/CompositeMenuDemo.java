package com.designpatterns.structural.composite;

public class CompositeMenuDemo {
    public void compositeDemo() {
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        mainMenu.add(safetyMenuItem);

        Menu claimsSubMenu = new Menu("Claims", "/claims");
        mainMenu.add(claimsSubMenu);
        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");
        claimsSubMenu.add(personalClaimsMenu);
        System.out.println(mainMenu.toString());
    }
}
