package org.example.structures.bridge;

/**
 * Склад
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public abstract class Warehouse {

    /**
     * Магазин
     */
    protected Store store;

    /**
     * Конструктор
     * @param store объект магазина
     */
    public Warehouse(Store store) {
        this.store = store;
    }

    /**
     * Показать магазин
     */
    public abstract void showStore();
}
