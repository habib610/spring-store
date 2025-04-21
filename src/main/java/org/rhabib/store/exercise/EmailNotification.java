package org.rhabib.store.exercise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotification implements NotificationService {
    @Override
    public void send(String notification) {
        System.out.println("EMAIL:");
        System.out.println( notification);
    }
}
