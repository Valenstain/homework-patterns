package org.example.creationals.factorymethod;

/**
 * Автомобиль Mustang
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Mustang implements Car {
    @Override
    public void model() {
        System.out.println("It's Ford mustang shelby GT500 1969");
    }
}
