package org.example.structures.flyweight;

import java.util.ArrayList;
import java.util.List;
/**
 * Паттерн flyweight (Приспособленец) используется для
 * поддержки множества мелких объектов
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpeciality("java"));
        developers.add(developerFactory.getDeveloperBySpeciality("cpp"));

        for (Developer d: developers) {
            d.writeCode();
        }

    }
}
