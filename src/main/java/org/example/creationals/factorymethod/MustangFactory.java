package org.example.creationals.factorymethod;

/**
 * Фабрика по производству
 * автомобилей Mustang
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class MustangFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Mustang();
    }
}
