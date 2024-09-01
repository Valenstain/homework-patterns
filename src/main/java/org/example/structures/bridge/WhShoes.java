package org.example.structures.bridge;

/**
 * Склад обуви
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class WhShoes extends Warehouse {

    /**
     * Конструктор
     * @param store объект магазина
     */
    public WhShoes(Store store) {
        super(store);
    }

    @Override
    public void showStore() {
        System.out.println("Shoe warehouse");
        store.information();
    }
}
