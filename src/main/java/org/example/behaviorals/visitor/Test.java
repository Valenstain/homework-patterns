package org.example.behaviorals.visitor;
/**
 * Тестирует
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
