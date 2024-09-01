package org.example.structures.flyweight;

/**
 * C++ разработчик
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer write c++ code");
    }
}
