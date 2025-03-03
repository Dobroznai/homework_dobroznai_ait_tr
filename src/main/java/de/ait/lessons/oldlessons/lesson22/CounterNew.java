package de.ait.lessons.oldlessons.lesson22;

public class CounterNew {

    // Поле для хранения текущего значения счетчика.
    // Field to store the current counter value.
    int counterValue = 0;

    /**
     * Увеличивает значение счетчика на 1.
     * Increments the counter value by 1.
     */
    public void increment() {
        counterValue++; // Увеличиваем значение счетчика на единицу.
        // Increment the counter value by one.
    }

    /**
     * Уменьшает значение счетчика на 1.
     * Decrements the counter value by 1.
     */
    public void decrement() {
        counterValue--; // Уменьшаем значение счетчика на единицу.
        // Decrement the counter value by one.
    }

    /**
     * Возвращает текущее значение счетчика.
     * Returns the current value of the counter.
     *
     * @return текущее значение счетчика.
     * The current counter value.
     */
    public int getValue() {
        return counterValue; // Возвращаем значение счетчика.
        // Return the counter value.
    }
}
