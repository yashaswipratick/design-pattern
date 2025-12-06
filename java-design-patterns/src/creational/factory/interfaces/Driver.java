package creational.factory.interfaces;

import creational.factory.NotificationAttributes;
import creational.factory.NotificationType;
import creational.factory.interfaces.factory.implementation.NotificationFactory;

// Definition:

//The Factory Design Pattern is a creational design pattern used to create objects without
// exposing the creation logic to the client.
//Instead of calling constructors directly, you ask a creational.factory to give you the required object.
public class Driver {

    public static void main(String[] args) {

        //create the templates before sending the sms notification
        NotificationAttributes smsAttributes = new NotificationAttributes(
                "9441873023","7780570356","Your Mobile OTP : 35654 valid for 10 minus"
        );

        // Get the SMSNotification class object by passing the ENUM
        Notification smsNotification = NotificationFactory.getInstance(NotificationType.SMS);

        //Send the notification
        smsNotification.sendNotification(smsAttributes);

        //create the templates before sending the sms notification
        NotificationAttributes emailAttributes = new NotificationAttributes(
                "krishnavamsikaruturi8@gmail.com",
                "saikaruturi8@gmail.com",
                "Your Mobile OTP : 35654 valid for 10 minus");

        // Get the EmailNotification class object by passing the ENUM
        Notification emailNotification = NotificationFactory.getInstance(NotificationType.EMAIL);

        //Send the notification
        emailNotification.sendNotification(emailAttributes);
    }
}
