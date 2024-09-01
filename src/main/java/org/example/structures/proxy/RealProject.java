package org.example.structures.proxy;

/**
 * Класс, объект которого будем ограничивать по доступу
 * с помощью паттерна Proxy
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class RealProject implements Project {

    /**
     * Сыылка для пример
     */
    private String url;

    /**
     * Конструктор
     * @param url
     */
    public RealProject(String url) {
        this.url = url;
        load();
    }

    /**
     * Загрузка по ссылке
     */
    public void load() {
        System.out.println("Loading project from " + url);
    }

    @Override
    public void run() {
        System.out.println("Running project " + url);
    }
}
