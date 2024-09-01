package org.example.behaviorals.template;

/**
 * Основной шаблон сайта
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public abstract class WebsiteTemplate {

    /**
     * Показать страницу
     */
    public void showPage() {
        System.out.println("Шапка сайта");
        showContent();
        System.out.println("Подвал сайта");
    }

    /**
     * Реализация контента
     */
    public abstract void showContent();
}
