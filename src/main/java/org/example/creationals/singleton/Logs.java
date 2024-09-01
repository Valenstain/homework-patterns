package org.example.creationals.singleton;

/**
 * Реализация паттерна
 * В качестве примера используется
 * строка, которая дополняется другими строками
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Logs {

    /**
     * Лог в виде строки
     */
    private static String listLogs = "";

    /**
     * Добавление записи в лог
     * @param str добавляемая строка
     */
    public static synchronized void addLog(String str) {
        listLogs += str + "\r\n";
    }

    /**
     * Вывести на экран лог
     */
    public static void readLog() {
        System.out.println(listLogs);
    }
}
