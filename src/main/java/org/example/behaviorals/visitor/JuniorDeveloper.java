package org.example.behaviorals.visitor;

/**
 * Junior программист
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Написание слабого кода");
    }

    @Override
    public void create(Database database) {
        System.out.println("Ошибки в базе данных");
    }

    @Override
    public void create(Test test) {
        System.out.println("Создает неполные тесты");
    }
}
