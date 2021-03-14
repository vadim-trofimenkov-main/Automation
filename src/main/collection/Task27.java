package main.collection;

//Задача 27.
//Нужно:
//а. Создать коллекцию ArrayList и добавить в него 6 строчных элементов;
//б. Используя итератор, вывести на консоль элементы коллекции в строку через пробел;
//в. Используя итератор, добавить к каждому элементу знак "+";
//г. Используя итератор, вывести на консоль элементы измененной коллекции в строку через пробел;
//д. Используя итератор, вывести на консоль элементы измененной коллекции задом наперед в строку через пробел;

import java.util.ArrayList;
import java.util.Iterator;

public class Task27 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        Iterator<String> iterator = arrayList.iterator();
        Iterator<String> iterator1 = arrayList.iterator();
        Iterator<String> iterator2 = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println("------------adding + to all elements---------");
        int index = 0;
        while (iterator1.hasNext()) {
            arrayList.set(index, arrayList.get(index) + "+");
            System.out.print(iterator1.next() + " ");
            index++;
        }
        index -=1;
        System.out.println();
        System.out.println("------------reversing collection---------");
        while (iterator2.hasNext()) {
            System.out.print( arrayList.get(index) +  " ");
            iterator2.next();
            index--;
        }
    }
}
