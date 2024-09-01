package org.example.structures.bridge;

/**
 * Склад одежды
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class WhClothes extends Warehouse {

    /**
     * Конструктор
     * @param store объект магазина
     */
    public WhClothes(Store store) {
        super(store);
    }

    @Override
    public void showStore() {
        System.out.println("Clothes warehouse");
        store.information();
    }
}
