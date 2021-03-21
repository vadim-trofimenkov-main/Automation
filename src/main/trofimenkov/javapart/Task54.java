package main.trofimenkov.javapart;

import java.util.HashMap;
import java.util.Map;

//Задача 54. Дженерики
//Напишите метод, который получает на вход массив элементов
// типа К (Generic) и возвращает Map<K, Integer>, где K — значение из массива, а Integer — хэш-код данного значения.
//То есть сигнатура метода выглядит так: public static <K> Map<K, Integer> arrayToHashMap(K[] genericArray) {}
public class Task54 {
    public static void main(String[] args) {
        String[] relatives = {"Мама", "Папа", "Дедушка", "Бабушка"};
        Map<String, Integer> family = arrayToHashMap(relatives);
        System.out.println(family);
        Integer[] numbers = {2,5,8,10};
        Map<Integer,Integer> mapNumbers = arrayToHashMap(numbers);
        System.out.println(mapNumbers);
    }

    public static <K> Map<K, Integer> arrayToHashMap(K[] genericArray) {
        Map<K, Integer> map = new HashMap<>();
        for (K k : genericArray) {
            map.put(k, k.hashCode());
        }
        return map;
    }
}
