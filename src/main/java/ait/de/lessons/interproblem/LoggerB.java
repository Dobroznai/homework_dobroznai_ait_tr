package ait.de.lessons.interproblem;

public interface LoggerB {
    default void log(String message) {
        System.out.println("Logger B: " + message);
    }
}
