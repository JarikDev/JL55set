package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        Set set2 = new LinkedHashSet();
        Set set3 = new TreeSet();

        set1.add("1");
        set1.add("5");
        set1.add("4");
        set1.add("3");
        set1.add("2");
        set1.add("3");
        set1.add("3");
        set1.add("3");
        for (Object o: set1) {
            System.out.println(o );
        }
    }
}
