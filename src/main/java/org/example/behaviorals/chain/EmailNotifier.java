package org.example.behaviorals.chain;
/**
 * Email сообщение
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class EmailNotifier extends Notifier {
    /**
     * Конструктор определяющий приоритет
     * @param priority приоритет
     */
    public EmailNotifier(Priority priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("EmailNotifier: " + message);
    }
}
