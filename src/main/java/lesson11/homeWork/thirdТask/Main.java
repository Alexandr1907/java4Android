package lesson11.homeWork.thirdТask;

public class Main {

    public static void main(String[] args) {

        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        orangeBox1.addFruit(new Orange(),5);

        Orange[] oranges = {new Orange(), new Orange()};

        orangeBox1.addFruit(oranges);
        orangeBox2.addFruit(new Orange(),10);
        appleBox1.addFruit(new Apple(),15);
        appleBox2.addFruit(new Apple(),20);

        System.out.println("Первая(1) коробка с апельсинами: " + orangeBox1.getWeight()
        + "\nВторая(2) коробка с апельсинами: " + orangeBox2.getWeight()
        + "\nПервая(1) коробка с яблоками: " + appleBox1.getWeight()
        + "\nВторая(2) коробка с яблоками: " + appleBox2.getWeight());

        System.out.println("Сравниваем первые(1) две: " +orangeBox1.compare(appleBox1)
                        +"\nСравниваем вторые(2) две: " +orangeBox2.compare(appleBox2));
        //пересыпаем
        orangeBox1.replaceAllIn(orangeBox2);
        appleBox1.replaceAllIn(appleBox2);

        System.out.println("Первая(1) коробка с апельсинами: " + orangeBox1.getWeight()
                + "\nВторая(2) коробка с апельсинами: " + orangeBox2.getWeight()
                + "\nПервая(1) коробка с яблоками: " + appleBox1.getWeight()
                + "\nВторая(2) коробка с яблоками: " + appleBox2.getWeight());
    }

}
