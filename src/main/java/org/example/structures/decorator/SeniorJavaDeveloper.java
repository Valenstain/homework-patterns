package org.example.structures.decorator;

/**
 * Расширяющий класс Сеньор Java разработчик
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class SeniorJavaDeveloper extends DeveloperDecorator {
    /**
     * Переопредение конструктора
     * @param developer расширяемый объект (разработчик)
     */
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    /**
     * Дополнительный метод, который расширяет фукнционал
     * @return
     */
    public String makeCodeReview() {
        return "Make code review";
    }

    /**
     * Переопределение метода расширяемого объекта
     * @return возвращает работу расширямого объекта и
     * работу дополнительного метода
     */
    @Override
    public String makeJob() {
        return super.makeJob() + " " + makeCodeReview();
    }
}
