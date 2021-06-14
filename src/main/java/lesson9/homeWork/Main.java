package lesson9.homeWork;

import lesson9.homeWork.exceptions.MyArrayDataException;
import lesson9.homeWork.exceptions.MyArraySizeException;

public class Main {

    public static void main(String[] arg) {
        String[][] arrTwo = new String[][]{{"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "2"},
                {"1", "1", "1", "1"}};
        String[][] arrOne = new String[][]{{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };


        try {
            convertAndSumArr(arrTwo);
            convertAndSumArr(arrOne);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e ){
            System.out.println("В ячейке с индексами: " + (e.i+1) + " " + (e.k+1) + " лежит некорректное значение");
            e.printStackTrace();
        }
    }


    public static void convertAndSumArr(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        if (arr.length != 4){
            throw new MyArraySizeException("Массив должен быть 4 на 4");
        }
        for (String[] strings : arr) {
            if (strings.length!=4){
                throw new MyArraySizeException("Массив должен быть 4 на 4");
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                try {
                    sum += Integer.parseInt(arr[i][k]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(i, k);
                }
            }
        }

        System.out.println(sum);
    }

}