package lesson14.lesson;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());


    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Старт приложения");


        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        logger.info("Финиш приложения");
    }
}
