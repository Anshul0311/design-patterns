package com.designpatterns.creational.simplefactory;

/**
 * This is not exactly a design pattern. It just return a class which initiates object based on some type
 * Example of simple factory : getInstance method of java.text.NumberFormat class
 */
public class PostFactory {

    public static Post getPost(String type) {
        switch (type) {
            case "blog":
                return new BlogPost();
            case "news":
                return new NewsPost();
            case "Product":
                return new ProductPost();
            default:
                throw new IllegalArgumentException("This type is not supported");
        }
    }
}
