package org.example.behaviorals.command;
/**
 * Класс объединяющий все объекты
 * с единичными запросами
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Developer {
    /**
     * Получение
     */
    private Command select;
    /**
     * Добавление
     */
    private Command insert;
    /**
     * Обновление
     */
    private Command update;
    /**
     * Удаление
     */
    private Command delete;

    /**
     * Конструктор определяющий обекты запросов
     * @param select получение
     * @param insert добавление
     * @param update обновление
     * @param delete удаление
     */
    public Developer(Command select, Command insert, Command update, Command delete) {
        this.select = select;
        this.insert = insert;
        this.update = update;
        this.delete = delete;
    }

    /**
     * Получение записи
     */
    public void selectRecord() {
        select.execute();
    }
    /**
     * Добавление записи
     */
    public void insertRecord() {
        insert.execute();
    }
    /**
     * Обновление записи
     */
    public void updateRecord() {
        update.execute();
    }
    /**
     * Удаление записи
     */
    public void deleteRecord() {
        delete.execute();
    }
}
