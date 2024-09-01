package org.example.creationals.abstractfactory;
/**
 * Реализация магазина одижды
 * от компании Nike
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class NikeClothes implements ClothesStore {
    @Override
    public void infoClothesStore() {
        System.out.println("Nike clothes");
    }
}
