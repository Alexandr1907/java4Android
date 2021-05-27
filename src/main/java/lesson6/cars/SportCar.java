package lesson6.cars;

public class SportCar extends Car{
    private String name;

    public SportCar(String vin, String engine, String color, int maxSpeed, String name) {
        super(vin, engine + "Из конструктора", color, maxSpeed);
        this.name = name;
//        System.out.println(engine);
//        System.out.println(this.engine);
//        System.out.println(super.engine);
    }

    public void fill() {
        System.out.println("Спорткар заправляется");
    }

    @Override
    public void run(int length) {
        System.out.println("Мчит как ветер со скоростью " + maxSpeed + ", на расстояние " + length);
    }

    @Override
    public void stop() {
        System.out.println("Тормозит с визгом");
    }

    @Override
    public void signal() {
        System.out.println("Пищит");
    }

    @Override
    public String toString() {
        return super.toString() +
                " SportCar{" +
                "name='" + name + '\'' +
                '}';
    }
}
