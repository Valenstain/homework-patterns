package org.example.behaviorals.visitor;

/**
 * Visitor (Посетитель)
 * позволяет добавлять в программу новые операции,
 * не изменяя классы объектов, над которыми эти
 * операции могут выполняться.
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // Создаем проект
        Project project = new Project();

        // Создаем разработчиков
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        // Работает Junior
        System.out.println("----- Работает Junior -----");
        project.beWritten(junior);

        // Работает Senior
        System.out.println("----- Работает Senior -----");
        project.beWritten(senior);
    }
}
