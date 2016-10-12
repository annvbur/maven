package com.buryanova.homeworks.homework_1;

/**
 * Created by Ann on 8/10/16.
 */
public class MyFirstTest{
    public static void main(String[] args) {
        MyFirstTest obj = new MyFirstTest();
        System.out.println(obj.minFunction(5,2));
    }

    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }
}

