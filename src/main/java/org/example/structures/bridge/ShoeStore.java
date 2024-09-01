package org.example.structures.bridge;

/**
 * Магазин обуви
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class ShoeStore implements Store {
    @Override
    public void information() {
        System.out.println("We sell shoes for you");
    }
}
