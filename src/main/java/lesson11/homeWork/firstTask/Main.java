package lesson11.homeWork.firstTask;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer arr1[] = {1, 10, 3, 4, 15};
        replacement(arr1, 1, 4);

    }

    public static void replacement(Object[] array, int elm1, int elm2) {

        System.out.println("Массив до: " + Arrays.toString(array));
        Object temp = array[elm1];
        array[elm1] = array[elm2];
        array[elm2] = temp;
        System.out.println("Массив после замены элементов №" + elm1 + " на №" + elm2 + " " + Arrays.toString(array));

    }

}
