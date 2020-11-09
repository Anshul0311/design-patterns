package com.designpatterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterJavaApiDemo {
    public void adapterDemo() {
        Integer[] arr = new Integer[] {1,2,3,4,5};
        List<Integer> integerList = Arrays.asList(arr);
        System.out.println(arr);
        System.out.println(integerList);
    }
}
