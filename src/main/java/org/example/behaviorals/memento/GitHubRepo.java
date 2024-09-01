package org.example.behaviorals.memento;

/**
 * Имитация GitHub
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class GitHubRepo {

    /**
     * Сохранение проекта
     */
    private Save save;

    /**
     * Получить сохранение проекта
     * @return
     */
    public Save getSave() {
        return save;
    }

    /**
     * Задать сохранение проекта
     * @param save сохранение
     */
    public void setSave(Save save) {
        this.save = save;
    }
}
