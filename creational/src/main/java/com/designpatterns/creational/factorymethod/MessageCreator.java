package com.designpatterns.creational.factorymethod;

public abstract class MessageCreator {

    public Message getMessage() {
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    /**
     * Factory method
     * @return
     */
    public abstract Message createMessage();
}
