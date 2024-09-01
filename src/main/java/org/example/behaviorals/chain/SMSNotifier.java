package org.example.behaviorals.chain;
/**
 * SMS сообщение
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class SMSNotifier extends Notifier {
    /**
     * Конструктор определяющий приоритет
     * @param priority приоритет
     */
    public SMSNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SMSNotifier: " + message);
    }
}
