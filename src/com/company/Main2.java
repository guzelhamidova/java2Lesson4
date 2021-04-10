package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main2 {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Meerim", 78));
        people.add(new Person("Mike", 23));
        people.add(new Person("Mirlan", 33));
        people.add(new Person("Jack", 21));
        people.add(new Person("Lucie", 54));
        people.add(new Person("Scarlet", 21));
        people.add(new Person("Scarlet", 21));
        people.add(new Person("Scarlet", 21));


        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println(p.getName() + " " + p.getAge());
        }

        Collections.sort(people);

        System.out.println("=================");
        iterator = people.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
