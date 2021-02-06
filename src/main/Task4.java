package main;
/*
Задача 4 (на цикл do...while, остаток от деления и условия)
        Создайте программу, вычисляющую и выводящую на экран сумму цифр трехзначного числа.
        Для этого нужно:
        а. запросить у пользователя именно трехзначное число: использовать цикл do...while, повторять его до тех пор, пока введенное число не будет трехзначным;
        б. определить в числе количество сотен, количество десятков и количество единиц;
        в. найти их сумму и передать в консоль, используя форматированный вывод.
*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Please enter 3x symbol digital: ");
            value = scanner.nextInt();
        } while ( value < 100 || value > 999);
        System.out.println("Our digital: " + value);
        int first = value%10;
        int third = value%100/10;
        int second = value/100;
        System.out.println(second);
        System.out.println(third);
        System.out.println(first);
        int sum = first + second + third;
        System.out.printf("Sum: %d", sum);
    }
}
