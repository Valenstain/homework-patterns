package org.example.behaviorals.visitor;

/**
 * Интерфейс какого-то проекта
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public interface ProjectElement {
    /**
     * Пишет код
     * @param developer программист
     */
    public void beWritten (Developer developer);
}
