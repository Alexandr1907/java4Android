package lesson7.homeWork;

import lesson7.homeWork.exceptions.NegativeEatCountException;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int appetite) {
        if (food - appetite<0){
            throw new NegativeEatCountException("В тарелке не может быть меньше 0 еды");
        }
        food -= appetite;
    }

    public void appendFood(int foodValue) {
        food += foodValue;
    }

    public int getFood() {
        return food;
    }
}