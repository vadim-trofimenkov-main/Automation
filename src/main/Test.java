package main;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int[] array = {1, 4, 5, 7, 8 ,9};
        int sum;
        Util util = new Util();
        sum = util.getSumOfArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(sum);
    }
}
