package org.example.structures.decorator;

/**
 * Java разрабочик
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write Java code";
    }
}
