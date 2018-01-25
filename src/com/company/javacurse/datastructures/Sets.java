package com.company.javacurse.datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args){

        Set<String> animals = new TreeSet<>();

        animals.add("Dog");
        animals.add("Pig");
        animals.add("Hog");
        animals.add("Cat");
        animals.add("Snake");

        System.out.print(animals.size() + " " + animals);

        animals.add("Cat");
        animals.add("Snake");
        animals.add("Goose");

        System.out.println("\n" + animals.size() + " " + animals);

        Set<String> farmAnimals = new HashSet<String>();

        farmAnimals.add("Chicken");
        farmAnimals.add("Cow");
        farmAnimals.add("Pig");
        farmAnimals.add("Horse");
        farmAnimals.add("Dog");

        Set<String> intersectionSet = new HashSet<String>(animals);

        System.out.println(intersectionSet);

        intersectionSet.retainAll(farmAnimals);

        System.out.println("The intersection is: " + intersectionSet);

        Set<String> unionSet = new HashSet<String>(farmAnimals);

        unionSet.addAll(animals);

        System.out.println("The Union is: " + unionSet);

        Set<String> differenceSet = new HashSet<String>(animals);

        differenceSet.removeAll(farmAnimals);

        System.out.println("Difference is: " + differenceSet);
    }
}
