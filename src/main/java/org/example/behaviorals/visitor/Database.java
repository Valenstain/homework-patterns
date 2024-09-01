package org.example.behaviorals.visitor;
/**
 * Работает с базой данных
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Database implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
