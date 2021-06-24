package lesson13.homework;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private final static AtomicBoolean hasViner = new AtomicBoolean();
    private final Race race;
    private final int speed;
    private final String name;
    private CyclicBarrier barrier;
    private CountDownLatch latch;
    private CountDownLatch finishLatch;

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            if (latch != null) {
                latch.countDown();
            }
            if (barrier != null) {
                barrier.await();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }

        if (!hasViner.getAndSet(true)) {
            System.out.println(">>>>>>>>>>" + this.name + " ПОБЕДИТЕЛЬ!!!!!!!<<<<<<<<<<");
        } else {
            System.out.println(this.name + " неудачник");
        }

        finishLatch.countDown();
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setBarrier(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public void setFinishLatch(CountDownLatch finishLatch) {
        this.finishLatch = finishLatch;
    }

}

