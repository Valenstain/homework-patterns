package org.example.behaviorals.observer;

import java.util.List;

/**
 * Интерфейс наблюдателя
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public interface Observer {
    /**
     * Событие
     * @param vacancies список строк
     */
    public void handleEvent(List<String> vacancies);
}
