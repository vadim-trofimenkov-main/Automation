package main.trofimenkov.javapart.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            int j = scanner.nextInt();
            arrayList.add(j);
        }
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - 1; j++) {
                if (arrayList.get(i + 1) < arrayList.get(i)){
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
        System.out.println(arrayList);
    }
}
