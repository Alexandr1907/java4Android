package lesson14.lesson;

import org.apache.log4j.BasicConfigurator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sum() {
        BasicConfigurator.configure();
        Calculator calculator = new Calculator();
        int sum = calculator.sum(1, 2);
        Assert.assertEquals(3, sum);
    }
}