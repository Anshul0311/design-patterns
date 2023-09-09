package com.designpatterns.behavioral.strategywithspringv1;

import org.springframework.stereotype.Service;

@Service("push")
public class PushNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Sending push notification..");
    }
}
