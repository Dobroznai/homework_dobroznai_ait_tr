package de.ait.lessons.interfaces;

public class GoogleAuth implements SocialAuth {
    private String oAuthtoken;


    @Override
    public void authenticate(String userCredentials) {
        this.oAuthtoken = userCredentials;
        System.out.println("Авторизация через Google с токеном: " + oAuthtoken);
    }

    @Override
    public String getUserProfile() {
        return "Google-профиль пользователя: " + oAuthtoken;
    }


}
