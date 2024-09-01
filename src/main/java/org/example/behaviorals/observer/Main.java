package org.example.behaviorals.observer;

/**
 * Observer (Наблюдатель)
 * создает механизм подписки, позволяющий одним
 * объектам следить и реагировать на события
 * происходящие в других объектах
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // Создаем сайт вакансий
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        // Добавляем начальные вакансии
        jobSite.addVacancy("Первая вакансия");
        jobSite.addVacancy("Вторая вакансия");

        // Добавляем пописчиков
        Observer subscriber1 = new Subscriber("Евгений");
        Observer subscriber2 = new Subscriber("Михаил");
        jobSite.addObserver(subscriber1);
        jobSite.addObserver(subscriber2);

        // Добавляем еще одну вакансию
        System.out.println("----- Добавлена вакансия -----");
        jobSite.addVacancy("Третья вакансия");

        // Удаляем одну вакансию
        System.out.println("----- Удалена вакансия -----");
        jobSite.removeVacancy("Вторая вакансия");
    }
}
