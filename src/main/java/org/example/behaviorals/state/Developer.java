package org.example.behaviorals.state;

/**
 * Разработчик
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Developer {
    /**
     * Текущее состояние
     */
    private Activity activity;

    /**
     * Установить состояние
     * @param activity состояние
     */
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /**
     * Изменение состояния в
     * зависимости от текущего
     */
    public void changeActivity() {
        if (activity instanceof Sleeping)
            setActivity(new Training());
        else if (activity instanceof Training)
            setActivity(new Coding());
        else if (activity instanceof Coding)
            setActivity(new Reading());
        else if (activity instanceof Reading)
            setActivity(new Sleeping());
    }

    /**
     * Что-то делает
     */
    public void justDoIt() {
        activity.justDoIt();
    }
}
