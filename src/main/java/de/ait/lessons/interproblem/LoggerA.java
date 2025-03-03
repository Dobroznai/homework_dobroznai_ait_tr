package de.ait.lessons.interproblem;

public interface LoggerA {
    default void log (String message) {
       System.out.println("Logger A: " + message);
    }
}
