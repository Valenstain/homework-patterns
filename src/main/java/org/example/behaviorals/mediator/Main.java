package org.example.behaviorals.mediator;
/**
 * Mediator (Посредник)
 * позволяет уменьшить связанность множества
 * классов между собой, благодаря перемещению
 * этих связей в один класс-посредник
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        user1.sendMessage("Hello, I'm user 1");
    }
}
