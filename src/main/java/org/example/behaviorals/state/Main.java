package org.example.behaviorals.state;

/**
 * State (Состояние)
 * позволяет объектам менять поведение в
 * зависимости от своего состояния. Извне
 * создаётся впечатление, что изменился
 * класс объекта.
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // Создаем состояние
        Activity activity = new Sleeping();

        // Создаем разработчика
        Developer developer = new Developer();

        // Устанавливаем текущее состояние
        developer.setActivity(activity);

        // Меняем состояние 10 раз
        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
            developer.changeActivity();
        }

    }
}
