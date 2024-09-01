package org.example.structures.adapter;

/**
 * Основной класс реализующий паттерн
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class AdapterJavaToDatabase extends JavaApplication implements Database {

    @Override
    public void select() {
        selectData();
    }

    @Override
    public void insert() {
        insertData();
    }

    @Override
    public void update() {
        updateData();
    }

    @Override
    public void delete() {
        deleteData();
    }
}
