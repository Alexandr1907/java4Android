package lesson9.homeWork;

import lesson9.homeWork.exceptions.MyArrayDataException;
import lesson9.homeWork.exceptions.MyArraySizeException;

public class Main {

    public static void main(String[] arg) {
        String[][] arrTwo = new String[][]{{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};
        String[][] arrOne = new String[][]{{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };


        try {
            convertAndSumArr(arrTwo);
        } catch (MyArraySizeException e) {
            System.out.println("The array was entered incorrectly. Cast a 4 by 4 array. ");
        } catch (MyArrayDataException e) {
            System.out.println("Mistake " + e.i + " - " + e.k);
        }
    }


    public static void convertAndSumArr(String[][] arrTwo) throws MyArrayDataException, MyArraySizeException {
        int convert;
        int sum = 0;
        int maxLine = arrTwo.length;
        int maxColumn = arrTwo[0].length;

        if (maxLine != 4 || maxColumn != 4) {
            throw new MyArraySizeException("size");
        }
        for (int i = 0; i < arrTwo.length; i++) {
            for (int k = 0; k < arrTwo[0].length; k++) {
                try {
                    convert = Integer.parseInt(arrTwo[i][k]);
                    sum = sum + convert;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, k);
                }
            }
        }
        System.out.println(sum);
    }

}