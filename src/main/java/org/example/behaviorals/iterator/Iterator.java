package org.example.behaviorals.iterator;

/**
 * Интерфейс итератора
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public interface Iterator {
    /**
     * Проверка на существование следующего элемента
     * @return true или false
     */
    public boolean hasNext();

    /**
     * Получение следующего элемента
     * @return следующий элемент
     */
    public Object next();
}
