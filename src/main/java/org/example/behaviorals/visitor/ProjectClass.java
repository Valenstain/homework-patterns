package org.example.behaviorals.visitor;

/**
 * Пишет код
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
