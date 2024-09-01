package org.example.behaviorals.iterator;

/**
 * Интерфейс коллекции
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public interface Collection {
    /**
     * Получить итератор коллекции
     * @return итератор коллекции
     */
    public Iterator getIterator();
}
