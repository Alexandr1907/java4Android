package lesson14.lesson;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class.getName());

    public Calculator() {
        logger.info("Создали калькулятор");
    }

    public int sum(int a, int b){
        logger.info("Суммирую " + a + " + " + b);
        return a+b;
    }
}
