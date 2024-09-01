package org.example.behaviorals.memento;

import java.util.Date;

/**
 * Какой-то проект для примера
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Project {
    /**
     * Версия
     */
    private String version;
    /**
     * Дата
     */
    private Date date;

    /**
     * Задать версию и дату проекта
     * @param version версия проекта
     */
    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    /**
     * Сохранить проект
     * @return объект сохранения проекта
     */
    public Save save() {
        return new Save(version);
    }

    /**
     * Восстановить проект из сохранения
     * @param save объект сохранения
     */
    public  void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
