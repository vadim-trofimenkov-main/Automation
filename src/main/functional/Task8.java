package main.functional;

import java.util.Scanner;

public class Task8 {
    static int value;
    static int sum;
    public static void main(String[] args) {
     value = enterValue();
     System.out.println("Entered number: " + value);
     sum = getSum(value);
     System.out.printf("Sum: %d", sum);
    }

    public static int enterValue(){
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Please enter 3x symbol digital number: ");
            value = scanner.nextInt();
        } while ( value < 100 || value > 999);
        return value;
    }
    public static int getSum(int value){
        int sum;
        int hundreds = value/100;
        int dozens = value%100/10;
        int units = value%10;
        System.out.println("Hundreds: "+ hundreds);
        System.out.println("Dozens: "+dozens);
        System.out.println("Units: "+units);
        sum = units + hundreds + dozens;
        return sum;
    }
}