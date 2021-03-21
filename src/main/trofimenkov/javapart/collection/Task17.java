package main.trofimenkov.javapart.collection;

import java.util.HashSet;
import java.util.Set;

//Задача 17. Коллекция Set (Набор)
//        Нужно:
//        а. создать массив, содержащий в себе названия 7 цветов радуги;
//        б. создать генератор случайных чисел (int)(Math.random() * (max - min) + min), выделив его в метод;
//        в. используя генератор сформировать четыре разных набора по три разных цвета воздушных шариков в каждом;
//        г. вывести на консоль наборы цветов воздушных шариков.

public class Task17 {
    public static void main(String[] args) {
        String[] array = new String[]{
                "Красный", "Орнажевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"
        };
        int l = 0;
        while (l < 4) {
            Set<String> color = new HashSet<>();
            generateSet(array, color);
            System.out.println(color);
            l++;
        }
    }

    public static Integer random(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static void generateSet(String[] array, Set<String> color) {
        while (color.size() < 3) {
            int random = random(array.length, 0);
            String value = array[random];
            color.add(value);
        }
    }
//    public static Set<Integer> generateUniqueSet() {
//        Set<Integer> set = new HashSet<>();
//        while (set.size() < 3) {
//            int random = random(6, 0);
//            set.add(random);
//        }
//        return set;
//    }
}
