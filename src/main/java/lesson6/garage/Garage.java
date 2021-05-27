package lesson6.garage;

import lesson6.cars.Car;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public ArrayList<Car> getCars() {
        return cars;
    }
}
