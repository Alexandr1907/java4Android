package lesson6.cars;

import org.omg.SendingContext.RunTime;

import java.util.HashMap;

public class CargoCar extends Car {
    private int maxWeight;
    public CargoCar(String vin, String engine, String color, int maxSpeed, int maxWeight) {
        super(vin, engine, color, maxSpeed);
        this.maxWeight = maxWeight;
    }

    public void load() {
        System.out.println("Грузовик загружается");
    }

    @Override
    public void run(int le) {
        System.out.println("Ревёт и ползёт на дистанцию " + le);
    }

    @Override
    public void stop() {
        System.out.println("Встал как вкопанный");
    }

    @Override
    public void signal() {
        System.out.println("Сносит деревья звуковой волной");
    }

    @Override
    public String toString() {
        return super.toString() +
                " CargoCar{" +
                "maxWeight=" + maxWeight +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CargoCar) {
            CargoCar cargoCar = (CargoCar) obj;
            return this.vin.equals(cargoCar.vin);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return vin.hashCode();
    }
}
