package org.example.behaviorals.iterator;
/**
 * Iterator (Итератор)
 * позволяет последовательно обходить элементы составных объектов,
 * не расскрывая их внутреннего представления
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // Создаем список умений
        String[] skills = {"Java", "Hibernate", "Springboot", "Gradle", "Maven"};

        // Создаем разработчика
        JavaDeveloper javaDeveloper = new JavaDeveloper("Vladimir Solodkov", skills);

        // Получаем итератор разработчика
        Iterator iterator = javaDeveloper.getIterator();

        // Выводим начальную информацию
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills:");

        // Используя итератор обходим список умений
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
