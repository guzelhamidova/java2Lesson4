package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(5);

        names.add("Islam");
        names.add("Dima");
        names.add("Tim");
        names.add("Tom");

        for (String name: names) {
            System.out.println(name);
        }

        ArrayList<String> namesToCopy = new ArrayList<>();
        namesToCopy.add("Masha");
        namesToCopy.add("Misha");
        namesToCopy.add("Mike");
        namesToCopy.add("Marina");

        names.addAll(namesToCopy);

        printList(names);

        System.out.println("Is there any Tom? - "+names.contains("Tom"));
        System.out.println("Is there any Tom? - "+namesToCopy.contains("Tom"));

        names.add(3, "Glen");
        printList(names);

        //names.remove("Mike");
        //names.remove(5);
        //names.set(3, "Aisuluu");

        printList(names);

        //names.removeAll(namesToCopy);
        printList(names);

        System.out.println("Is the list empty? - "+names.isEmpty());
        //names.clear();
        System.out.println("Is the list empty? - "+names.isEmpty());

        Object[] array = new Object[namesToCopy.size()];
        namesToCopy.toArray(array);
        // Object[] array = namesToCopy.toArray();
        System.out.println(Arrays.toString(array));

        Collections.sort(names);
        Collections.reverse(names);
        printList(names);
    }

    public static void printList(ArrayList<String> list){
        System.out.println("_________________");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(i+" - "+list.get(i));
        }
    }
}
