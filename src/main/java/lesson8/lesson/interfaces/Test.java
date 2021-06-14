package lesson8.lesson.interfaces;

public interface Test {
    void swim(int length, String s);

    default void testMethod() {
        System.out.println("Реализация поумолчанию");
    }
}
