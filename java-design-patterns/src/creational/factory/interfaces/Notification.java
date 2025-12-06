package creational.factory.interfaces;

import creational.factory.NotificationAttributes;

// Definition:

//The Factory Design Pattern is a creational design pattern used to create objects without
// exposing the creation logic to the client.
//Instead of calling constructors directly, you ask a creational.factory to give you the required object.
public interface Notification {

    boolean sendNotification(NotificationAttributes notificationAttributes);
}
