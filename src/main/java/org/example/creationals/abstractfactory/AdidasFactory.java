package org.example.creationals.abstractfactory;
/**
 * Реализация фабрики
 * компании Adidas
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class AdidasFactory implements StoreFactory {

    @Override
    public ShoeStore getShoeStore() {
        return new AdidasShoes();
    }

    @Override
    public ClothesStore getClothesStore() {
        return new AdidasClothes();
    }

    @Override
    public HatsStore getHatsStore() {
        return new AdidasHats();
    }
}
