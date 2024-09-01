package org.example.behaviorals.strategy;

/**
 * Пишет код
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Coding implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Coding...");
    }
}
