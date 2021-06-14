package lesson8.homeWork.member;

import lesson8.homeWork.interfaces.Member;

public class Robot implements Member {
    private int maxRun;
    private double maxHeight;

    public Robot(int maxRun, double maxHeight) {
        this.maxRun = maxRun;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean run(int length) {
        if (maxRun >= length) {
            System.out.println("Робот пробежал");
            return true;
        } else {
            System.out.println("Робот не вытянул");
            return false;
        }

    }

    @Override
    public boolean jump(double height) {
        if (maxHeight >= height) {
            System.out.println("Робот перепрыгнул");
            return true;
        } else {
            System.out.println("Робот не смог прыгнуть");
            return false;
        }
    }
}
