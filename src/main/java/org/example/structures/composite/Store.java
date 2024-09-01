package org.example.structures.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Основной класс реализующий паттерн
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Store {

    /**
     * Список объектов
     */
    private List<Staff> listStaff;

    /**
     * Конструктор
     */
    public Store() {
        this.listStaff = new ArrayList<>();
    }

    /**
     * Добавление объекта
     * @param staff добавляемы объект
     */
    public void addStaff(Staff staff) {
        listStaff.add(staff);
    }

    /**
     * Метод для обработки
     * списка объектов
     */
    public void showStaff() {

        //Выаодим сообщение
        System.out.println("These are our employees");

        // Перебираем все объекты
        for (Staff staff: listStaff)
            staff.whoAmI();
    }
}
