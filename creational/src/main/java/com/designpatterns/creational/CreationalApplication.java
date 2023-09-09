package com.designpatterns.creational;

import com.designpatterns.creational.singleton.RuntimeSingletonDemo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreationalApplication {
    public static void main(String[] args) {

        new RuntimeSingletonDemo().runtimeDemo();
    }

    private static void builderPatternDemo() {

    }
}
