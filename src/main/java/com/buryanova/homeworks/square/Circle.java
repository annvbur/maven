package com.buryanova.homeworks.square;

/**
 * Created by eugen on 10/27/16.
 */
public class Circle extends Shape {

    private int radix;

    Circle(int r) {
        if (r<=0) {
            throw new IllegalArgumentException("Must be positive, dummy");
        }
        else {
            radix = r;
        }
    }

    public double length() {
        return 2 * Math.PI * radix;
    }

    public double area() {
        return Math.PI * radix * radix;
    }
}
