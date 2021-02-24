//Задача 19. Коллекции. Отображения HashMap. Поменять ключи и значения в отображении Map
//Напишите метод, который получает на вход отображение HashMap и возвращает новое отображение HashMap,
// где ключи и значения обращены местами.
//Нужно:
//а. создать отображение initialMap типа HashMap;
//б. наполнить отображение initialMap 10 элементами с ключами, равными 0...9, и значениями, равными ключу, умноженному на 2;
//в. вывести на консоль отображение initialMap;
//г. создать метод inverse, который принимает в качестве аргумента отображение типа HashMap,
// меняет местами ключи отображения и его значения и возвращает отображение resultMap типа HashMap;
//д. в методе main вывести на консоль отображение, полученное вызовом метода inverse, в которое было передано отображение initialMap.

package main.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task19And20 {
    private static HashMap<Integer, Integer> initialMap = new HashMap<>();
    private static TreeMap<Integer, Integer> resultMap = new TreeMap<>();

    public static void main(String[] args) {

        fulfillMap(initialMap);
        System.out.println(initialMap);
        resultMap = inverse(initialMap, resultMap);
        System.out.println(resultMap);
    }

    public static void fulfillMap(Map<Integer, Integer> hashMap) {
        for (int i = 1; i < 11; i++) {
            hashMap.put(i, i * 2);
        }
    }

    public static TreeMap<Integer, Integer> inverse(HashMap<Integer, Integer> initialMap1, TreeMap<Integer, Integer> resultMap1) {
        Set<Integer> keys = initialMap1.keySet();
        for (Integer key : keys) {
            Integer value = initialMap1.get(key);
            resultMap1.put(value, key);
        }
        return resultMap1;
    }

}
