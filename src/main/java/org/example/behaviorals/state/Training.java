package org.example.behaviorals.state;
/**
 * Состояние тренировки
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Training implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Training...");
    }
}
