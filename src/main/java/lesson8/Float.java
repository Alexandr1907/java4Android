package lesson8;

import lesson8.interfaces.Swimmable;
import lesson8.interfaces.Test;

import java.io.Serializable;

public class Float implements Swimmable, Test, Serializable {

    @Override
    public void swim(int length) {
        System.out.println("Поплавок болтается на месте");
    }

    @Override
    public void swim(int length, String s) {
        System.out.println("Особое плаванье");
        testMethod();
    }

    @Override
    public void testMethod() {
        Test.super.testMethod();
    }
}
