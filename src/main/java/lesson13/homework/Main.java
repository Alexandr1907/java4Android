package lesson13.homework;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static final int CARS_COUNT = 10;

    public static void main(String[] args) throws Exception {
        CyclicBarrier barrier = new CyclicBarrier(CARS_COUNT+1);
        CountDownLatch latch = new CountDownLatch(CARS_COUNT);
        CountDownLatch finishLatch = new CountDownLatch(CARS_COUNT);

        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));

        Car[] cars = new Car[CARS_COUNT];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
            cars[i].setBarrier(barrier);
            cars[i].setLatch(latch);
            cars[i].setFinishLatch(finishLatch);
        }


        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        latch.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");

        finishLatch.await();
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}

