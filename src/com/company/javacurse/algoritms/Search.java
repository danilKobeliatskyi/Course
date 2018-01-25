package com.company.javacurse.algoritms;

public class Search {

    public static int linearSearch(int[] dataSet, int target){

        for (int i = 0; i < dataSet.length; i++){
            if (dataSet[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] dataSet, int target, int start, int end){

        System.out.println("Searching between " + dataSet[start] + " and " + dataSet[end]);
        int middpoint = (int) Math.floor((start+ end)/2);
        //System.out.println("Midpoint: " + middpoint);
        int value = dataSet[middpoint];
        //System.out.println("Value: " + value);

        if (target > value){

            System.out.println(target + " > " + value);
            return binarySearch(dataSet, target, middpoint + 1, end);
        }
        else if (target < value){

            System.out.println(target + " < " + value);
            return binarySearch(dataSet, target, start, middpoint -1);
        }
        System.out.println(target + " = " + value);
        return middpoint;
    }
}
