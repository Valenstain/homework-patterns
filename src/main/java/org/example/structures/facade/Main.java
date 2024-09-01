package org.example.structures.facade;
/**
 * Паттерн Facade (Фасад) используется для унификации
 * интерфейса, вместо нескольких
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.run();
    }
}
