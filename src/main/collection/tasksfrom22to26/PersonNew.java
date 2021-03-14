package main.collection.tasksfrom22to26;
//Задача 23. Компараторы. newPerson
//Нужно:
//а. создать класс PersonNew согласно слайду 108 презентации 5;
//б. создать TreeSet объект peopleNew класса PersonNew и добавить в него три имени: Daniel, Britney, Alexander;
//в. вывести на консоль имена объекта peopleNew и убедиться, что они хранятся в порядке их длины.

import java.util.TreeSet;

public class PersonNew implements Comparable<PersonNew>{
    private String name;

    public PersonNew(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }

    @Override
    public int compareTo(PersonNew o) {
        return name.length()-o.getName().length();
    }

    public static void main(String[] args) {
        TreeSet<PersonNew> people = new TreeSet<>();
        people.add(new PersonNew("Daniel"));
        people.add(new PersonNew("Britney"));
        people.add(new PersonNew("Alexander"));
        System.out.println(people);
    }
}
