package org.example.behaviorals.command;

/**
 * Запросы к базе данных
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Database {

    /**
     * Получение строки
     */
    public void select() {
        System.out.println("Selecting record...");
    }

    /**
     * Добавление строки
     */
    public void insert() {
        System.out.println("Inserting record...");
    }

    /**
     * Обновление строки
     */
    public void update() {
        System.out.println("Updating record...");
    }

    /**
     * Удаление строки
     */
    public void delete() {
        System.out.println("Deleting record...");
    }
}
