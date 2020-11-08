package com.designpatterns.creational.factory;

import java.util.Calendar;

/**
 * @author anshulkapoor
 * description : Calendar class uses factory design pattern
 */
public class CalendarDemo {
    public void calendarDemo() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
