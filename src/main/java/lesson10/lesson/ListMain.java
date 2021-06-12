package lesson10.lesson;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        String[] carsArray = new String[5];
        for (int i = 0; i < carsArray.length; i++) {
            carsArray[i] = "Машина " + (i+1);
        }

        ArrayList<String> carsList = new ArrayList<>();
        for (int i = 0; i < carsArray.length; i++) {
            carsList.add(carsArray[i]);
        }
//        carsList.set(2, "Машина 6");
        carsList.add("Машина 1");

        printCars(carsList);

        while (true){
            boolean isSuccess = carsList.remove("Машина 1");
            if (!isSuccess){
                break;
            }
        }

        printCars(carsList);

        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < carsArray.length; i++) {
            linkedList.add(carsArray[i]);
        }

        linkedList.add("Машина 6");
        printCars(linkedList);
    }

    private static void printCars(List<String> carsList) {
        for (String s : carsList) {
            System.out.println("Добавили машину " + s);
        }
        System.out.println();
    }
}
