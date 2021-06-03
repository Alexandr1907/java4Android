package lesson8;

import lesson8.interfaces.Swimmable;

public abstract class Animal implements Swimmable {
    public static void printDescription() {
        System.out.println("Это базовый класс животных");
    }

    public abstract void run(int length);

    public abstract void jump(double height);
}
