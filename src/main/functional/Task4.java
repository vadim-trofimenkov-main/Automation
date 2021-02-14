package main.functional;
/*
Задача 4 (на цикл do...while, остаток от деления и условия)
        Создайте программу, вычисляющую и выводящую на экран сумму цифр трехзначного числа.
        Для этого нужно:
        а. запросить у пользователя именно трехзначное число: использовать цикл do...while,
         повторять его до тех пор, пока введенное число не будет трехзначным;
        б. определить в числе количество сотен, количество десятков и количество единиц;
        в. найти их сумму и передать в консоль, используя форматированный вывод.
*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Please enter 3x symbol digital number: ");
            value = scanner.nextInt();
        } while ( value < 100 || value > 999);
        System.out.println("Entered number: " + value);
        int hundreds = value/100;
        int dozens = value%100/10;
        int units = value%10;
        System.out.println("Hundreds: "+ hundreds);
        System.out.println("Dozens: "+dozens);
        System.out.println("Units: "+units);
        int sum = units + hundreds + dozens;
        System.out.printf("Sum: %d", sum);
    }
}
