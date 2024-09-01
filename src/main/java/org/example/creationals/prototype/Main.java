package org.example.creationals.prototype;

/**
 * Паттерн Prototype (Прототип)
 * используется для созданий копий
 * заданного объекта
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // Создаем объект адреса
        Address address = new Address("Беларусь", "Могилев", "Шмидта", "125");

        // Выводим поля
        System.out.println(address);

        // Делаем копию объекта адреса и меняем одно поле, чтобы убедится что это разные объекты
        Address addressCopy = (Address) address.copy();
        addressCopy.setHouse("45");

        // Выводим поля для проверки
        System.out.println(addressCopy);
    }
}
