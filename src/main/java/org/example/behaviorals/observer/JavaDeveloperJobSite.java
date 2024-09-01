package org.example.behaviorals.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация сайта вакансий
 * Java разработчиков
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class JavaDeveloperJobSite implements Observed {

    /**
     * Вакансии
     */
    private List<String> vacancies = new ArrayList<>();
    /**
     * Подписчики
     */
    private List<Observer> subscribers = new ArrayList<>();

    /**
     * Добавить вакансию
     * @param vacancy вакансия
     */
    public void addVacancy(String vacancy) {

        // Добавляем вакансию
        this.vacancies.add(vacancy);

        // Уведомляем всех подписчиков
        notifyObservers();
    }

    /**
     * Удалить вакансию
     * @param vacancy вакансия
     */
    public void removeVacancy(String vacancy) {

        // Удаляем вакансию
        this.vacancies.remove(vacancy);

        // Уведомляем всех подписчиков
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        subscribers.forEach(o -> o.handleEvent(this.vacancies));
    }
}
