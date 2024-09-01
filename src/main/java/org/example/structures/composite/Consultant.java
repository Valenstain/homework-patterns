package org.example.structures.composite;

/**
 * Консультант
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Consultant implements Staff {
    @Override
    public void whoAmI() {
        System.out.println("I'm consultant");
    }
}
