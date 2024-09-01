package org.example.structures.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Основной класс реализующий паттерн
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class DeveloperFactory {
    /**
     * Список мелких объектов в виде
     * Map<Специальность, Объект>
     */
    private static final Map<String, Developer> developers = new HashMap<>();

    /**
     * Выбирает объект по специальности
     * Если такого объекта нет, то генерирует новый
     * и добавляет его в коллекцию
     * @param speciality специальность
     * @return объект
     */
    public Developer getDeveloperBySpeciality(String speciality) {

        // Получаем объект
        Developer developer = developers.get(speciality);

        // Если объект есть, возвращаем его
        if (developer != null)
            return developer;

        // В зависимости от специальности подбираем объекты
        developer = switch (speciality) {
            case "java" -> {
                System.out.println("Hiring Java developer");
                yield new JavaDeveloper();
            }
            case "cpp" -> {
                System.out.println("Hiring C++ developer");
                yield new CppDeveloper();
            }
            default -> developer;
        };

        // Добавляем объект в коллекцию
        developers.put(speciality, developer);

        return developer;
    }
}
