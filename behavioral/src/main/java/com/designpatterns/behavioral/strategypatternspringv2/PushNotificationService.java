package com.designpatterns.behavioral.strategypatternspringv2;

import org.springframework.stereotype.Service;

@Service
public class PushNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Sending push notification..");
    }

    @Override
    public StrategyType getNotificationStrategy() {
        return StrategyType.PUSH;
    }
}
