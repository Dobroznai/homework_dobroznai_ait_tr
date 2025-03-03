package ait.de.lessons.oldlessons.lesson03;

public class AboutMe {
    static String name  = "Ivan";
    static byte age = 34;
    static short weight = 82;
    static int dateBirthday = 1990;
    static int dayBirthday = 27;
    static int monthBirthday = 06;
    static char gender = 'M';
    static boolean married = true;

    public static void main(String[] args) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Birthday: " + dayBirthday + " " + monthBirthday + " " + dateBirthday);
        System.out.println("Gender: " + gender);
        System.out.println("Married: " + married);

    }
}
