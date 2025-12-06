package creational.factory.interfaces.factory.implementation;

import creational.factory.NotificationType;
import creational.factory.interfaces.Notification;
import creational.factory.interfaces.implementation.EmailNotification;
import creational.factory.interfaces.implementation.PushNotification;
import creational.factory.interfaces.implementation.SMSNotification;

import java.util.HashMap;
import java.util.Map;

public class NotificationFactory {

    public static final Map<NotificationType, Notification> factoryMap = new HashMap<>();

    static {
        // Will Take More about Creating Objects While we talk about Singleton Pattern
        factoryMap.put(NotificationType.APP, new PushNotification());
        factoryMap.put(NotificationType.EMAIL, new EmailNotification());
        factoryMap.put(NotificationType.SMS, new SMSNotification());
    }

    public static Notification getInstance(NotificationType notificationType) {
        return factoryMap.get(notificationType);
    }
}
