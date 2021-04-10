package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Practice {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>(3);
        colors.add("White");
        colors.add("Pink");
        colors.add("Gray");

        colors.ensureCapacity(6);
        colors.add("Black");
        colors.add("Green");
        colors.add("Silver");

        Iterator<String> iter = colors.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        Collections.sort(colors);
        System.out.println("A to Z: ");
        System.out.println("===================");
        iter = colors.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Collections.reverse(colors);
        System.out.println("Z to A:");
        System.out.println("===================");
        iter = colors.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
