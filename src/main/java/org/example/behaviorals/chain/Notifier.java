package org.example.behaviorals.chain;

/**
 * Уведомление, которое выполняется
 * по цепочке
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public abstract class Notifier {
    /**
     * Приоритет
     */
    private Priority priority;
    /**
     * Следующий объект
     */
    private Notifier nextNotifier;

    /**
     * Конструктор
     * @param priority приоритет
     */
    public Notifier(Priority priority) {
        this.priority = priority;
    }

    /**
     * Установка следующего звена
     * @param nextNotifier
     */
    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    /**
     * Основной метод, который будет
     * выполнятся по цепочке объектов
     * @param message сообщение
     * @param level приоритет
     */
    public void notifyManager(String message, Priority level) {

        // Если уровень приоритета достаточен, выполняем код
        if (level.getLevel() >= priority.getLevel()) {
            // Пишем сообщение
            write(message);

            // Если есть следуюющие объекты в цепочке
            if (nextNotifier != null)
                nextNotifier.notifyManager(message, level);
        }
    }

    /**
     * Метод уведомления, выполняемый
     * при прохождении цепочки
     * @param message сообщение
     */
    public abstract void write(String message);
}
