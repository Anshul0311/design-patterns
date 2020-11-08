package com.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String,Item> items = new HashMap<String, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(5.00);
        movie.setRuntime("2.5");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setPrice(10);
        book.setNumberOfPages(335);
        items.put("Book",book);
    }
}
