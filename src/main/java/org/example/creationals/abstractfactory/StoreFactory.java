package org.example.creationals.abstractfactory;
/**
 * Фабрика магазинов
 * Основной класс реализации паттерна
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public interface StoreFactory {
    /**
     * Обувной магазин
     * @return объект обувного магазина
     */
    public ShoeStore getShoeStore();
    /**
     * Магазин одежды
     * @return объект магазина одежды
     */
    public ClothesStore getClothesStore();
    /**
     * Магазин шдляп
     * @return объект магазина шляп
     */
    public HatsStore getHatsStore();
}
