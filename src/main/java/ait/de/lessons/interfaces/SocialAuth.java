package ait.de.lessons.interfaces;

public interface SocialAuth {

    // Константа
    int MAX_LOGIN_ATTEMPTS = 3;

    // Абстрактный метод: как авторизоваться
    void authenticate(String userCredentials);

    // Абстрактный метод: получить профиль пользователя
    String getUserProfile();

    // Default-метод: добавляем логику по умолчанию
    default boolean checkLoginAttempts(int currentAttempts) {
        return currentAttempts < MAX_LOGIN_ATTEMPTS;
    }

    // Static-метод: общий вспомогательный метод
    static void printMaxLoginAttempts() {
        System.out.println("Максимально количество попыток входа: " + MAX_LOGIN_ATTEMPTS);
    }
}
