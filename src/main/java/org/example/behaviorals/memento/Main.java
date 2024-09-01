package org.example.behaviorals.memento;
/**
 * Memento (Хранитель)
 * используется для сохранения внутреннего
 * состояния оъекта за его пределы
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // Создаем проект
        Project project = new Project();

        // Создаем имитацию гитхаба
        GitHubRepo gitHubRepo = new GitHubRepo();

        // Задаем параметры проекта
        System.out.println("New project 1.0");
        project.setVersionAndDate("v 1.0");

        // Смотрим
        System.out.println(project);

        // Сохраняем проект
        System.out.println("Save new project 1.0 to GitHub");
        gitHubRepo.setSave(project.save());

        // Обновляем данные проекта
        System.out.println("Updating project to version 2.0");
        project.setVersionAndDate("v 2.0");

        // Смотрим и сравниваем
        System.out.println(project);

        // Откатываем данные проекта из сохранения
        System.out.println("Rollback to version 1.0");
        project.load(gitHubRepo.getSave());

        // Смотрим и сравниваем
        System.out.println("After rollback: " + project);
    }
}
