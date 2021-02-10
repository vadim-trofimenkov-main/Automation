package main;

/* Задача 7
        Решить задачу 3, выделив в чистые методы:
        а. поиск суммы элементов массива (входящий параметр - только массив, возвращаемое значение - сумма элементов);
        б. вычисление среднего арифметического элементов массива (входящий параметр - массив, возвращаемое значение -
        среднее арифметическое);
        в. умножение элементов массива, меньших среднего арифметического,
        на два (входящие параметры - массив, среднее арифметическое, множитель; возвращаемое значение - новый массив).
 */

import java.util.Arrays;
import java.util.Scanner;
public class Task7 {
    static int[] arr;
    static int t;
    static double sum;
    static double avg;


    public static void main(String[] args) {
        setArray();
        System.out.println("Array" + Arrays.toString(arr));
        sum = getSum(arr);
        System.out.println("Sum: " + sum);
        avg = getAverage(arr);
        System.out.println("Average: " + avg);
        multiplyTwo(arr, avg, 2);
        System.out.println("Final array: " + Arrays.toString(arr));
        }


        public static void setArray(){
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < t; i++) {
                System.out.println("PLease enter digital value:");
                arr[i] = scanner.nextInt();
            }
        }
        public static double getSum(int[] array){
        sum = 0;
            for (int r :array) {
                sum += r;
            }
            return sum;
        }

        public static double getAverage(int[] array){
        double average = sum / t;
        return average;
        }

        public static void multiplyTwo(int[] arr, double avg, int x){
            for (int i = 0; i < t; i++) {
                if(arr[i] < avg ){
                    arr[i] *= x;
                }
            }
        }
    }

