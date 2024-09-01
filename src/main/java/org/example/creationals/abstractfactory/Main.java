package org.example.creationals.abstractfactory;

import java.util.Arrays;
import java.util.List;

/**
 * Паттерн Abstract Factory (Абстратная фабрика)
 * используется для создания множеств взаимосвязанных объектов
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // Список названий фабрик
        List<String> names = Arrays.asList("Adidas", "Nike");

        // Перебираем значения фабрик
        names.forEach(name -> {

            // Получаем объект фабрики используя название
            StoreFactory storeFactory = getStoreFactory(name);

            // Получаем магазины фабрики
            HatsStore hatsStore = storeFactory.getHatsStore();
            ClothesStore clothesStore = storeFactory.getClothesStore();
            ShoeStore shoeStore = storeFactory.getShoeStore();

            // Отображаем информацию о магазинах
            hatsStore.infoHatsStore();
            clothesStore.infoClothesStore();
            shoeStore.infoShoeStore();

            System.out.println("------------------------------------");

        });
    }

    /**
     * Получение объекта фабрики
     * @param name название фабрики
     * @return объект фабрики
     */
    private static StoreFactory getStoreFactory(String name) {

        // Инициализируем переменную фабрики
        StoreFactory storeFactory = null;

        // Создаем объект фабрики в зависимости от названия
        storeFactory = switch (name) {
            case "Adidas" -> new AdidasFactory();
            case "Nike" -> new NikeFactory();
            default -> storeFactory;
        };

        return storeFactory;
    }
}
