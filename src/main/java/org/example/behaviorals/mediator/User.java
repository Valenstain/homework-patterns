package org.example.behaviorals.mediator;
/**
 * Интерфейс пользователя
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public interface User {
    /**
     * Отправить сообщение
     * @param message сообщение
     */
    public void sendMessage(String message);

    /**
     * Получить сообщение
     * @param message сообщение
     */
    public void getMessage(String message);
}
