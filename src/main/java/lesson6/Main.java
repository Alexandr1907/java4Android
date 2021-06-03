package lesson6;

import lesson6.cars.Car;
import lesson6.cars.CargoCar;
import lesson6.cars.SportCar;
import lesson6.garage.Garage;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();
        System.out.println(garage.toString());

        SportCar sCar = new SportCar("1234", "2.4л", "Красный", 220, "Ферари");


//        Map<String, Car> name2Car = new HashMap<>();
//        name2Car.put(sCar.getVin(), sCar);
//        System.out.println(name2Car.get("1234"));

        Car[] cars = new Car[2];
        //Заполнение
        for (int i = 0; i < cars.length; i++) {
            cars[i].printInfo();
        }


        CargoCar cCar = new CargoCar("4321", "4л", "Желтый", 100, 10000);
        CargoCar cCar2 = new CargoCar("4321", "4л", "Желтый", 100, 10000);

        System.out.println(cCar.hashCode());

        if (cCar.equals(cCar2)){
            System.out.println("Одинаковые");
        } else {
            System.out.println("Разные");
        }

        garage.addCar(sCar);
        garage.addCar(cCar);

        garage.getCars().forEach(car -> {
            car.run(100);
            if (car instanceof CargoCar) {
                CargoCar cargoCar = (CargoCar) car;
                System.out.println(cargoCar.getClass());
                cargoCar.load();
            }
        });
    }
}
