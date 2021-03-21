package main.trofimenkov.javapart.string;

//Напишите метод, который проверяет является ли слово палиндромом.
public class Task47 {
    public static void main(String[] args) {
        String word = "казак";
        String word1 = "кирпич";
        System.out.println(word + " - Палиндром? - " +  palindrome(word));
        System.out.println(word1 + " - Палиндром? - " +  palindrome(word1));
    }

    public static boolean palindrome(String word) {
        word.trim();
        StringBuilder stringBuilder = new StringBuilder(word);
        String reverse = stringBuilder.reverse().toString();
        return word.equals(reverse);
    }
}
