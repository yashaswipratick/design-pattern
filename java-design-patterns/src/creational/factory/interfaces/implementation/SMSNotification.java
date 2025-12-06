package creational.factory.interfaces.implementation;

import creational.factory.NotificationAttributes;
import creational.factory.interfaces.Notification;

public class SMSNotification implements Notification {
    @Override
    public boolean sendNotification(NotificationAttributes notificationAttributes) {
        // Here From his Which Server is Sent and to is our device UDID
        System.out.println("SMS Send Successfully to - "+notificationAttributes.getTo());
        return true;
    }
}
