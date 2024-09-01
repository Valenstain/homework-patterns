package org.example.creationals.builder;
/**
 * Реализация интерфейса строителя объекта
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class HamburgerBuild implements HamburgerBuilder {

    /**
     * Объект, который будет строиться
     */
    private Hamburger hamburger = new Hamburger();

    @Override
    public HamburgerBuilder addBun(String bun) {
        hamburger.setBun(bun);
        return this;
    }

    @Override
    public HamburgerBuilder addCutlet(String cutlet) {
        hamburger.setCutlet(cutlet);
        return this;
    }

    @Override
    public HamburgerBuilder addCheese(String cheese) {
        hamburger.setCheese(cheese);
        return this;
    }

    @Override
    public HamburgerBuilder addTomato(String tomato) {
        hamburger.setTomato(tomato);
        return this;
    }

    @Override
    public HamburgerBuilder addSauce(String sauce) {
        hamburger.setSauce(sauce);
        return this;
    }

    /**
     * Завнершающий строительство метод
     * @return выстроеный объект
     */
    @Override
    public Hamburger build() {
        return hamburger;
    }
}
