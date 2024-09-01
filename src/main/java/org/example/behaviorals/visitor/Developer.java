package org.example.behaviorals.visitor;
/**
 * Интерфейс программиста
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public interface Developer {
    /**
     * Пишет код
     * @param projectClass объект написания кода
     */
    public void create(ProjectClass projectClass);

    /**
     * Работает с базой данных
     * @param database объект работы с базой данных
     */
    public void create(Database database);

    /**
     * Тестирует
     * @param test объект тестирования
     */
    public void create(Test test);
}
