package org.example.structures.facade;
/**
 * Основной класс реализующий паттерн
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Facade {

    /**
     * Разработчик
     */
    private Developer developer = new Developer();
    /**
     * Работа
     */
    private Job job = new Job();
    /**
     * Контроль времени работы
     */
    private BugTracker bugTracker = new BugTracker();

    /**
     * Метод запуска
     */
    public void run() {

        // Выполняем работу
        job.doJob();

        // Запускаем счетчик времени работы
        bugTracker.startSprint();

        // Запускаем работу разработчика
        developer.doJobBeforeDeadline(bugTracker);
    }
}
