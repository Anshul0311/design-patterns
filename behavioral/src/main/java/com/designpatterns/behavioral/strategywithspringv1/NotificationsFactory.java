package com.designpatterns.behavioral.strategywithspringv1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationsFactory {

    private final Map<String, NotificationService> notificationServiceMap;

    @Autowired
    public NotificationsFactory(Map<String, NotificationService> notificationServiceMap) {
        this.notificationServiceMap = notificationServiceMap;
    }

    public NotificationService getNotificationService(String notificationType) {
        NotificationService notificationService = notificationServiceMap.get(notificationType);
        if (notificationService == null) {
            throw new RuntimeException("Unsupported notification type");
        }
        return notificationService;
    }
}
