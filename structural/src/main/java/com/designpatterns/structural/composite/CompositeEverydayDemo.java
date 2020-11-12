package com.designpatterns.structural.composite;

import java.util.HashMap;
import java.util.Map;

public class CompositeEverydayDemo {

    public void compositeDemo() {
        Map<String,String> personAttributes = new HashMap<String, String>();
        personAttributes.put("site_role", "person");
        personAttributes.put("access_role", "limited");

        Map<String,String> groupAttributes = new HashMap<String, String>();
        groupAttributes.put("group_role", "claims");

        //Composition
        Map<String,String> securityAttributes = new HashMap<String, String>();
        securityAttributes.putAll(personAttributes);
        securityAttributes.putAll(groupAttributes);

        System.out.println(securityAttributes);
    }
}
