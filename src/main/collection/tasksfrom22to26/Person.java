package main.collection.tasksfrom22to26;

//Задача 22. Компараторы. Person
//Нужно:
//а. создать класс Person согласно слайдам 105-107 презентации 5;
//б. создать TreeSet объект people класса Person и добавить в него три имени: Daniel, Britney, Alexander;
//в. вывести на консоль имена объекта people и убедиться, что они хранятся в алфавитном порядке.

//Задача 26. Компараторы. PersonDouble
//Нужно:
//а. создать классы PersonDouble, PersonAgeComparator, PersonNameComparator и реализовать в них код согласно слайдов 115-118.

import java.util.Comparator;
import java.util.TreeSet;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
    public static void main(String[] args) {
        Comparator pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person> people = new TreeSet<>(pcomp);
        people.add(new Person("Daniel", 23));
        people.add(new Person("Britney", 34));
        people.add(new Person("Alexander", 10));
        people.add(new Person("Alexander", 11));
        for (Person p: people) {
            System.out.println(p);
        }
    }
}
