package com.designpatterns.behavioral.strategywithoutspring;

import java.util.List;

/**
 * This is the context class for strategy design pattern. It uses strategy object that is injected from the client
 */
public class PrinterService {

    private OrderPrinter orderPrinter;

    public PrinterService(OrderPrinter orderPrinter) {
        this.orderPrinter = orderPrinter;
    }

    public void printOrders(List<Order> orders) {
        orderPrinter.print(orders);
    }
}
