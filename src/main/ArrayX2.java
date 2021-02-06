package main;

import java.util.Arrays;
public class ArrayX2 {
    public static void main ( String[] args) {
        int[] array = new int [10];
        int length = array.length;
        for( int i = 0; i < length; i++){
            array[i] = i * i;
        }
        System.out.println(Arrays.toString(array));
    }
}

