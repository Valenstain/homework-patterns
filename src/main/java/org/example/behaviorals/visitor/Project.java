package org.example.behaviorals.visitor;

/**
 * Проект
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Project implements ProjectElement {

    /**
     * Список элементов
     */
    private ProjectElement[] projectElements;

    /**
     * Конструктор
     * заполняем ProjectElement[] projectElements
     */
    public Project() {
        this.projectElements = new ProjectElement[] {
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement pe: projectElements) {
            pe.beWritten(developer);
        }
    }
}
