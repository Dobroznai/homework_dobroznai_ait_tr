package ait.de.lessons.interfaces;

public class EmailNotifier implements Notifiable {


    @Override
    public void sendNotification(String userId, String message) {
        System.out.println("Отправляем email пользователю " + userId + " c текстом " + message);
    }
}
