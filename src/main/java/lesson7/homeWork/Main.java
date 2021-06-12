package lesson7.homeWork;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(55);

        Cat[] cats = {
                new Cat("Гавр", 30),
                new Cat("Барс", 50),
                new Cat("Рокс", 30),
                new Cat("Мурзик", 10),
                new Cat("Васька", 25),
        };

        for (Cat cat : cats) {
            cat.eat(plate);
            if (cat.isFull()){
                System.out.println(cat.getName() + " наевси и спит");
            } else {
                System.out.println(cat.getName() + " требовательно мяучит, надо бы покормить");
            }
        }

        plate.appendFood(100);
    }
}