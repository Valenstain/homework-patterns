package org.example.behaviorals.state;

/**
 * Состояние написания кода
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Coding implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Writing code...");
    }
}
