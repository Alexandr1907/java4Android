package lesson10.lesson;

import java.util.*;

public class MapMain {

    public static void main(String[] args) {
        Human human1 = new Human("Вася");
        Human human2 = new Human("Петя");
        Human human3 = new Human("Игорь");
        Human human4 = new Human("Игорь");
        Car car1 = new Car("Ферари");
        Car car2 = new Car("Ламборгини");
        HashMap<Human, List<Car>> map = new HashMap<>();

        System.out.println(human3 == human4);
        System.out.println(human3.equals(human4));


        map.put(human1, Collections.singletonList(car1));
        map.put(human2, Arrays.asList(car1, car2));
        List<Car> cars = map.get(human2);
        System.out.println(cars);
    }

}
