package lesson8.homeWork.barrier;

import lesson8.homeWork.interfaces.Barriers;

public class Wall implements Barriers {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
