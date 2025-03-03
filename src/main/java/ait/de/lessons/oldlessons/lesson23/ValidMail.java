package ait.de.lessons.oldlessons.lesson23;

import java.util.regex.Pattern;

public class ValidMail {

    // "user@example.com",     // валидный
    //"user@",                // невалидный
    //"user@.com",            // невалидный
    public boolean isEmailValid(String email) {
        Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }
}
