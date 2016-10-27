package com.buryanova.homeworks.square;

/**
 * Created by eugen on 10/27/16.
 */
public class Rectangle extends Shape {

    int width;

    int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    public double length() {
        return (width + height) * 2;
    }

    public double area() {
        return width * height;
    }
}
