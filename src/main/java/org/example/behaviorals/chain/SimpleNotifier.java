package org.example.behaviorals.chain;

/**
 * Простое сообщение
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class SimpleNotifier extends Notifier {
    /**
     * Конструктор определяющий приоритет
     * @param priority приоритет
     */
    public SimpleNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SimpleNotifier: " + message);
    }
}
