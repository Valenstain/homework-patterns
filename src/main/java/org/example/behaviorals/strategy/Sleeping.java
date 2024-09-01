package org.example.behaviorals.strategy;

/**
 * Спит
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping ...");
    }
}
