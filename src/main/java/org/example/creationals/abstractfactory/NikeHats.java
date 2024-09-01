package org.example.creationals.abstractfactory;
/**
 * Реализация магазина шляп
 * от компании Nike
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class NikeHats implements HatsStore {
    @Override
    public void infoHatsStore() {
        System.out.println("Nike hats");
    }
}
