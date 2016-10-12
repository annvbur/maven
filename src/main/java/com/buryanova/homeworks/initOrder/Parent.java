package com.buryanova.homeworks.initOrder;

/**
 * Created by Ann on 10/1/16.
 */
public class Parent {

    static int x = 5;
    //System.out.println("static variable: " + x);
    int k = 4;
    //System.out.println("not static variable: " + k);

    {
        System.out.println("not static parent block");
    }

    static{
        System.out.println("static parent block");
    }

    public static Parent obj = new Parent();

    public Parent(){
        System.out.println("parent constructor");
    }

    public static class Child extends Parent
    {
        static int y = 3;
        //System.out.println("static child variable: " + y);
        int j = 6;
        //System.out.println("not static child variable: " + j);

        static{
            System.out.println("static child block");
        }

        {
            System.out.println("not static child block");
        }

        public Child(){
            System.out.println("child constructor");
        }

    }

    public static void main(String[] args) {
        Parent m = new Parent.Child();
        System.out.println("main method");

    }
}
/*
Questions:
1. Why I can't write System.out.println("static variable: " + x); - to print static int, etc?
*/