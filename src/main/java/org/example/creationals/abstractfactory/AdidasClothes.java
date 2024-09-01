package org.example.creationals.abstractfactory;
/**
 * Реализация магазина одижды
 * от компании Adidas
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class AdidasClothes implements ClothesStore {
    @Override
    public void infoClothesStore() {
        System.out.println("Adidas clothes");
    }
}
