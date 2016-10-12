package com.buryanova.homeworks.sumOfNumbers;

/**
 * Created by Ann on 10/1/16.
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        int number = 51000;
        int sum = 0;
        while (number > 0){
            sum = sum + (number % 10);
            number = (number - sum) / 10;
        }
        System.out.print(sum);
    }
}




