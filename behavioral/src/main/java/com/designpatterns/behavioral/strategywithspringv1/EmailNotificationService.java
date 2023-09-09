package com.designpatterns.behavioral.strategywithspringv1;

import org.springframework.stereotype.Service;

@Service("email")
public class EmailNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Sending email notification..");
    }
}
