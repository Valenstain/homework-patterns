package org.example.behaviorals.strategy;

/**
 * Читает
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading ...");
    }
}
