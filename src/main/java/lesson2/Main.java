package lesson2;

public class Main {
    public static String name = "Имя проекта";

//    public static void main(String[] args) {
//        String name = "Петя";
//        switch (name) {
//            case "Петя":
//                System.out.println("Привет Петя, как дела?");
//                break;
//            case "Егор":
//                System.out.println("Привет Егор, как жизнь?");
//                break;
//            default:
//                System.out.println("Привет незнакомец");
//        }
//        System.out.println("какая-то логика");


//        for (int i = 0; i<=10; i++){
//            System.out.println(i);
//        }
//
//        for (int counter = 10; counter >=0 ; counter--) {
//            if (counter == 4) {
//                break;
//            }
//            System.out.println(counter);
//        }
//
//    }

//    private static int getRandomInt() {
//        return 8;
//    }

//    public static void main(String[] args) {
////        for (int i = 1; i <= 10; i++) {
////            System.out.println("Начался верхний цикл со счетчиком " + i);
////            for (int j = 1; j <= 10; j++) {
////                System.out.println("i*j = " + i * j);
////            }
////        }
//
////        int i = 0;
////        while (true) {
////            i++;
////            System.out.println(i + " Условие всё еще выполняется");
////            if (i==5) {
////                break;
////            }
////        }
////        int i = 0;
////        boolean catFed = false;
////        do {
////            i++;
////            System.out.println("Покормил кота " + i + " раз");
////            if (i == 1) {
////                System.out.println("Кот наелся");
////                catFed = true;
////            }
////        } while (!catFed);
//        int j = getInt();
//        String s = (j == 0 ? "j = 0" : "j != 0");
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
////        if (j == 0) {
////            s = "j = 0";
////        } else {
////            s = "j != 0";
////        }
//        System.out.println(s);
//    }
//
//    private static int getInt() {
//        System.out.println("Зашли в гет инт");
//        return 1;
//    }
//}
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++) {
            System.out.println(i);
            if (i==5) {
                continue;
            }
            System.out.println("Не будет при i==5. i = " + i);
        }
    }
}

