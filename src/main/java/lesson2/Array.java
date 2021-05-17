package lesson2;

import java.util.Arrays;

public class Array {
//    public static void main(String[] args) {
//        Double[] array = new Double[10];
//        Double[] array1 = {1.23, 2.32, 3.12};
//        array[0] = 1.23;
//        System.out.println(array[0]);
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i+0.5;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//        Double[] array = new Double[10];
//        array[0] = 1.23;
//        System.out.println(array[0]);
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i+0.5;
//        }
//
//        for (Double aDouble : array) {
//
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }

    public static void main(String[] args) {
        int[][] arr = new int[5][10];
        for (int i = 0; i < arr.length; i++) {
            int[] innerArray = arr[i];
            for (int j = 0; j < innerArray.length; j++) {
                innerArray[j] = i * j;
                System.out.println(innerArray[j]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i * j;
                System.out.println(arr[i][j]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private int[] returnArray() {
        return new int[10];
    }
}
