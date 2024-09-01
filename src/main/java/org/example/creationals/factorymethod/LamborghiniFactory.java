package org.example.creationals.factorymethod;

/**
 * Фабрика по производству Lamborghini
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class LamborghiniFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new Lamborghini();
    }
}
