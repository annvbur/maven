package com.buryanova.homeworks.square;

/**
 * Created by Ann on 10/26/16.
 */
public class Square {

    public static void main(String[] args) {

        Square form = new Square();
        System.out.println("result for circle:" + form.circle(3,2));
        System.out.println("result for square is:" + form.square(6));
        System.out.println("result for rectangle is:" + form.rectangle(2, 2));
    }


    private static int circle(int radius,int circumference) {
        int result = radius * circumference;
        return result;
    }

    private static int square(int side) {
        int result = side * side;
        return result;
    }

    private static int rectangle(int side1, int side2) {
        int result = side1 * side2;
        return result;
    }


}
