package lesson8;

import lesson8.interfaces.Swimmable;
import lesson8.interfaces.Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Animal[] animals = new Animal[6];

        for (int i = 0; i < animals.length; i++) {
            if (i < animals.length / 2) {
                animals[i] = new Cat();
            } else {
                animals[i] = new Dog();
            }
        }

//        for (int i = 0; i < animals.length; i++) {
//            Animal animal = animals[i];
//            animal.run(100);
//            animal.jump(1.9);
//            animal.swim(5);
//        }

        List<Object> allObjects = new ArrayList<>();

        for (Animal animal : animals) {
            allObjects.add(animal);
//            animal.run(100);
//            animal.jump(1.9);
//            if (animal instanceof Swimmable) {
//                Swimmable swimmable = (Swimmable) animal;// int a = ( int ) Math.random();
//                swimmable.swim(5);
//            }
        }


        Float float1 = new Float();
        float1.swim(1);

        Boat boat = new Boat();
        boat.swim(999999);

        allObjects.add(float1);
        allObjects.add(boat);


        for (Object someObject : allObjects) {
            if (someObject instanceof Animal) {
                Animal someAnimal = (Animal) someObject;
                someAnimal.jump(1);
                someAnimal.run(200);
                someAnimal.swim(10);
            } else if (someObject instanceof Swimmable) {
                Swimmable swimmable = (Swimmable) someObject;
                swimmable.swim(10);
            }
            if (someObject instanceof Test) {
                Test test = (Test) someObject;
                test.swim(10, "s");
            }
            if (someObject instanceof Serializable){
                System.out.println("Это сериализуемый объект");
            }
        }

    }
}
