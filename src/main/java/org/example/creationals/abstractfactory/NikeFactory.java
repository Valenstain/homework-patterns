package org.example.creationals.abstractfactory;
/**
 * Реализация фабрики
 * компании Nike
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class NikeFactory implements StoreFactory {

    @Override
    public ShoeStore getShoeStore() {
        return new NikeShoes();
    }

    @Override
    public ClothesStore getClothesStore() {
        return new NikeClothes();
    }

    @Override
    public HatsStore getHatsStore() {
        return new NikeHats();
    }
}
