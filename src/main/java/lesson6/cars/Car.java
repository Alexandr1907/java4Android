package lesson6.cars;

public abstract class Car {
    protected String vin;
    protected String engine;
    protected String color;
    protected int maxSpeed;

    public Car(String vin, String engine, String color, int maxSpeed) {
        this.vin = vin;
        this.engine = engine;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public abstract void run(int length);
    public abstract void stop();
    public abstract void signal();

    public final void printInfo() {
        System.out.println(toString());
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

}
