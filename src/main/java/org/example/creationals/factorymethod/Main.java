package org.example.creationals.factorymethod;

/**
 * Паттерн Factory method
 * Используется для делегирования
 * создания экземпляров, другому классу
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // Задаем набор значений для теста
        String[] factoryNames = {"Mustang", "Lamborghini"};

        // Проходим в цикле значения, подставляя фабрики
        for (String factoryName: factoryNames) {
            CarFactory carFactory = getFactory(factoryName);
            Car car = carFactory.getCar();
            car.model();
        }
    }

    /**
     * Создает нужную фабрику по запросу
     * @param factoryName название фабрики
     * @return объект фабрики
     */
    private static CarFactory getFactory(String factoryName) {

        // Инициализируем переменную
        CarFactory carFactory = null;

        // Используем switch case конструкцию
        carFactory = switch (factoryName) {
            case "Mustang" -> new MustangFactory();
            case "Lamborghini" -> new LamborghiniFactory();
            default -> carFactory;
        };

        return  carFactory;
    }
}
