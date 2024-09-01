package org.example.creationals.factorymethod;

/**
 * Фабрика автомобилей
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public interface CarFactory {
    /**
     * Получить автомобиль
     * @return объект автомобиля
     */
    public Car getCar();
}
