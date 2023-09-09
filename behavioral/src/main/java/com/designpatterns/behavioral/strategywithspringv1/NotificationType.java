package com.designpatterns.behavioral.strategywithspringv1;

public enum NotificationType {

    SMS("sms"),
    EMAIL("email"),
    PUSH("push");

    private final String value;

    NotificationType(String value) {
        this.value = value;
    }
}
