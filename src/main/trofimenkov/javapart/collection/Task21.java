package main.trofimenkov.javapart.collection;

import java.util.*;

//Задача 21. Коллекции. Ключи, значения, вхождения. Данные о странах.
//Нужно:
//а. создать коллекцию countryMap типа HashMap, куда как "ключи-значения" добавить 4 пары "страна-столица";
//б. создать метод, который выводит ключи коллекции в целом и по одному через итератор;
//в. создать метод, который выводит значения коллекции в целом и по одному через итератор;
//г. создать метод, который выводит вхождения коллекции в целом и по одному через итератор;
//д. создать метод, который выводит вхождения коллекции по парам "ключ-значение".
public class Task21 {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Belarus", "Minsk");
        countryMap.put("Russia", "Moscow");
        countryMap.put("France", "Paris");
        countryMap.put("Spain", "Madrid");
        System.out.println("Map: " + countryMap);  //а
        printKeys(countryMap);                     //б
        printValues(countryMap);                   //в
        printEntryPair(countryMap);                // г
        printEntry(countryMap);                    // д
    }

    public static void printKeys(Map<String, String> countryMap) {
        Set<String> keys = countryMap.keySet();
        System.out.println("KeySet: " + keys);
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void printValues(Map<String, String> countryMap) {
        Collection<String> values = countryMap.values();
        System.out.println("Values List: " + values);
        Iterator<String> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void printEntryPair(Map<String, String> countryMap) {
        Set<Map.Entry<String, String>> entrySet = countryMap.entrySet();
        System.out.println("Entry Set: " + entrySet);
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void printEntry(Map<String, String> countryMap) {
        Set<Map.Entry<String, String>> entrySet = countryMap.entrySet();
        System.out.println("Entry Set: " + entrySet);
        for (Map.Entry<String, String> values : entrySet) {
            String key = values.getKey();
            String value = values.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }
    }
}
