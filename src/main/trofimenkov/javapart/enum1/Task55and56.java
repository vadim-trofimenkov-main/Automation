package main.trofimenkov.javapart.enum1;

//Задача 55. Перечисления. Кошачьи
//Создать перечисление для животных вида кошачьих.
// Вывести на консоль элементы перечисления и их порядковые номера в перечислении.

//Задача 56. Перечисления. Месяц
//Создать перечисление месяцев.
//Вывести на консоль название текущего месяца по его номеру:
//LocalDate today = LocalDate.now();
//int month = today.getMonthValue();

import java.time.LocalDate;

public class Task55and56 {
    public static void main(String[] args) {
        //-----------------------task55-----------------------------
        Cats[] catsFinal = Cats.values();
        for (int i = 0; i < catsFinal.length; i++) {
            System.out.println("Животное: " + catsFinal[i] + " Индекс: " + i);
        }
        for (Cats c : catsFinal) {
            System.out.println("Животное: " + c.name() + " Индекс: " + c.ordinal());
        }
        //-----------------------task56-----------------------------
        LocalDate today = LocalDate.now();
        int month = today.getMonthValue();
        Month[] months = Month.values();
        System.out.println(months[month - 1]);
    }
}
