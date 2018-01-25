package com.company.javacurse.datastructures;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args){

        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Cleveland");
        cities.add("Toronto");
        cities.add("Chicago");
        cities.add("Miami");

        for (String city : cities)
            System.out.println(city);

        int size = cities.size();

        System.out.println("There are " + size + " elements in the collection");

        System.out.println(cities.get(0));
        cities.remove(0);

        size = cities.size();
        System.out.println("Now, there are " + size + " elements in the collection");
        for (String city : cities)
            System.out.println(city);
    }
}
