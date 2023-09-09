package com.designpatterns.behavioral.strategypatternspringv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class NotificationStrategyFactory {

    private Map<StrategyType,NotificationService> notificationServiceMap;

    @Autowired
    public NotificationStrategyFactory(Set<NotificationService> notificationStrategies) {
        initiateNotificationStratagies(notificationStrategies);
    }

    public NotificationService getNotificationStrategy(StrategyType strategy) {
        return notificationServiceMap.get(strategy);
    }

    private void initiateNotificationStratagies(Set<NotificationService> notificationStrategies) {
        notificationServiceMap = new HashMap<>();
        notificationStrategies.forEach(notificationStrategy ->
                notificationServiceMap.put(notificationStrategy.getNotificationStrategy(), notificationStrategy));
    }
}
