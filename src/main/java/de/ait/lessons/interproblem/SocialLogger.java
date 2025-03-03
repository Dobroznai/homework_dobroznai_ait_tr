package de.ait.lessons.interproblem;

public class SocialLogger implements LoggerA, LoggerB {

    @Override
    public void log(String message) {
        LoggerA.super.log(message);
        System.out.println("SocialLogger: " + message);
        LoggerB.super.log(message);
    }

    public static void main(String[] args) {
        SocialLogger socialLogger = new SocialLogger();
        socialLogger.log("TestLog");

    }
}
