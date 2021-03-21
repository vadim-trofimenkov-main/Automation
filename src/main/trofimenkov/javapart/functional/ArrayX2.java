//Задача 2
//1. Объявить целочисленный массив размером 10 элементов;
//2. Заполнить элементы массива индексами элемента в квадрате (обычный цикл for);
//3. Вывести на консоль все элементы массива, при этом те из них, которые делятся на 3 или на 7, заменить на ноль, используя цикл for(each).

package main.trofimenkov.javapart.functional;
import java.util.Arrays;
public class ArrayX2 {
    public static void main ( String[] args) {
        int[] array = new int [10];
        int length = array.length;
        for( int i = 0; i < length; i++){
            array[i] = i * i;
        }
        System.out.println(Arrays.toString(array));
        for (int l: array){
           if(l%3 == 0  || l%7 == 0){
               l = 0;
           }
            System.out.print(l + " ");
        }
    }
}

