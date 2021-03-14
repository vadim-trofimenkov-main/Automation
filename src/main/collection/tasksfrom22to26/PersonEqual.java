package main.collection.tasksfrom22to26;

import java.util.TreeSet;

//Задача 24. Компараторы. equalPerson
//Нужно:
//а. создать класс PersonEqual согласно слайду 108 презентации 5;
//б. создать TreeSet объект peopleEqual класса PersonEqual и добавить в него три имени: Billy, Willy, Dilly;
//в. вывести на консоль имена объекта peopleEqual и объяснить, что призошло )
public class PersonEqual implements Comparable<PersonEqual> {
    private String name;

    public PersonEqual(String name) {
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
    public int compareTo(PersonEqual o) {
        return name.length() - o.getName().length();
    }

    public static void main(String[] args) {
        TreeSet<PersonEqual> people = new TreeSet<>();
        people.add(new PersonEqual("Billy"));
        people.add(new PersonEqual("Willy"));
        people.add(new PersonEqual("Dilly"));
        System.out.println(people);    //выводит на экран только "Billy" ,тк компаратор сравнивает по длине имени,
        //  а все имена равны, в трисет не записываются "Willy" и "Dilly", потому что java думает, что добавляются одинаковые объекты
    }
}
