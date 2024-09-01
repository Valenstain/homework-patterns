package org.example.behaviorals.command;

/**
 * Класс запроса на получени строки
 * с базы данных
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class SelectCommand implements Command {
    /**
     * Объект базы данных
     */
    private Database database;

    /**
     * Конструктор
     * @param database объект базы данных
     */
    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
