package org.example.structures.adapter;

/**
 * Паттерн Adapter (Адаптер)
 * используется для преобразования
 * интерфейса одного класса в другой
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        Database db = new AdapterJavaToDatabase();

        db.select();
        db.insert();
        db.update();
        db.delete();
    }
}
