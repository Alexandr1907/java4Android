package lesson2;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonalArray(5);
        minAndMaxArray();
        System.out.println("6)");

        int arr[] = {1, 1, 1, 2, 1};
        System.out.println("   " + equalSummaDelimiter(arr));

        int number = 1;
        int array[] = {4, 3, 5, 1};
        displaceArray(array, number);

    }

    public static void invertArray() {
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 2);
        }
        System.out.println("1)   " + Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1) {
                mass[i] = 0;
            } else {
                mass[i] = 1;
            }
        }
        System.out.println("     Измененный массив");
        System.out.println("     " + Arrays.toString(mass));
    }

    public static void fillArray() {
        int[] mass = new int[8];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i*3;
        }
        System.out.println("2)   " + Arrays.toString(mass));
    }

    public static void changeArray() {
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6) {
                mass[i] = mass[i] * 2;
            }
        }
        System.out.println("3)   " + Arrays.toString(mass));
    }

    public static void fillDiagonalArray(int size) {
        int[][] mass = new int[size][size];
        System.out.println("4)");
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass.length; j++) {
//                if (i == j) {
//                    mass[i][j] = 1;
//                } else if (mass.length-1-i == j){
//                    mass[i][j] = 1;
//                }
//            }
//
//            System.out.println(Arrays.toString(mass[i]));
//        }
        for (int i = 0; i < mass.length; i++) {
            mass[i][i] = 1;
            mass[mass.length - 1 - i][i] = 1;
        }
        for (int[] ints : mass) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void minAndMaxArray() {
        System.out.print("5) ");
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(mass));

        int min = mass[0];
        int max = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
            if (mass[i] < min) {
                min = mass[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    public static boolean equalSummaDelimiter(int[] arr) {
        int delimiter = 1;
        while (true) {
            if (summaDelimiter(arr, delimiter)) {
                writeArrayDelimiter(arr, delimiter);
                return true;
            }
            delimiter++;
            if (delimiter == arr.length) {
                writeArrayDelimiter(arr);
                return false;
            }
        }
    }

    public static boolean summaDelimiter(int[] arr, int delimiter) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.length; i++) {
            if (delimiter < i) {
                left = left + arr[i];
            } else {
                right = right + arr[i];
            }
        }
        if (right == left) {
            return true;
        } else {
            return false;
        }

    }

    public static void writeArrayDelimiter(int[] arr, int delimiter) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
            if (delimiter == i) {
                System.out.print("|| ");
            }
        }
        System.out.print("]");
    }

    public static void writeArrayDelimiter(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
    }

    public static void displaceArray(int[] arr, int number) {
        System.out.println(Arrays.toString(arr));
        if (number > 0) {
            while (number>0){
                arr=oneDisplaceRight(arr);
                number--;
            }
        } else {
            while (number<0){
                arr= oneDisplaceLeft(arr);
                number++;
            }

        }

        System.out.println(Arrays.toString(arr));
    }

    public static int[] oneDisplaceRight(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    public static int[] oneDisplaceLeft(int[] arr) {
        int[] arrTime = new int[arr.length];
        arrTime[arr.length - 1] = arr[0];
        for (int i = 0; i < (arr.length - 1); i++) {
            arrTime[i] = arr[i + 1];
        }
        return arrTime;
    }
}