package com.buryanova.homeworks.square;

/**
 * Created by eugen on 10/27/16.
 */
public class Main {

    public static void main(String[] args) {


        Shape [] shapes = new Shape[3];
        shapes[0] = new Square(5);
        shapes[1] = new Rectangle(2,3);
        shapes[2] = new Circle(15);

        for (Shape shape : shapes) {
            System.out.println(shape.length() + " " + shape.area());
        }



        /*System.out.println("result for circle:" + form.circle(3,2));
        System.out.println("result for square is:" + form.square(6));
        System.out.println("result for rectangle is:" + form.rectangle(2, 2));*/
    }
}
