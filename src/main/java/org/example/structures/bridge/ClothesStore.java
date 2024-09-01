package org.example.structures.bridge;

/**
 * Магазин одежды
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class ClothesStore implements Store {
    @Override
    public void information() {
        System.out.println("We sell clothes for you");
    }
}
