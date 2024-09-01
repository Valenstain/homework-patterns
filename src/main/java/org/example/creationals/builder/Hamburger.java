package org.example.creationals.builder;
/**
 * Гамбургер
 * Класс, который используется в
 * качестве основы для строительства объекта
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Hamburger {
    /**
     * Булочка
     */
    private String bun;
    /**
     * Котлетка
     */
    private String cutlet;
    /**
     * Сыр
     */
    private String cheese;
    /**
     * Помидорчик
     */
    private String tomato;
    /**
     * Соус
     */
    private String sauce;

    /**
     * Добавить булочку
     * @param bun описание булочки
     */
    public void setBun(String bun) {
        this.bun = bun;
    }

    /**
     * Добавить катлетку
     * @param cutlet описание какая именно котлетка
     */
    public void setCutlet(String cutlet) {
        this.cutlet = cutlet;
    }

    /**
     * Добавить сыр
     * @param cheese описание используемого сыра
     */
    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    /**
     * Добавить помидорчики
     * @param tomato описание помидорчиков
     */
    public void setTomato(String tomato) {
        this.tomato = tomato;
    }

    /**
     * Добавить соуса
     * @param sauce описание соуса (кетчунез)
     */
    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    /**
     * Формирование рецепта
     * @return рецепт гамбургера
     */
    @Override
    public String toString() {
        return "Hamburger:\n" +
                "bun: " + bun + "\n" +
                "cutlet: " + cutlet + "\n" +
                "cheese: " + cheese + "\n" +
                "tomato: " + tomato + "\n" +
                "sauce: " + sauce;
    }
}
