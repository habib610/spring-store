package org.rhabib.store.exercise;

import org.springframework.stereotype.Service;

@Service("sms")
public class SmsNotification implements NotificationService{
    @Override
    public void send(String notification) {
        System.out.println("SMS:");
        System.out.println( notification);
    }
}
