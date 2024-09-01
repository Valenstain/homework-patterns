package org.example.structures.composite;

/**
 * Менеджер
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Manager implements Staff {
    @Override
    public void whoAmI() {
        System.out.println("I'm manager");
    }
}
