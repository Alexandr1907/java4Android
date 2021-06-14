package lesson8.homeWork.barrier;

import lesson8.homeWork.interfaces.Barriers;

public class Treadmill implements Barriers {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
