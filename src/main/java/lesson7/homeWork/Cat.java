package lesson7.homeWork;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        return isFull;
    }
}