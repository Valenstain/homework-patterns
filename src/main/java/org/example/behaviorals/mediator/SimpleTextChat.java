package org.example.behaviorals.mediator;

import java.util.ArrayList;
import java.util.List;
/**
 * Простой чат
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class SimpleTextChat implements Chat {

    /**
     * Администратор
     */
    private User admin;
    /**
     * Список пользователей
     */
    private List<User> users = new ArrayList<>();

    /**
     * Задать администратора чата
     * @param admin администратор
     */
    public void setAdmin(User admin) {
        this.admin = admin;
    }

    /**
     * Добавить пользователя
     * @param user пользователь
     */
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {

        // Сообщение получают все кроме отправителя
        for (User u: users) {
            if (u != user) {
                u.getMessage(message);
            }
        }

        // Отдельно получает сообщение администратор
        admin.getMessage(message);
    }
}
