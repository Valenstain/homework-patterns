package org.example.behaviorals.state;
/**
 * Состояние Сна
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}