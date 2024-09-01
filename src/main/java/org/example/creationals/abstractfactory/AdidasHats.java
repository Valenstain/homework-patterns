package org.example.creationals.abstractfactory;
/**
 * Реализация магазина шляп
 * от компании Adidas
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class AdidasHats implements HatsStore {
    @Override
    public void infoHatsStore() {
        System.out.println("Adidas hats");
    }
}
