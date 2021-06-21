package lesson13.lesson;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 5; i++) {
//            new Thread(new MyClass()).start();
//        }

//        Semaphore semaphore = new Semaphore(3);
//
//        for (int i = 0; i < 5; i++) {
//            Car car = new Car(Math.random() * 200);
//            car.setSemaphore(semaphore);
//            new Thread(car).start();
//        }

//        CountDownLatch latch = new CountDownLatch(6);
//        int[] variables = {2, 5, 8};
//
//        for (int i = 0; i < 3; i++) {
//            int w = i;
//            new Thread(() -> {
////                try {
////                    Thread.sleep(100);
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
//                latch.countDown();
//                variables[w] = 10*23-4+27*w*variables[w];
//                System.out.println(w + ": получившееся число " + variables[w]);
//                latch.countDown();
//            }).start();
//        }
//
//        System.out.println("Поток мейн дошел до ожидания");
//        latch.await();
//        int sum = 0;
//        for (int i = 0; i < variables.length; i++) {
//            sum+=variables[i];
//        }
//        System.out.println("Получившееся число " + sum);


        CyclicBarrier barrier = new CyclicBarrier(5, () -> {
            System.out.println("Народу набралось достаточно, можем загружаться");
        });

        Minibus minibus = new Minibus();

        for (int i = 0; i < 10; i++) {
            int w = i;
            new Thread(() -> {
                System.out.println("Человек " + w + " пришёл к маршрутке");
                minibus.addNames("Человек " + w);
                try {
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Человек " + w + " усаживается на место");
            }).start();
        }
    }
}
