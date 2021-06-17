package lesson12.lesson;

public class MyThreadExample extends Thread {
    private final int count;

    public MyThreadExample(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("Привет мир из отдельного потока №" + count);
    }
}
