package org.example.creationals.builder;
/**
 * Интерфейс строителя объекта
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public interface HamburgerBuilder {

    public HamburgerBuilder addBun(String bun);

    public HamburgerBuilder addCutlet(String cutlet);

    public HamburgerBuilder addCheese(String cheese);

    public HamburgerBuilder addTomato(String tomato);

    public HamburgerBuilder addSauce(String sauce);

    public Hamburger build();

}
