package lesson6;

import lesson6.cars.CargoCar;
import lesson6.cars.SportCar;
import lesson6.garage.Garage;

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();
        System.out.println(garage.toString());

        SportCar sCar = new SportCar("1234", "2.4л", "Красный", 220, "Ферари");
        CargoCar cCar = new CargoCar("4321", "4л", "Желтый", 100, 10000);

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
