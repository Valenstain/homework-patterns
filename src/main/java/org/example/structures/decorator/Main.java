package org.example.structures.decorator;
/**
 * Паттерн Decorator (Декоратор) используется для
 * в качестве альтернативы порождению подклассов
 * для расширения функциональности
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());

        System.out.println(developer.makeJob());
    }
}
