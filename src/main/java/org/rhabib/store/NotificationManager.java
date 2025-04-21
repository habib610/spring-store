package org.rhabib.store;

import org.rhabib.store.exercise.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    NotificationService notificationService;
    public NotificationManager(@Qualifier("sms") NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    void sendNotification() {
        notificationService.send("Your code is verified");

    }
}

