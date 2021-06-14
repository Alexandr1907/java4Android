package lesson8.lesson;

import lesson8.lesson.interfaces.Swimmable;

public class Boat implements Swimmable {
    @Override
    public void swim(int length) {
        System.out.println("Лодка преодолевает любые расстояния");
    }
}
