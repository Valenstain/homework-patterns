package org.example.structures.composite;
/**
 * Паттерн Composite (Компоновщик)
 * используется для компоновки более мелких компонентов
 * в более крупные
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        Store store = new Store();

        store.addStaff(new Consultant());
        store.addStaff(new Cashier());
        store.addStaff(new Manager());

        store.showStaff();
    }
}
