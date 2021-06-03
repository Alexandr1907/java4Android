package lesson7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String p = "1";
        Date dateStart = new Date();
//        concatenate(p);
        concatenate2(p);
        Date finishDate = new Date();
        System.out.println(finishDate.getTime() - dateStart.getTime());
    }

    private static void concatenate(String s) {
        for (int i = 0; i < 1_000_000; i++) {
            s = s + "1";
        }
        System.out.println(s);
    }

    private static void concatenate2(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("1");
        }
        System.out.println(sb.toString());
    }

    private static void test(int i) {
        if (i == 2) {
            System.out.println("i = 2");
        }
    }
}
