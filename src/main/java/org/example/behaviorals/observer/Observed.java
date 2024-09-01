package org.example.behaviorals.observer;

/**
 * Действия над подписчиками
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public interface Observed {

    /**
     * Добавление подписчика
     * @param observer подписчик
     */
    public void addObserver(Observer observer);

    /**
     * Удаление подписчика
     * @param observer подписчик
     */
    public void removeObserver(Observer observer);

    /**
     * Уведомление подписчика
     */
    public void notifyObservers();
}
