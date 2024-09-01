package org.example.structures.flyweight;

/**
 * Интерфес разработчика
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
@FunctionalInterface
public interface Developer {
    /**
     * Выполнение работы разработчиком
     */
    public void writeCode();
}
