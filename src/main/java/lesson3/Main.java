package lesson3;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        skannerTesting();
        for (int i = 0; i < 100; i++) {
            randomTesting();
        }
        stringFormatTesting("Вася Привет, как у тебя сегодня дела?");
        stringFormatTesting(11);
        stringFormatTesting("Вася", 11);
        formattedPrint("Привет, %s! %s", "Вася", "(От Игоря)");
        formattedPrint("Привет, %s! %s %s", "Вася", "(От Игоря)");
    }

    public static void skannerTesting() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число, потом строку");
        int i = sc.nextInt();
        String s = sc.nextLine();
        System.out.println("Введенное число " + i);
        System.out.println("Введенное слово \"" + s + "\"");

        sc.close();
    }

    public static void randomTesting() {
        Random random = new Random();
        int nextInt = random.nextInt(20);
        System.out.print(nextInt + " ");
//        (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void stringFormatTesting(String name) {
        String[] fio = name.split(" ", 2);
        String firstName = fio[0];
        int startMessageIndex = name.indexOf(fio[1]);
        String mes = name.substring(startMessageIndex, 20);
        String message = fio[1];
//        System.out.println("Привет, " + name + "!");
        System.out.printf("%s пишет: %s", firstName, mes);
    }

    public static void stringFormatTesting(int i) {
        System.out.println("Привет, " + i + "!");
        System.out.printf("Привет, %s!", i);
    }

    public static void stringFormatTesting(String name, int age) {
        System.out.println("Привет, " + name + ", которому " + age + " лет!");
        System.out.printf("Привет, %s, которому %d лет!", name, age);
    }

    public static void formattedPrint(String text, String... arg){
        for (int i = 0; i < arg.length; i++) {
            text = text.replaceFirst("%s", arg[i]);
        }
        System.out.println(text);
    }
}
