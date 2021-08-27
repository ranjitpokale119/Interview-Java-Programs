package com.Java7.polymorphism;

import java.io.IOException;

class A {
    void m1() {
        System.out.println("In A M1");
        throw new ArithmeticException();
    }

    void m3() throws RuntimeException {
        System.out.println("In A M3");
    }
}

class B extends A {
    void m1() throws RuntimeException {
        /*If the superclass method does not declare an exception,
        subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
         */
        System.out.println("In B M1");
    }

    void m3() throws ArrayIndexOutOfBoundsException {
        /*
        If the superclass method declares an exception,
        subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
        */
        System.out.println("In B M3");
    }

    void m2() {
        System.out.println("In B M2");
    }
}

public class PolyExample {
    public static void main(String[] args) {
        A a = new B();
        a.m1();
    }
}
