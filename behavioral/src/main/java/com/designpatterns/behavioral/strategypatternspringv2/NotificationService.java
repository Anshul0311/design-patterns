package com.designpatterns.behavioral.strategypatternspringv2;

public interface NotificationService {

    void sendNotification();

    StrategyType getNotificationStrategy();
}
