package lesson11.homeWork.secondTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] array = {"w", "a", "s", "d"};
        ArrayList<String> list = toArrayList(array);
        Integer[] array2 = {1, 2, 3, 4};
        ArrayList<Integer> integers = toArrayList(array2);
        System.out.println(list);
    }

    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }
}


