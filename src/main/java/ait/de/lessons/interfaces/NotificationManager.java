package ait.de.lessons.interfaces;

public class NotificationManager {
    public static void main(String[] args) {
        Notifiable notifiable = new EmailNotifier();
        notifiable.sendNotification("user007", "You have new messages");
        notifiable.checkNotificationStatus();

        Notifiable.printNotificationSettings();
    }
}
