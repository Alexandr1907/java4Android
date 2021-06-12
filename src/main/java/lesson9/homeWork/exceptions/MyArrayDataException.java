package lesson9.homeWork.exceptions;

public class MyArrayDataException extends Exception {
    public int i;
    public int k;

    public MyArrayDataException(int i, int k) {
        this.i = i;
        this.k = k;

    }

}