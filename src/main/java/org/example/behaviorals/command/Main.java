package org.example.behaviorals.command;

/**
 * Command (Команда)
 * запорачивает запросы или
 * простые операции в отдельные объекты
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // Объект базы данных
        Database database = new Database();

        // Создаем объект объединяющий все объекты с единичными запросами
        Developer developer = new Developer(
                new SelectCommand(database),
                new InsertCommand(database),
                new UpdateCommand(database),
                new DeleteCommand(database)
        );

        // Выполняем запросы
        developer.selectRecord();
        developer.insertRecord();
        developer.updateRecord();
        developer.deleteRecord();
    }
}
