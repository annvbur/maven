package com.buryanova.homeworks.square;

/**
 * Created by Ann on 10/26/16.
 */
public class Square extends Shape {

    int side;

    public Square(int s) {
        side = s;
    }

    public double length() {
        return 4 * side;
    }

    public double area() {
        return side * side;
    }




}
