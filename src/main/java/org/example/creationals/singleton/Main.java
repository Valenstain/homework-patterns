package org.example.creationals.singleton;

/**
 * Паттерн Singleton (Одиночка)
 * Используется для создания единственного экземпляра
 * определенного класса
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        Logs.addLog("Первый лог....");
        Logs.addLog("Второй лог....");
        Logs.addLog("Третий лог....");
        Logs.addLog("Четвертый лог....");

        Logs.readLog();
    }
}
