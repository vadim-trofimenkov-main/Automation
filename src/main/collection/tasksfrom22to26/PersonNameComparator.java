package main.collection.tasksfrom22to26;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}
