package org.example.structures.bridge;

/**
 * Паттерн Bridge (Мост)
 * Используется для получения преимуществ наследования
 * без потери гибкости
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        Warehouse[] warehouses = {
                new WhClothes(new ClothesStore()),
                new WhShoes(new ShoeStore())
        };

        for (Warehouse wh: warehouses) {
            wh.showStore();
            System.out.println("----------------");
        }
    }
}
