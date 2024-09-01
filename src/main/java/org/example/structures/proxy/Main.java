package org.example.structures.proxy;
/**
 * Паттерн proxy используется для замещения другого объекта
 * и контроля доступа к нему
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://www.site.ru/link");

        project.run();
    }
}
