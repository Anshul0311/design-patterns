package com.designpatterns.creational.factorymethod;

public abstract class MessageCreator<T> {

    public Message<T> getMessage() {
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    /**
     * Factory method
     * @return
     */
    public abstract Message<T> createMessage();
}
