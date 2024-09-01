package org.example.behaviorals.command;
/**
 * Класс запроса на обновление строки
 * с базы данных
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class UpdateCommand implements Command {
    /**
     * Объект базы данных
     */
    private Database database;
    /**
     * Конструктор
     * @param database объект базы данных
     */
    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
