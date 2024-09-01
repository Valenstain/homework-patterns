package org.example.creationals.abstractfactory;
/**
 * Реализация обувного магазина
 * от компании Adidas
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class AdidasShoes implements ShoeStore {
    @Override
    public void infoShoeStore() {
        System.out.println("Adidas shoes");
    }
}
