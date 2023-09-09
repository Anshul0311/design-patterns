package com.designpatterns.behavioral.strategypatternspringv2;

import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Sending email notification..");
    }

    @Override
    public StrategyType getNotificationStrategy() {
        return StrategyType.EMAIL;
    }
}
