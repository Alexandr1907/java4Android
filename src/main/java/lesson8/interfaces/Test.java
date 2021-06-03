package lesson8.interfaces;

public interface Test {
    void swim(int length, String s);

    default void testMethod() {
        System.out.println("Реализация поумолчанию");
    }
}
