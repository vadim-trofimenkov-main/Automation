package main.trofimenkov.javapart.functional;

public class RevertArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int l = array.length;
        for (int i = 0; i < l; i++) {
            array[i] = i+1;
        }
        System.out.println(java.util.Arrays.toString(array));
        int[] array2 = new int[10];
         for (int i = l-1, k = 0; i >= 0 ; i--, k++) {    //первое решение
            array2[k] = array[i];
        }
        System.out.println(java.util.Arrays.toString(array2));
       for (int i = 0,  j = l-1;  i <= j ; i++, j--) {      //второе решение
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(java.util.Arrays.toString(array));


    }
}
