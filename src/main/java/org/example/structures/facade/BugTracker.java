package org.example.structures.facade;

/**
 * Счетчик рабочего времени
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class BugTracker {
    /**
     * Время работы
     * true - рабочее время
     * false - нерабочее время
     */
    private boolean activeSprint;

    /**
     * Возвращает текущее состояние время работы
     * @return текущее состояние времени работы
     */
    public boolean isActiveSprint() {
        return activeSprint;
    }

    /**
     * Запуск рабочего времени
     */
    public void startSprint() {
        System.out.println("Sprint is active");
        activeSprint = true;
    }
    /**
     * Остановка рабочего времени
     */
    public void finishSprint() {
        System.out.println("Sprint is not active");
        activeSprint = false;
    }
}
