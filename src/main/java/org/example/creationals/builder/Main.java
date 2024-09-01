package org.example.creationals.builder;
/**
 * Паттерн Builder (Строитель)
 * используется для созданий различных
 * объектов из одного набора данных
 * @author Vladimir Solodkov
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new HamburgerBuild()
                .addBun("Черная булочка")
                .addCutlet("Говяжья котлета")
                .addTomato("Побольше помидоров")
                .addCheese("Побольше сыра")
                .addSauce("Соуса ненадо").build();

        System.out.println(hamburger);
    }
}
