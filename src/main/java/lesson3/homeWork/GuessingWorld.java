package lesson3.homeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessingWorld {
    private static final Scanner sc = new Scanner(System.in);
    private static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        String wordToGuess = getWordToGuess();

        System.out.println("Начнем игру! Компьютер загадал слово из данного списка: " +
                Arrays.toString(words) + ". Пожалуйста, угадайте его. Введите слово.");

        while (true) {
            String guess = sc.nextLine();
            if (guess.equals(wordToGuess)) {
                System.out.println("Поздравляем, Вы выиграли! Загаданное слово - \"" + wordToGuess + "\"");
                break;
            } else {
                String prompt = revealLetters(guess, wordToGuess);
                System.out.println(prompt.equals("###############")
                        ? "Вы не угадали. Попробуйте ещё раз. Введите слово:"
                        : "Не совсем, но Вы угадали некоторые буквы: " + prompt + ". Попробуйте ещё раз. Введите слово:");
            }
        }
        sc.close();
    }

    private static String getWordToGuess() {
        return words[new Random().nextInt(words.length - 1)];
    }

    public static String revealLetters(String guess, String wordToGuess) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Math.min(guess.length(), wordToGuess.length()); i++) {
            sb.append(guess.charAt(i) == wordToGuess.charAt(i) ? guess.charAt(i) : '#');
        }

        while (sb.length() < 15) {
            sb.append("#");
        }
        return sb.toString();
    }
}
