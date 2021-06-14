package lesson8.lesson;

import java.util.Random;

public class Cat extends Animal {
    private int maxRunLength;
    private double maxJumpHeight;

    public Cat() {
        Random random = new Random();
        maxRunLength = 150 + random.nextInt(101);
        maxJumpHeight = 1.8 + random.nextInt(5)/10.0;
    }

    @Override
    public void run(int length){
        if (length>maxRunLength){
            System.out.println("Кот не может столько носиться");
        } else {
            System.out.println("Кот пробегает дистанцию");
        }
    }

    @Override
    public void jump(double height) {
        if (height>maxJumpHeight){
            System.out.println("Кот не может перепрыгнуть");
        } else {
            System.out.println("Кот перепрыгнул");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кот не умеет плавать, но очень старается");
    }
}
