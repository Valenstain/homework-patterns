package org.example.structures.facade;

/**
 * Разработчик
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Developer {
    /**
     * Выполняет работу исходя из времени работы
     * @param bugTracker объект счетчика времени работы
     */
    public void doJobBeforeDeadline(BugTracker bugTracker) {

        // Проверяем рабочее ли время
        if (bugTracker.isActiveSprint())
            System.out.println("Developer is solving problems...");
        else
            System.out.println("Developer is reading Hab");
    }
}
