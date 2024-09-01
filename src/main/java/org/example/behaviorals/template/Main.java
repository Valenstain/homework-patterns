package org.example.behaviorals.template;

/**
 * Template method (Шаблонный метод)
 * определяет основу класса и позволяет подклассам
 * переопределять некоторые его части, не изменяя
 * его структуру в целом
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // Создаем страницы сайта
        WebsiteTemplate indexPage = new IndexPage();
        WebsiteTemplate blogPage = new BlogPage();

        // Показываем страницы
        indexPage.showPage();
        System.out.println("----------------------------");
        blogPage.showPage();
    }
}
