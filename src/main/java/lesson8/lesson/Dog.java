package lesson8.lesson;

import java.util.Random;

public class Dog extends Animal {
    private int maxRunLength;
    private double maxJumpHeight;
    private int maxSwimLength;

    public Dog(){
        Random random = new Random();
        maxRunLength = 400 + random.nextInt(201);
        maxJumpHeight = 0.4 + random.nextInt(3)/10.0;
        maxSwimLength = 8 + random.nextInt(5);
    }

    @Override
    public void run(int length) {
        if (length>maxRunLength){
            System.out.println("Собака не может столько носиться");
        } else {
            System.out.println("Собака пробегает дистанцию");
        }
    }

    @Override
    public void jump(double height) {
        if (height>maxJumpHeight){
            System.out.println("Собака не может перепрыгнуть");
        } else {
            System.out.println("Собака перепрыгнула");
        }
    }

    @Override
    public void swim(int length) {
        if (length>maxSwimLength){
            System.out.println("Собака не может столько плыть");
        } else {
            System.out.println("Собака проплыла дистанцию");
        }
    }
}
