package org.example.behaviorals.observer;

import java.util.List;

/**
 * Реализация наблюдателя в виде пидписчика
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Subscriber implements Observer {

    /**
     * Название
     */
    private String name;

    /**
     * Конструктор
     * @param name название
     */
    public Subscriber(String name) {
        this.name = name;
    }

    /**
     * Событие
     * @param vacancies список вакансий
     */
    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("****** Вакансии для: " + name);
        vacancies.forEach(System.out::println);
    }
}
