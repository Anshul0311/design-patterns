package com.designpatterns.behavioral.strategywithspringv1;

import java.util.Map;

public class NotificationsFactory {

    private final Map<String, NotificationService> notificationServiceMap;

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
