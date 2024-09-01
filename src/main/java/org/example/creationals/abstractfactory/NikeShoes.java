package org.example.creationals.abstractfactory;
/**
 * Реализация обувного магазина
 * от компании Nike
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class NikeShoes implements ShoeStore {
    @Override
    public void infoShoeStore() {
        System.out.println("Nike Shoes");
    }
}
