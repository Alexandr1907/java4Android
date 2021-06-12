package lesson7.homeWork.exceptions;

public class NegativeEatCountException extends RuntimeException{
    public NegativeEatCountException(String message) {
        super(message);
    }
}
