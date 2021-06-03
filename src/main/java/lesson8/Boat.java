package lesson8;

import lesson8.interfaces.Swimmable;

public class Boat implements Swimmable {
    @Override
    public void swim(int length) {
        System.out.println("Лодка преодолевает любые расстояния");
    }
}
