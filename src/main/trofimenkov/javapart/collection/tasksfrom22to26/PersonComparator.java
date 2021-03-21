package main.trofimenkov.javapart.collection.tasksfrom22to26;
//Задача 25. Компараторы. PersonComparator
//Нужно:
//а. создать класс PersonComparator и реализовать в нем компаратор согласно слайдов 111-112.

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}
