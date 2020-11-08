package com.designpatterns.creational.abstractfactorydemo;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class DocumentBuiilderDemo {

    public void abstractFactoryDemo() {
        try {
            String xml = "<document><body><stock>AAPL</stock></body></document>";
            InputStream bais = new ByteArrayInputStream(xml.getBytes());
            DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder factory = abstractFactory.newDocumentBuilder();
            Document document = factory.parse(bais);

            document.getDocumentElement().normalize();

            System.out.println(document.getDocumentElement().getNodeName());
            System.out.println(factory.getClass());
            System.out.println(abstractFactory.getClass());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
