package com.company.javacurse.basics;

public class FibonacciApp {

    public static void main(String[] args) {

        massivs(10);
        //summ(10);
    }

    public static int massivs(int a) {
        int[] mas = new int[a];
        int max = mas[0], min = mas[0], average = mas[0];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = mas[i++];
        }

        for (int i = 0; i < mas.length; i++) {

            if (mas[i] > max) {
                max = mas[i];
                System.out.println(max);
                return max;
            }

            average += mas[i]/mas.length;
            System.out.println(average);


            if (mas[i] < min) {
                min = mas[i];
                System.out.println(min);
                return min;
            }
            return average;
        }
        return massivs(a);
    }
}