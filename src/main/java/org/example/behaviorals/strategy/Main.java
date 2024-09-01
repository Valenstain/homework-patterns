package org.example.behaviorals.strategy;

/**
 * Strategy (Стратегия)
 * определяет семейство схожих алгоритмов и
 * помещает каждый из них в собственный класс,
 * после чего алгоритмы можно взаимозаменять
 * прямо во время исполнения программы.
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // Создаем разработчика
        Developer developer = new Developer();

        // Устанавливаем состояние сна и выполняем
        developer.setActivity(new Sleeping());
        developer.executeActivity();

        // Устанавливаем состояние тренировки и выполняем
        developer.setActivity(new Training());
        developer.executeActivity();

        // Устанавливаем состояние написания кода и выполняем
        developer.setActivity(new Coding());
        developer.executeActivity();

        // Устанавливаем состояние чтения и выполняем
        developer.setActivity(new Reading());
        developer.executeActivity();

        // Устанавливаем состояние сна и выполняем
        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
