package main.collection;
//Задача 15. Списки Удаление из списка
// а) Создать список целых чисел и запросить у пользователя ввод 7-10 чисел;
// б) Вывести исходный список на консоль;
// б) Запросить пользователя одно число, которое нужно удалить из списка;
// в) Удалить из списка все вхождения заданного к удалению числа;
// г) Вывести конечный список на консоль.

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Task15 {
//    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        fulfillList(arrayList);
//        printList(arrayList);
//        int value = getValueToRemove();
//        removeValue(value, arrayList);
//        printList(arrayList);
//    }
//
//    public static void fulfillList(ArrayList<Integer> arrayList) {
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 7; i++) {
//            int j = scanner.nextInt();
//            arrayList.add(j);
//        }
//    }
//
//    public static int getValueToRemove() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Число для удаления: " + value);
//        return scanner.nextInt();
//    }
//
//    public static void removeValue(int value, ArrayList<Integer> arrayList) {
//        while (arrayList.contains(value)) {
//            arrayList.remove(Integer.valueOf(value));
//        }
//    }
//
//    public static void printList(ArrayList<Integer> arrayList) {
//        System.out.println("Наш список: " + arrayList);
//    }
//}
