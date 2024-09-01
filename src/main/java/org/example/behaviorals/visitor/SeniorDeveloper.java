package org.example.behaviorals.visitor;
/**
 * Senior программист
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class SeniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Написание первокласного кода");
    }

    @Override
    public void create(Database database) {
        System.out.println("Исправлены все ошибки в базе данных");
    }

    @Override
    public void create(Test test) {
        System.out.println("Создает доскональные тесты");
    }
}
