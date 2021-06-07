package lesson9;

import lesson9.exceptions.MyClassException;

import java.sql.SQLException;

public class Main {

//    public static void main(String[] args) {
//        try {
//            int a = 0, b = 10;
//            System.out.println(b/a);
//        } catch (ArithmeticException e){
//            System.out.println("Делить на ноль очень плохо");
//            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Элемент за пределами массива");
//            e.printStackTrace();
//        }
//    }

//    public static void main(String[] args) {
//        try {
//            int a = 0, b = 10;
//            System.out.println(b/a);
//        } catch (Exception e){
//            System.out.println("Ловим все исключения, блок дальше никогда не выполнится");
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
//    }

//    public static void main(String[] args) {
//        try {
//            int a = 0, b = 10;
//            System.out.println(b/a);
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("У массива нет такого индекса");
//        } catch (IndexOutOfBoundsException e){
//            System.out.println("Индекс чего-то за пределом");
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        try (MyClass myClass = new MyClass()) {
            myClass.printWithError();
            System.out.println("Квадратный корень из 4 =" + sqrt(4));
            System.out.println("Квадратный корень из 0 =" +sqrt(0));
        } catch (ArithmeticException e){
            System.out.println("Вы ввели некорректное число");
            e.printStackTrace();
        } catch (SQLException e){
            System.out.println("Проблемы с БД");
            e.printStackTrace();
        } catch (MyClassException e){
            System.out.println("Ну ты и \"везучий\"");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Что-то полшло не так...");
            e.printStackTrace();
        } finally {
            System.out.println("А вы молодец");
        }
    }

    private static double sqrt(int in) throws ArithmeticException {
        if (in == 0) {
            throw new ArithmeticException("Квадратный корень из 0 не вычисляется");
        }
        System.out.println("in = " + in);
        System.out.println("Выполнится, если in != 0");
        return Math.sqrt(in);
    }
}
