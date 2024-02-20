package com.designpatterns.creational;

import com.designpatterns.creational.factorymethod.JSONMessageCreator;
import com.designpatterns.creational.factorymethod.Message;
import com.designpatterns.creational.factorymethod.MessageCreator;
import com.designpatterns.creational.prototype.Swordsman;
import javafx.geometry.Point3D;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreationalApplication {
    public static void main(String[] args) throws CloneNotSupportedException {
        prototypePatternDemo();
    }

    private static void builderPatternDemo() {

    }

    private static void factoryMethodPatternDemo() {
        MessageCreator messageCreator = new JSONMessageCreator();
        Message message = messageCreator.createMessage();
        System.out.println(message.content());
    }

    private static void prototypePatternDemo() throws CloneNotSupportedException {
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10, 0, 0), 20);
        swordsman.attack();
        System.out.println(swordsman);

        Swordsman s1 = (Swordsman) swordsman.clone();
        System.out.println(s1);
    }
}
