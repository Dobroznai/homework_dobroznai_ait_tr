package ait.de.lessons.interfaces;

public class FacebookAuth implements SocialAuth {

    private String token;


    @Override
    public void authenticate(String userCredentials) {
        // userCredentials --> token access
        this.token = userCredentials;
        System.out.println("Автоматизация через Facebook c токеном: " + token + "");
    }

    @Override
    public String getUserProfile() {
        return "Facebook- профиль пользователя с токеном: " + token + "";
    }

    //  переопределение default-методов интерфейса (контракта) не обязательна
    @Override
    public boolean checkLoginAttempts(int currentAttempts) {
        if (currentAttempts <= 2) {
            System.out.println("Facebook попытка входа допустима");
            return true;
        } else {
            System.out.println("Facebook попытки входа превышены");
            return false;
        }
    }
}
