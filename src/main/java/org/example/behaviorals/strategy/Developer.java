package org.example.behaviorals.strategy;

/**
 * Разработчик
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Developer {
    /**
     * Состояние
     */
    private Activity activity;

    /**
     * Установить состояние
     * @param activity
     */
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /**
     * Выполнить состояние
     */
    public void executeActivity() {
        activity.justDoIt();
    }
}
