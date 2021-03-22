package main.trofimenkov.javapart.lambda;

import java.util.Scanner;

//Задача 57. Лямбда-функции
//Запросить ввод слова через консоль.
//Написать лямбда-фукнцию, которая проверяет является ли слово палиндромом.
public class Task57l {
    public static void main(String[] args) {
        String word = enterWord();
        Expression expression = s -> {
            s.trim();
            StringBuilder stringBuilder = new StringBuilder(s);
            String reverse = stringBuilder.reverse().toString();
            return s.equals(reverse);
        };
        System.out.println("Entered word palindrome? " + expression.isPalindrome(word));
    }

    interface Expression {
        boolean isPalindrome(String s);
    }

    public static String enterWord() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
