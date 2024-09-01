package org.example.behaviorals.iterator;

/**
 * Реализация коллекции в виде
 * Java разработчика
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class JavaDeveloper implements Collection {
    /**
     * Имя
     */
    private String name;
    /**
     * Список умений
     */
    private String[] skills;

    /**
     * Конструктор
     * @param name имя
     * @param skills список умений
     */
    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    /**
     * Получить имя разработчика
     * @return имя разработчика
     */
    public String getName() {
        return name;
    }

    /**
     * Получить итератор коллекции
     * @return итератор
     */
    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    /**
     * Внутренний класс реализующий итератор
     */
    private class SkillIterator implements Iterator {
        /**
         * Индекс
         */
        int index;

        @Override
        public boolean hasNext() {
            if (index < skills.length)
                return true;

            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
