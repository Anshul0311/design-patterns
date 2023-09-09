package com.designpatterns.behavioral.strategywithspringv1;

import org.springframework.stereotype.Service;

@Service("sms")
public class SmsNotificationService implements NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification..");
    }
}
