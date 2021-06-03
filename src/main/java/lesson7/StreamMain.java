package lesson7;

import jdk.internal.util.xml.impl.ReaderUTF8;

import java.io.*;
import java.nio.file.Files;

public class StreamMain {

    public static void main(String[] args) throws Exception {
        Files.copy()
//        System.out.println("D:\\teaching\\javaCoreForAndroid\\lesson7");
//        File file = new File("D:\\teaching\\javaCoreForAndroid\\lesson7\\test.txt");
//
//        FileInputStream inputStream = new FileInputStream(file);
//        long start = System.nanoTime();
//        int x;
//        do {
//            x = inputStream.read();
//            System.out.println(x);
//        } while (x != -1);
//        inputStream.close();
//
//        long finish = System.nanoTime();
//        System.out.println(finish - start);

        copyWithBuffer();
    }

    public static void copyWithBuffer() throws Exception {
        BufferedReader br = new BufferedReader(new ReaderUTF8(new FileInputStream("D:\\teaching\\javaCoreForAndroid\\lesson7\\test.txt")));

        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\teaching\\javaCoreForAndroid\\lesson7\\test2.txt"));

        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line + '\n');

            System.out.println(line);
            sb.append(line);
            sb.append('\n');
        }

        br.close();
        bw.close();

        System.out.println("Итоговое значение: " + sb.toString());
    }


}
