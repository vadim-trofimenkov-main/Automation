//Задача 18. Коллекции. Множество TreeSet. Уникальные наборы цветов шариков
// Решить Задачу 17 таким образом, чтобы четыре сформированных набора были уникальны, т.е. не повторялись между собой.

package main.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task18 {
    private static final String[] ARRAY = {"Красный", "Орнажевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"};

    public static void main(String[] args) {

        Set<TreeSet<String>> threeSet = new HashSet<>();
        fulfillHashSet(threeSet);
        System.out.println("Final TreeSet: " + threeSet);
    }

    public static Integer random(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static void generateTreeSet(String[] array, Set<String> color) {
        while (color.size() < 3) {
            int random = random(array.length, 0);
            String value = array[random];
            color.add(value);
        }
    }

    public static void fulfillHashSet(Set<TreeSet<String>> hashSet) {
        while (hashSet.size() < 4) {
            TreeSet<String> color = new TreeSet<>();
            generateTreeSet(ARRAY, color);
            hashSet.add(color);
        }
    }
}
