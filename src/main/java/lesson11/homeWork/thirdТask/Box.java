package lesson11.homeWork.thirdТask;


import java.util.ArrayList;
import java.util.Arrays;

public class Box <T extends Fruit> {

    private final ArrayList<T> fruits = new ArrayList<>();

    public Box() {
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0;
        } else {
            return fruits.size() * fruits.get(0).getWeight();
        }
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void replaceAllIn(Box<T> tBox) {
        tBox.fruits.addAll(fruits);
        fruits.clear();
    }

    public void addFruit(T fruit, int summ) {
        for (int i = 0; i < summ; i++) {
            fruits.add(fruit);
        }
    }

    public void addFruit(T... addFruits) {
        fruits.addAll(Arrays.asList(addFruits));
    }

    public static void arrayToList(Object[] arr) {
        ArrayList<Object> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);

    }
}
