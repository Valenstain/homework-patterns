package org.example.behaviorals.chain;
/**
 * Chain of responsibility (Цепочка ответственности)
 * Помогает избежать привязки отрпавителя запроса
 * к его получателю, что дает возможность обработать
 * данный запрос нескольким объектам
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        // Создаем объекты, которые будут учавствовать в цепочке
        Notifier simpleNotifier = new SimpleNotifier(Priority.LOW);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.HIGH);

        // Задаем последовательность цепочки
        simpleNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        // Отправляем запросы с разным приоритетом
        simpleNotifier.notifyManager("Низший уровень приоритета", Priority.LOW);
        System.out.println("-----------------------------------");
        simpleNotifier.notifyManager("Средний уровень приоритета", Priority.IMPORTANT);
        System.out.println("-----------------------------------");
        simpleNotifier.notifyManager("Высший уровень приоритета", Priority.HIGH);
    }
}
