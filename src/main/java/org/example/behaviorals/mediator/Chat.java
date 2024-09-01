package org.example.behaviorals.mediator;

/**
 * Интерфейс чата
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public interface Chat {
    /**
     * Отправить сообщение
     * @param message Сообщение
     * @param user Пользователь
     */
    public void sendMessage(String message, User user);
}
