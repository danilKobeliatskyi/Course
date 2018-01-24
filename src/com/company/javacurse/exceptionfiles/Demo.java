package com.company.javacurse.exceptionfiles;

public class Demo {

    public static void main(String[] args){

        int a = 5;
        int b =0;
        doMath(12, 0);
    }

    public static void doMath(int a, int b){

        answer(a,b);
    }

    public static double answer(int x, int y){
        return x/y;
    }
}
