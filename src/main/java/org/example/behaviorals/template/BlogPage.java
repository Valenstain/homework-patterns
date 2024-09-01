package org.example.behaviorals.template;
/**
 * Блог
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class BlogPage extends WebsiteTemplate {

    @Override
    public void showContent() {
        System.out.println("Статьи");
    }
}
