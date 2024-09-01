package org.example.structures.decorator;
/**
 * Основной класс реализующий паттерн
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class DeveloperDecorator implements Developer {
    /**
     * Объект разработчика, который будем расширять
     */
    private Developer developer;

    /**
     * Конструктор
     * @param developer расширяемый объект
     */
    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    /**
     * Выполняем работу
     * @return работу расширяемого объекта
     */
    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
