package org.example.structures.composite;

/**
 * Кассир
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Cashier implements Staff {
    @Override
    public void whoAmI() {
        System.out.println("I'm cashier");
    }
}
