package lesson13.lesson;

import java.util.concurrent.Semaphore;

public class Car implements Runnable{
    private static int COUNTER = 0;
    private final double speed;
    private Semaphore semaphore;
    private int currentNumber;

    public Car(double speed) {
        this.speed = speed;
        COUNTER++;
        currentNumber = COUNTER;
    }

    @Override
    public void run() {
        System.out.printf("Машина %d подъехала к мосту\n", currentNumber);
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Машина %d въехала на мост\n", currentNumber);
        try {
            double d = 1000/speed;
            long time = (long) d;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Машина %d проехала мост\n", currentNumber);
        semaphore.release();
    }

    public void setSemaphore(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
}
