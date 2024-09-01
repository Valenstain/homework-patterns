package org.example.behaviorals.chain;
/**
 * Приоритет
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public enum Priority {
    HIGH(3),
    IMPORTANT(2),
    LOW(1);

    private int level;

    Priority(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
