package com.designpatterns.structural.decorator;

import java.io.*;

public class EverydayDecoratorDemo {

    public void decoratorDemo() {
        try {
            File file = new File("./test.txt");
            file.createNewFile();

            OutputStream outputStream = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeChars("test");
            dataOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
