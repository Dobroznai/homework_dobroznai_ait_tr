package ait.de.lessons.interfaces;

public class MainAuth {
    public static void main(String[] args) {
        // FB как способ авторизации
        SocialAuth facebookAuth = new FacebookAuth();
        facebookAuth.authenticate("FB_token_01010101");
        System.out.println(facebookAuth.getUserProfile());


        // проверим попытки входа
        facebookAuth.checkLoginAttempts(1);
        facebookAuth.checkLoginAttempts(3);

        System.out.println("--------------Google Auth-------------");
        //меняем способ авторизации на Google
        SocialAuth googleAuth = new GoogleAuth();
        googleAuth.authenticate("google_token_123456");
        System.out.println(googleAuth.getUserProfile());
        boolean checkLoginAttempts = googleAuth.checkLoginAttempts(4);
        System.out.println("Допустима ли 4 попытка? " + checkLoginAttempts + "");

        SocialAuth.printMaxLoginAttempts();
    }
}
