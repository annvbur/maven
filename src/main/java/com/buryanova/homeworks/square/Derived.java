package com.buryanova.homeworks.square;

/**
 * Created by eugen on 10/27/16.
 */
public class Derived extends Base {

    public Derived() {
        super(3);
        System.out.println("Derived constructor");
    }

    public Derived(int a) {
        this();
        System.out.println("Derived constructor with parameters");
    }

    public static void main(String[] args) {
        Derived d = new Derived(3);
    }
}
