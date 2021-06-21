package lesson13.lesson;

import java.util.concurrent.atomic.AtomicBoolean;

public class MyClass implements Runnable {
    private static volatile AtomicBoolean isFirstFinish = new AtomicBoolean(false);

    @Override
    public void run() {
        if (!isFirstFinish.getAndSet(true)){
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("Привет из первого потока");
        } else {
            System.out.println("Привет из следующего потока");
        }

    }
}
