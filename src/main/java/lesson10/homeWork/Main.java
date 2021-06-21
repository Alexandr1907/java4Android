package lesson10.homeWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] words = {"a", "a", "b", "c", "d", "d", "c", "e", "f", "a"};
//        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
//        System.out.println(uniqueWords);
//        uniqueWords.addAll(Arrays.asList(words));
//        for (String word : words) {
//            uniqueWords.add(word);
//        }

        HashMap<String, Integer> words2Count = new HashMap<>();
        for (String word : words) {
            int count = words2Count.getOrDefault(word, 0);
            words2Count.put(word, ++count);
        }

        System.out.println(words2Count.keySet());
        System.out.println(words2Count);


        PhoneBook book = new PhoneBook();
        book.add("Вася", "1234");
        book.add("Вася", "1234");
        book.add("Вася", "4321");
        book.add("Петя", "999");
        book.add("Игорь", "666");
        book.add("Игорь", "789");

        System.out.println(book.get("Вася"));
        System.out.println(book.get("Петя"));
        System.out.println(book.get("Игорь"));
    }
}
