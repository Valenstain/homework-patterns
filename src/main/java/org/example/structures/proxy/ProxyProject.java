package org.example.structures.proxy;

/**
 * Класс реализующий паттерн
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class ProxyProject implements Project {

    /**
     * Ссылка
     */
    private String url;
    /**
     * Объект к которому ограничиваем доступ
     */
    private RealProject realProject;

    /**
     * Конструктор
     * @param url - web адрес
     */
    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null)
            realProject = new RealProject(url);

        realProject.run();
    }
}
