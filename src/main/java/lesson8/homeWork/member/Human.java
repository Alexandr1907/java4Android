package lesson8.homeWork.member;

import lesson8.homeWork.interfaces.Member;

public class Human implements Member {
    private int maxRun;
    private double maxHeight;

    public Human(int maxRun, double maxHeight) {
        this.maxRun = maxRun;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(int length) {
        if (maxRun >= length) {
            System.out.println("Человек пробежал");
            return true;
        } else {
            System.out.println("Человек не вытянул");
            return false;
        }

    }

    @Override
    public boolean jump(double height) {
        if (maxHeight >= height) {
            System.out.println("Человек перепрыгнул");
            return true;
        } else {
            System.out.println("Человек не смог прыгнуть");
            return false;
        }
    }
}
