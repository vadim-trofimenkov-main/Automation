package main;
/*Элементы массива, которые меньше среднего арифметического, умножить на два.
        Для этого нужно:
        а. объвить массив arr размером 10 элементов;
        б. запросить у пользователя ввод целочисленных значений элементов массива arr в цикле;
        в. вывести исходный массив arr в консоль;
        г. объявить переменную sum;
        д. найти сумму элементов массива arr, используя цикл for(each);
        е. объявить переменную avg и вычислить среднее арифметическое элементов массива;
        ж. в цикле for (обычном) умножить на 2 все элементы массива arr, которые меньше среднего арифметического;
        з. вывести итоговый массив arr в консоль.*/

import java.util.Arrays;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
    int[] arr = new int[10];
        int t = arr.length;
        Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < t; i++) {
            System.out.println("PLease enter digital value:");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int r :arr) {
            sum += r;
        }
        System.out.println("Sum: " + sum);
        int avg = sum / t;
        System.out.println("Average: " + avg);
        for (int i = 0; i < t; i++) {
        if(arr[i] < avg ){
            arr[i] *= 2;
        }
        }
        System.out.println("Final array: " + Arrays.toString(arr));
    }
}
