package lesson8.homeWork.member;

import lesson8.homeWork.interfaces.Member;

public class Cat implements Member {
    private int maxRun;
    private double maxHeight;

    public Cat(int maxRun, double maxHeight) {
        this.maxRun = maxRun;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(int length) {
        if (maxRun >= length) {
            System.out.println("Кот пробежал");
            return true;
        } else {
            System.out.println("Кот не вытянул");
            return false;
        }

    }

    @Override
    public boolean jump(double height) {
        if (maxHeight >= height) {
            System.out.println("Кот перепрыгнул");
            return true;
        } else {
            System.out.println("Кот не смог прыгнуть");
            return false;
        }
    }
}
