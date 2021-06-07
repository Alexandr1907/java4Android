package lesson9;

import lesson9.exceptions.MyClassException;

import java.util.Random;

public class MyClass implements AutoCloseable{

    private final Random random = new Random();
    public void printWithError() throws MyClassException{
        if (random.nextBoolean()){
            System.out.println("Выпало тру");
        } else {
            throw new MyClassException("Тебе не повезло, выпало фолс");
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("Закрыли ресурсы в нашем классе");
    }
}
