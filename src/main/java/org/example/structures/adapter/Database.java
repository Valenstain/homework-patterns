package org.example.structures.adapter;

/**
 * Интерфейс, в который будем преобразовывать
 * База данных
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public interface Database {
    /**
     * Запрос чтения
     */
    public void select();
    /**
     * Запрос добавления
     */
    public void insert();
    /**
     * Запрос обновления
     */
    public void update();
    /**
     * Запрос удаления
     */
    public void delete();
}
