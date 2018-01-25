package com.company.javacurse.algoritms;

public class Sort {

    public static void bubbleSort(int[] dataSet){

        System.out.print("\nOriginal Array: \n");
        printArray(dataSet);

        boolean swapped = false;
        do {

            for (int i = 0; i < dataSet.length - 1; i++) {

                if (dataSet[i] > dataSet[i + 1]) {

                    int temp = dataSet[i];
                    dataSet[i] = dataSet[i + 1];
                    dataSet[i + 1] = temp;
                    System.out.print("SWAP ");
                    printArray(dataSet);
                    swapped = true;
                }
            }
        }while (swapped);
    }

    private static void printArray(int[] array){

        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
