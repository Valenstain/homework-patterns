package org.example.behaviorals.memento;

import java.util.Date;

/**
 * Сохранение проекта
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Save {

    /**
     * Версия
     */
    private final String version;

    /**
     * Дата
     */
    private final Date date;

    /**
     * Конструктор
     * @param version версия
     */
    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }

    /**
     * Получить версию проекта
     * @return версия проекта
     */
    public String getVersion() {
        return version;
    }

    /**
     * Получить дату проекта
     * @return дата проекта
     */
    public Date getDate() {
        return date;
    }
}
